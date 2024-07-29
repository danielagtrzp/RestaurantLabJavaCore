package org.example;

public class User {
    private Integer id;
    private String name;
    private String userName;
    private String email;
    private Cart cart;
    private static int count=0;
    public User(String name, String userName, String email) {
        this.id = count++;
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.cart = new Cart(this.id);
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", cart=" + cart +
                '}';
    }
}
