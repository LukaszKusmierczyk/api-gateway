package org.klukasz.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Value("${ORDER_SERVICE_URL}")
    private String orderServiceUrl;

    @Value("${CUSTOMER_SERVICE_URL}")
    private String customerServiceUrl;

    @Bean
    public RestTemplate orderService(RestTemplateBuilder builder) {
        return builder.rootUri(orderServiceUrl).build();
    }

    @Bean
    public RestTemplate customerService(RestTemplateBuilder builder) {
        return builder.rootUri(customerServiceUrl).build();
    }
}
