package jp.paypay.demo.corsserver.controller;

import jp.paypay.demo.corsserver.service.CorsDomainService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController("/")
public class CorsServerController {

    @Autowired
    CorsDomainService service;

    @GetMapping("/cors-enabled")
    public String returnOkStringFromCorsRequest() {
        return "ok";
    }

    @PostMapping("/cors-disabled")
    public String getErrorFromCorsRequest() {
        return "ok";
    }

    @PostMapping("/add_cors_domain")
    public void addCorsDomain(@RequestParam("domain") String domain) {
        service.insertNewDomain(domain);
    }

}
