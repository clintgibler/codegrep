package in.syam.codesearch;

import in.syam.codesearch.Document;

import java.io.IOException;
import java.nio.file.Path;

import com.google.common.collect.ImmutableListMultimap;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import grammars.java.*;

public final class JavaDocument extends Document {
    private static ImmutableListMultimap<String, Token> extractTokens(JavaLexer lexer) {
        Vocabulary v = lexer.getVocabulary();
        ImmutableListMultimap.Builder<String, Token> tokens = ImmutableListMultimap.builder();
        for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()) {
            String name = v.getSymbolicName(token.getType());
            if (name != null && name.equals("Identifier")) {
                tokens.put("identifier", token);
            }
        }
        return tokens.build();
    }

    private static ImmutableListMultimap<String, String> extractFeatures(JavaLexer lexer) {
        ImmutableListMultimap.Builder<String, String> features = ImmutableListMultimap.builder();
        JavaParser parser = new JavaParser(new CommonTokenStream(lexer));
        ParseTreeWalker.DEFAULT.walk(new JavaBaseListener() {
            @Override
            public void enterVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx) {
                if (ctx.Identifier() != null) {
                    features.put("Variable", ctx.Identifier().getText());
                }
            }

            @Override
            public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
                if (ctx.Identifier() != null) {
                    features.put("Method", ctx.Identifier().getText());
                }
            }
        }, parser.compilationUnit());
        return features.build();
    }

    public JavaDocument(Path path, String repository, String lang) throws IOException {
        super(path, repository, lang);
        ANTLRInputStream input = new ANTLRInputStream(super.getContent());
        JavaLexer lexer = new JavaLexer(input)
         super.setTokens(extractTokens(lexer));
   }
}