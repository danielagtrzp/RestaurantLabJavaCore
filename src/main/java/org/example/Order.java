package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Integer id;
    private Integer userId;
    private Integer restaurantId;
    private List<OrderItem> orderItems;
    private Status status;
    private Double totalAmount;

    private static int count=0;
    public Order( Integer userId, Integer restaurantId, List<OrderItem> orderItems) {
        this.id = count++;
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.orderItems = orderItems;
        this.status = Status.received;
        this.totalAmount = 0.0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", restaurantId=" + restaurantId +
                ", orderItems=" + orderItems +
                ", status=" + status +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
