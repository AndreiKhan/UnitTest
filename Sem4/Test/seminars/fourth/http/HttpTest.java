package seminars.fourth.http;

import org.junit.jupiter.api.Test;
import seminars.fourth.book.Book;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class HttpTest {

    @Test
    void httpTest() {
        HttpClient httpClient = mock(HttpClient.class);
        WebService webService = new WebService(httpClient);
        when(webService.sendRequest("some url")).thenReturn("some url data from website");

        String result = webService.sendRequest("some url");

        verify(httpClient).get("some url");
    }
}
