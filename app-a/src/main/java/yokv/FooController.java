package yokv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

@RestController
public class FooController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/foo")
    public String foo() throws UnknownHostException {
        String value = restTemplate.getForEntity("http://APP-B/foo", String.class).getBody();
        return "  APP-A:  " + InetAddress.getLocalHost().getHostAddress() + value;
    }
}

