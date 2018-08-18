package yokv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FooController {
    private static final Logger LOGGER = LoggerFactory.getLogger(FooController.class);

    @GetMapping("/foo")
    public String foo() {
        String value = String.valueOf(LocalDateTime.now());
        LOGGER.info("APP-B: {}", value);
        return value;
    }
}

