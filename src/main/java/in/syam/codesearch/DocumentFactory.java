package in.syam.codesearch;

import java.nio.file.Files;
import java.io.IOException;
import java.io.FileInputStream;
import org.apache.commons.io.FilenameUtils;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.Tika;

public class DocumentFactory {
    public static Document createDocument(java.nio.file.Path path, String repository) throws IOException {
        Document d;
        if (Files.isRegularFile(path) == false) {
            throw new UnsupportedOperationException();
        }
        String fileExtension = FilenameUtils.getExtension(path.getFileName().toString());
        Tika detector = new Tika();
        String mtype = detector.detect(new FileInputStream(path.toString()), new Metadata());
        switch (fileExtension) {
        case "java":
            return new JavaDocument(path, repository, "java");
        case "go":
            return new GolangDocument(path, repository, "go");
        case "c":
        case "h":
            return new CDocument(path, repository, "c");
        case "cpp":
            return new Document(path, repository, "c++");
        case "js":
            return new Document(path, repository, "javascript");
        case "coffee":
            return new Document(path, repository, "coffeescript");
        case "md":
            return new Document(path, repository, "markdown");
        case "pl":
        case "pm":
            return new Document(path, repository, "perl");
        case "rb":
            return new Document(path, repository, "ruby");
        case "py":
            return new Document(path, repository, "python");
        case "txt":
            return new Document(path, repository, "textfile");
        case "htm":
        case "html":
            return new Document(path, repository, "html");
        case "css":
            return new Document(path, repository, "css");
        case "sass":
            return new Document(path, repository, "sass");
        default:
            if (mtype != "text/plain") {
                throw new UnsupportedOperationException();
            }
            return new Document(path, repository, "textfile");
        }
    }
}
