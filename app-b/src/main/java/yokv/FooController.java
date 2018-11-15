package yokv;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

@RestController
public class FooController {
    @GetMapping("/foo")
    public String foo() throws UnknownHostException {
        return "  APP-B:  " + InetAddress.getLocalHost().getHostAddress() + LocalDateTime.now();
    }
}

