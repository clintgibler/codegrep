package in.syam.codesearch;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.stream.Stream;

<<<<<<< HEAD
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.google.common.base.Charsets;

=======
>>>>>>> aa5c7f7... basic proof of concept implementation
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
<<<<<<< HEAD

import grammars.java.JavaLexer;
import grammars.java.JavaParser;
import grammars.java.JavaBaseListener;

import grammars.golang.GolangLexer;
import grammars.golang.GolangParser;
import grammars.golang.GolangBaseListener;
import org.apache.commons.io.FilenameUtils;

public class App
{

    private static class CodeDocument {
        public String content;
        public String filename;
        public List<String> methods = new ArrayList<String>();
    }

=======
public final class App
{
>>>>>>> aa5c7f7... basic proof of concept implementation
    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static final OkHttpClient client = new OkHttpClient();

    private static String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
            .url(url)
            .post(body)
            .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
<<<<<<< HEAD

=======
>>>>>>> aa5c7f7... basic proof of concept implementation
    }

    public static void main( String[] args )
    {
<<<<<<< HEAD
        try (Stream<Path> paths = Files.walk(Paths.get(args[0]))) {
            paths.forEach(path -> processFile(path));
=======
        String repository = args[0];
        try (Stream<Path> paths = Files.walk(Paths.get(args[1]))) {
            paths.forEach(path -> processFile(path.normalize(), repository));
>>>>>>> aa5c7f7... basic proof of concept implementation
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

<<<<<<< HEAD
    private static void processFile(java.nio.file.Path path) {
    	if (Files.isRegularFile(path) == false)
            return;
        String fileExtension = FilenameUtils.getExtension(path.getFileName().toString());
        if(fileExtension.equals("java"))
            processJavaFile(path);
        if(fileExtension.equals("go"))
            processGolangFile(path);
    }

    private static void processJavaFile(java.nio.file.Path path) {
        try {
	    FileInputStream is = new FileInputStream(path.toString());

            // Create a json document that can be indexed by elasticsearch
            CodeDocument doc = new CodeDocument();
            doc.content = com.google.common.io.Files.toString(path.toFile(), Charsets.UTF_8);
            doc.filename = path.toString();

 	    // Extract some interesting data
            ANTLRInputStream input = new ANTLRInputStream(is);
            JavaLexer lexer = new JavaLexer(input);
            JavaParser parser = new JavaParser(new CommonTokenStream(lexer));
            final List<String> methods = new ArrayList<String>();
            ParseTreeWalker.DEFAULT.walk(new JavaBaseListener(){
                @Override
                public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
                    if (ctx.Identifier() != null) {
                        methods.add(ctx.Identifier().getText());
                    }
                }
            }, parser.compilationUnit());
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            doc.methods = methods;
            post("http://localhost:9200/codesearch/code",gson.toJson(doc));
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static void processGolangFile(java.nio.file.Path path) {
        try {
	    FileInputStream is = new FileInputStream(path.toString());

            // Create a json document that can be indexed by elasticsearch
            CodeDocument doc = new CodeDocument();
            doc.content = com.google.common.io.Files.toString(path.toFile(), Charsets.UTF_8);
            doc.filename = path.toString();

 	    // Extract some interesting data
            ANTLRInputStream input = new ANTLRInputStream(is);
            GolangLexer lexer = new GolangLexer(input);
            GolangParser parser = new GolangParser(new CommonTokenStream(lexer));
            final List<String> methods = new ArrayList<String>();
            ParseTreeWalker.DEFAULT.walk(new GolangBaseListener(){
                @Override
                public void enterMethodDecl(GolangParser.MethodDeclContext ctx) {
                    if (ctx.IDENTIFIER() != null) {
                        methods.add(ctx.IDENTIFIER().getText());
                    }
                }
            }, parser.sourceFile());
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            doc.methods = methods;
            post("http://localhost:9200/codesearch/code",gson.toJson(doc));
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

=======
    private static void processFile(java.nio.file.Path path, String repository) {
            if (path.toString().contains(".git/")) {
                //System.out.println("Skipping " + path.toString());
                return;
            }
            if (!Files.isRegularFile(path)) {
                //System.out.println("Skipping " + path.toString());
                return;
            }
            try {
                Document d = DocumentFactory.createDocument(path, repository);
                post("http://localhost:9200/codesearch/code/" + d.getId() , d.toJson());
            }
            catch (IOException e) {
                System.out.println(e);
            }
            catch (UnsupportedOperationException e) {
                System.out.println("Path: " + path + " Exception:" + e);
            }
    }
>>>>>>> aa5c7f7... basic proof of concept implementation
}
