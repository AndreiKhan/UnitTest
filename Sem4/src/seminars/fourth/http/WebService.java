package seminars.fourth.http;

public class WebService {
    private HttpClient httpClient;

    public WebService(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public String sendRequest(String url) {

        String result = httpClient.get(url);

        return result;
    }
}
