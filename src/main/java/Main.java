import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class Main {
    public static final ObjectMapper mapper = new ObjectMapper();
    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectTimeout(5000)
                        .setSocketTimeout(30000)
                        .setRedirectsEnabled(false)
                        .build())
                .build();
        HttpGet request = new HttpGet("https://api.nasa.gov/planetary/apod?api_key=RYqGOX6AOgTI8HHOou3l9LIyJG6s0xORcb1NZ4rx");
        CloseableHttpResponse response = httpClient.execute(request);
        NasaObject nasaObject = mapper.readValue(response.getEntity().getContent(), NasaObject.class);
        HttpGet requestImage = new HttpGet(nasaObject.getUrl());
        CloseableHttpResponse pictureResponse = httpClient.execute(requestImage);
        File resultDir = new File("C://resultDir");
        File resultFile = new File(resultDir, nasaObject.getUrl().substring(38)); //Обрезал для названия каритнки строку до имени файла
        if (resultDir.mkdirs() && resultFile.createNewFile()) {
        }
        try(FileOutputStream fos = new FileOutputStream("C://resultDir/" + nasaObject.getUrl().substring(38))) {
            fos.write(pictureResponse.getEntity().getContent().readAllBytes());
        }
    }
}
