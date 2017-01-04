package in.syam.codesearch;

import java.io.IOException;
import java.nio.file.Path;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableListMultimap;
import org.antlr.v4.runtime.Token;
import com.google.common.io.Files;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.common.hash.Hashing;

public class Document {
    private final String content;
    private final String filename;
    private final String repository;
    private final String language;
    private final String id;
    private ImmutableListMultimap<String, Token> tokens;
    private ImmutableListMultimap<String, String> features;

    private static final TypeAdapter<Document> ADAPTER = new TypeAdapter<Document>() {
        @Override
        public void write(JsonWriter writer, Document doc) throws IOException {
            writer.beginObject();
            writer.name("filename").value(doc.getFilename());
            writer.name("content").value(doc.getContent());
            writer.name("repository").value(doc.getRepository());
            writer.name("language").value(doc.getLanguage());
            ImmutableListMultimap<String, Token> tokens = doc.getTokens();
            writer.name("tokens");
            writer.beginArray();
            for (final String type : tokens.keySet()) {
                for (final Token t : tokens.get(type)) {
                    writer.beginObject();
                    writer.name("text").value(t.getText());
                    writer.name("line").value(t.getLine());
                    writer.name("char").value(t.getCharPositionInLine());
                    writer.name("type").value(type);
                    writer.endObject();
                }
            }
            writer.endArray();
            writer.endObject();
        }

        @Override
        public Document read(JsonReader reader) throws IOException {
            throw new UnsupportedOperationException("Not implemented: Document should never be loaded from JSON");
        }
    };

    public Document(Path path, String repo, String lang) throws IOException {
        content = Files.toString(path.toFile(), Charsets.UTF_8);
        filename = path.toString();
        id = Hashing.sha1().hashString(content, Charsets.UTF_8).toString();
        repository = repo;
        language = lang;
        features = ImmutableListMultimap.of();
        tokens = ImmutableListMultimap.of();
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getFilename() {
        return filename;
    }

    public String getRepository() {
        return repository;
    }

    public String getLanguage() {
        return language;
    }

    public ImmutableListMultimap<String, Token> getTokens() {
        return tokens;
    }

    public ImmutableListMultimap<String, String> getFeatures() {
        return features;
    }

    public void setTokens(ImmutableListMultimap<String, Token> tokens) {
        this.tokens = tokens;
    }

    public void setFeatures(ImmutableListMultimap<String, String> features) {
        this.features = features;
    }

    public String toJson() {
        return ADAPTER.toJson(this);
    }
}
