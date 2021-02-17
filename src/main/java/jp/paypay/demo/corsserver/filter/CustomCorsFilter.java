package jp.paypay.demo.corsserver.filter;

import jp.paypay.demo.corsserver.model.CorsDomainDto;
import jp.paypay.demo.corsserver.service.CorsDomainService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CustomCorsFilter implements Filter {

    CorsDomainService corsDomainService;

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        String origin = request.getHeader("Origin");
        if (origin != null &&
                corsDomainService.getCorsDomainDtos()
                        .stream()
                        .anyMatch(it -> it.getDomainName().equals(origin))) {
            response.setHeader("Access-Control-Allow-Origin", "origin");
            response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
            response.setHeader("Access-Control-Max-Age", "3600");
            response.setHeader("Access-Control-Allow-Headers", "authorization, content-type, xsrf-token");
            response.addHeader("Access-Control-Expose-Headers", "xsrf-token");
        }
        chain.doFilter(req, response);
    }
}
