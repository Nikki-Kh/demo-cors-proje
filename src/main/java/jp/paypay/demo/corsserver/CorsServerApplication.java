package jp.paypay.demo.corsserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan({"jp.paypay.demo.corsserver.controller"})
@ComponentScan({"jp.paypay.demo.corsserver.filter"})
@ComponentScan({"jp.paypay.demo.corsserver.repository"})
@ComponentScan({"jp.paypay.demo.corsserver.model"})
public class CorsServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CorsServerApplication.class, args);
    }

    @RequestMapping(value = "/hello")
    public String hello() {
        return "Hello duniya";
    }

}
