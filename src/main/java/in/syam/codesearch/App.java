package in.syam.codesearch;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.stream.Stream;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
public final class App
{
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
    }

    public static void main( String[] args )
    {
        String repository = args[0];
        try (Stream<Path> paths = Files.walk(Paths.get(args[1]))) {
            paths.forEach(path -> processFile(path.normalize(), repository));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
}
