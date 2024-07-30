package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Menu {
    private Integer id;
    private Integer restaurantId;
    private List<MenuItem> menuItems;
    private static int count=0;
    public Menu(Integer restaurantId) {
        this.id = count++;
        this.restaurantId = restaurantId;
        this.menuItems = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    //add menu items
    public void add(MenuItem menuItem){
        menuItems.add(menuItem);
    }

    //delete Menu Item by Id
    public void delete(Integer id){
        menuItems = menuItems.stream().filter(item-> !Objects.equals(item.getId(), id)).toList();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", restaurantId=" + restaurantId +
                ", menuItems=" + menuItems +
                '}';
    }
}
