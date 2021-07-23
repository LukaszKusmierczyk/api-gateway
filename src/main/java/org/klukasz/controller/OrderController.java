package org.klukasz.controller;

import org.klukasz.dto.OrderDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/order")
public class OrderController {

    private final RestTemplate orderService;

    public OrderController(RestTemplate orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public OrderDTO[] getOrders() {
        return orderService.getForEntity("/", OrderDTO[].class).getBody();
    }
}
