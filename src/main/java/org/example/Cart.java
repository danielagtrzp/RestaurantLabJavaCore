package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private Integer id;
    private Integer userId;
    private List<OrderItem> orderItems;
    private static int count=0;
    public Cart(Integer userId) {
        this.id = count++;
        this.userId = userId;
        this.orderItems = new ArrayList<>();
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

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", userId=" + userId +
                ", orderItems=" + orderItems +
                '}';
    }
}
