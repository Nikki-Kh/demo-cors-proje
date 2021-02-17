package jp.paypay.demo.corsserver.configuration;

import jp.paypay.demo.corsserver.filter.CustomCorsFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CorsConfiguration {

    @Autowired
    CustomCorsFilter customCorsFilter;

    @Bean
    public FilterRegistrationBean<CustomCorsFilter> filterRegistrationBean() {
        FilterRegistrationBean<CustomCorsFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(customCorsFilter);
        registrationBean.addUrlPatterns("/cors-enabled");
        return registrationBean;
    }
}
