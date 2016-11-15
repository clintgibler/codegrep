package in.syam.codesearch;

import in.syam.codesearch.Document;

import java.io.IOException;
import java.nio.file.Path;

import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableSet;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import grammars.java.*;

public final class JavaDocument extends Document {
    private static void addToken(TerminalNode n, ImmutableSet.Builder<ComparableToken> seen,
            ImmutableListMultimap.Builder<String, Token> tokens, String name) {
        if (n != null) {

            Token t = n.getSymbol();
            seen.add(new ComparableToken(t));
            tokens.put(name, t);
        }
    }

    private static ImmutableListMultimap<String, Token> extractTokens(JavaLexer lexer) {
        ImmutableListMultimap.Builder<String, Token> tokens = ImmutableListMultimap.builder();
        ImmutableSet.Builder<ComparableToken> seen = ImmutableSet.builder();

        Vocabulary v = lexer.getVocabulary();
        JavaParser parser = new JavaParser(new CommonTokenStream(lexer));

        ParseTreeWalker.DEFAULT.walk(new JavaBaseListener() {
            @Override
            public void enterPackageDeclaration(JavaParser.PackageDeclarationContext ctx) {
                if (ctx.qualifiedName() != null) {
                    for (TerminalNode id : ctx.qualifiedName().Identifier()) {
                        addToken(id, seen, tokens, "package");
                    }
                }
            }

            @Override
            public void enterImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
                if (ctx.qualifiedName() != null) {
                    for (TerminalNode id : ctx.qualifiedName().Identifier()) {
                        addToken(id, seen, tokens, "import");
                    }
                }
            }

            @Override
            public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
                addToken(ctx.Identifier(), seen, tokens, "class");
            }

            @Override
            public void enterEnumDeclaration(JavaParser.EnumDeclarationContext ctx) {
                addToken(ctx.Identifier(), seen, tokens, "enum");
            }

            @Override
            public void enterInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx) {
                addToken(ctx.Identifier(), seen, tokens, "interface");
            }

            @Override
            public void enterAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx) {
                addToken(ctx.Identifier(), seen, tokens, "annotationtype");
            }

            @Override
            public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
                addToken(ctx.Identifier(), seen, tokens, "method");
            }

            @Override
            public void enterGenericMethodDeclaration(JavaParser.GenericMethodDeclarationContext ctx) {
                if( ctx.methodDeclaration() != null) {
                    addToken(ctx.methodDeclaration().Identifier(), seen, tokens, "method");
                }
            }

            @Override
            public void enterVariableDeclaratorId(JavaParser.VariableDeclaratorIdContext ctx) {
                addToken(ctx.Identifier(), seen, tokens, "variable");
            }

            @Override
            public void enterAnnotationName(JavaParser.AnnotationNameContext ctx) {
                if (ctx.qualifiedName() != null) {
                    for (TerminalNode id : ctx.qualifiedName().Identifier()) {
                        addToken(id, seen, tokens, "annotation");
                    }
                }
            }

        }, parser.compilationUnit());

        ImmutableSet<ComparableToken> saw = seen.build();
        // Extract all other identifiers
        lexer.reset();
        for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()) {
            String name = v.getSymbolicName(token.getType());
            if (name != null && name.equals("Identifier")) {
                if (!saw.contains(new ComparableToken(token))) {
                    tokens.put("identifier", token);
                }
            }
        }
        return tokens.build();
    }

    public JavaDocument(Path path, String repository, String lang) throws IOException {
        super(path, repository, lang);
        ANTLRInputStream input = new ANTLRInputStream(super.getContent());
        JavaLexer lexer = new JavaLexer(input);
        super.setTokens(extractTokens(lexer));
    }
}