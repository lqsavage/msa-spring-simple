package yokv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@EnableScheduling
public class FooTask {
    private static final Logger LOGGER = LoggerFactory.getLogger(FooTask.class);

    @Autowired
    private RestTemplate restTemplate;

    @Scheduled(fixedRate = 5000)
    public void send() {

        String str = restTemplate.getForEntity("http://APP-B/foo", String.class).getBody();
        LOGGER.info("APP-A: {}", str);
    }

}

