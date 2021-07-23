package org.klukasz.dto;

import java.time.LocalDateTime;

public class OrderDTO {
    private Long id;
    private String customerCode;
    private String orderNumber;
    private LocalDateTime orderDateTime;

    public OrderDTO() {

    }

    public OrderDTO(Long id, String customerCode, String orderNumber, LocalDateTime orderDateTime) {
        this.id = id;
        this.setCustomerCode(customerCode);
        this.setOrderNumber(orderNumber);
        this.setOrderDateTime(orderDateTime);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    public void setOrderDateTime(LocalDateTime orderDateTime) {
        this.orderDateTime = orderDateTime;
    }
}
