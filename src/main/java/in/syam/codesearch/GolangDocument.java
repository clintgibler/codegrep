package in.syam.codesearch;

import in.syam.codesearch.Document;
import in.syam.codesearch.ComparableToken;

import java.io.IOException;
import java.nio.file.Path;

import com.google.common.collect.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import grammars.golang.*;


/*
Some ideas from go guru:
Where is this identifier declared?
- extract all tokens - done
Where are all the references to this declaration?
What are the fields and methods of this this expression?
What is the API of this package?
Which concrete types implement this interface?
What are the possible callees of this dynamic call?
What are the possible callers of this function?
Where might a value sent on this channel be received?
*/

public final class GolangDocument extends Document {
   private static ImmutableListMultimap<String, Token> extractTokens(Lexer lexer) {
        ImmutableListMultimap.Builder<String, Token> tokens = ImmutableListMultimap.builder();
        ImmutableSet.Builder<ComparableToken> seen = ImmutableSet.builder();

        Vocabulary v = lexer.getVocabulary();
        GolangParser parser = new GolangParser(new CommonTokenStream(lexer));

        ParseTreeWalker.DEFAULT.walk(new GolangBaseListener() {
            @Override
            public void enterMethodDecl(GolangParser.MethodDeclContext ctx) {
                if (ctx.IDENTIFIER() != null) {
                    Token t = ctx.IDENTIFIER().getSymbol();
                    seen.add(new ComparableToken(t));
                    tokens.put("method", t);
                }
            }

            @Override
            public void enterFunctionDecl(GolangParser.FunctionDeclContext ctx) {
                if(ctx.IDENTIFIER() != null) {
                    Token t = ctx.IDENTIFIER().getSymbol();
                    seen.add(new ComparableToken(t));
                    tokens.put("function", t);
                }
            }

            @Override
            public void enterTypeDecl(GolangParser.TypeDeclContext ctx) {
                for(GolangParser.TypeSpecContext spec: ctx.typeSpec()) {
                    if(spec.IDENTIFIER() != null) {
                        Token t = spec.IDENTIFIER().getSymbol();
                        seen.add(new ComparableToken(t));
                        tokens.put("type", t);
                    }
                }
            }

            // go allows two ways to declare a variable. a short form such as x := and var x 
            @Override
            public void enterShortVarDecl(GolangParser.ShortVarDeclContext ctx) {
                GolangParser.IdentifierListContext i = ctx.identifierList();
                    for(TerminalNode id: i.IDENTIFIER()) {
                        Token t = id.getSymbol();
                        seen.add(new ComparableToken(t));
                        tokens.put("variable", t);
                    }
            }

            @Override
            public void enterVarDecl(GolangParser.VarDeclContext ctx) {
                for(GolangParser.VarSpecContext x: ctx.varSpec()) {
                    GolangParser.IdentifierListContext i = x.identifierList();
                    for(TerminalNode id: i.IDENTIFIER()) {
                        Token t = id.getSymbol();
                        seen.add(new ComparableToken(t));
                        tokens.put("variable", t);
                    }
                }
            }

            @Override
            public void enterFieldDecl(GolangParser.FieldDeclContext ctx) {
                    GolangParser.IdentifierListContext i = ctx.identifierList();
                    if (i == null)
                        return;
                    for(TerminalNode id: i.IDENTIFIER()) {
                        if (id == null)
                            continue;
                        Token t = id.getSymbol();
                        seen.add(new ComparableToken(t));
                        tokens.put("field", t);
                    }
            }

            @Override
            public void enterImportPath(GolangParser.ImportPathContext ctx) {
                Token t = ctx.STRING_LIT().getSymbol();
                seen.add(new ComparableToken(t));
                tokens.put("import", t);
            }

        }, parser.sourceFile());

        

        ImmutableSet<ComparableToken> saw = seen.build();
        // Extract all other identifiers
        lexer.reset();
        for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()) {
            String name = v.getSymbolicName(token.getType());
            if (name != null && name.equals("IDENTIFIER")) {
                if(! saw.contains(new ComparableToken(token))) {
                    tokens.put("identifier", token);
                }
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
