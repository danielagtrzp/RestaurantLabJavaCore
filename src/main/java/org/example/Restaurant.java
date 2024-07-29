package org.example;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Restaurant {
    private Integer id;
    private String name;
    private Menu menu;
    private Queue<Order> orders;
    private Set<User> users;

    private static int count=0;

    public Restaurant(String name) {
        this.id = count++;
        this.name = name;
        this.menu = new Menu(this.id);
        this.orders = new LinkedList<>();
        this.users = new HashSet<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Queue<Order> getOrders() {
        return orders;
    }

    public void setOrders(Queue<Order> orders) {
        this.orders = orders;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", menu=" + menu +
                ", orders=" + orders +
                ", users=" + users +
                '}';
    }
}
