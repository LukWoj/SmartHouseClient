import org.springframework.web.client.RestTemplate;

public class ApplicationClient {

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        String quote = restTemplate.postForObject("http://localhost:8080/print?toPrint=Please print test page on LG printer", null, String.class);
        System.out.println(quote);
    }
}
