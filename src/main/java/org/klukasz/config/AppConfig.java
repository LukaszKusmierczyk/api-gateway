package org.klukasz.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Value("${ORDER_SERVICE_URL}")
    private String orderServiceUrl;

    @Value("${CUSTOMER_SERVICE_URL}")
    private String customerServiceUrl;

    @Bean
    public RestTemplate orderService(RestTemplateBuilder builder) {
        RestTemplate restTemplate = builder.rootUri(orderServiceUrl).build();
        addInterceptors(restTemplate);

        return restTemplate;
    }

    @Bean
    public RestTemplate customerService(RestTemplateBuilder builder) {
        RestTemplate restTemplate = builder.rootUri(customerServiceUrl).build();
        addInterceptors(restTemplate);

        return restTemplate;
    }

    private void addInterceptors(RestTemplate restTemplate) {
        List<ClientHttpRequestInterceptor> interceptors
                = restTemplate.getInterceptors();
        if (CollectionUtils.isEmpty(interceptors)) {
            interceptors = new ArrayList<>();
        }
        interceptors.add(new RestTemplateHeaderModifierInterceptor());
        restTemplate.setInterceptors(interceptors);
    }
}
