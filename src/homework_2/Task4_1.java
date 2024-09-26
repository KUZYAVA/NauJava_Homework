package homework_2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Task4_1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/ip"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper objectMapper = new ObjectMapper();
        OriginResponse originResponse = objectMapper.readValue(response.body(), OriginResponse.class);
        System.out.println("Origin: " + originResponse.getOrigin());
    }
}

class OriginResponse {
    private String origin;

    public OriginResponse() {
    }

    public OriginResponse(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }
}
