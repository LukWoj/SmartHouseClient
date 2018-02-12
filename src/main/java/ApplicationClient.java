import org.springframework.web.client.RestTemplate;

public class ApplicationClient {



    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        String quote = restTemplate.getForObject("http://localhost:8080/print", String.class);
        System.out.println(quote);
    }
}