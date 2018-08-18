package yokv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * CREATE BY Yo ON 2018/1/26 20:26
 */
@RestController
public class FooController {
    private static final Logger LOGGER = LoggerFactory.getLogger(FooController.class);

    @GetMapping("/foo")
    public String getApplicationName() {
        String value = String.valueOf(LocalDateTime.now());
        LOGGER.info("APP-B: {}", value);
        return value;
    }
}

