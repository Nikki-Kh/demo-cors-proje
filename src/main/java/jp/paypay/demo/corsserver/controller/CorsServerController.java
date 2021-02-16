package jp.paypay.demo.corsserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController("/")
public class CorsServerController {

    private static final Logger logger = LoggerFactory.getLogger(CorsServerController.class);

    @GetMapping("/cors-enabled")
    public String returnOkStringFromCorsRequest() {
        return "ok";
    }

    @PostMapping("cors-disabled")
    public String getErrorFromCorsRequest() {
        return "ok";
    }
}
