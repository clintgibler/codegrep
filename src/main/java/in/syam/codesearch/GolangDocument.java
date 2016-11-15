package in.syam.codesearch;

import in.syam.codesearch.Document;

import java.io.IOException;
import java.nio.file.Path;

import com.google.common.collect.ImmutableListMultimap;

import org.antlr.v4.runtime.*;

import grammars.golang.*;

public final class GolangDocument extends Document {
    private static ImmutableListMultimap<String, Token> extractTokens(Lexer lexer) {
        ImmutableListMultimap.Builder<String, Token> tokens = ImmutableListMultimap.builder();
        Vocabulary v = lexer.getVocabulary();
        // Extract all identifiers
        for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()) {
            String name = v.getSymbolicName(token.getType());
            if (name != null && name.equals("IDENTIFIER")) {
                tokens.put("identifier", token);
            }
        }
        return tokens.build();
    }

    public GolangDocument(Path path, String repository, String lang) throws IOException {
        super(path, repository, lang);
        ANTLRInputStream input = new ANTLRInputStream(super.getContent());
        GolangLexer lexer = new GolangLexer(input);
        super.setTokens(extractTokens(lexer));
    }
}