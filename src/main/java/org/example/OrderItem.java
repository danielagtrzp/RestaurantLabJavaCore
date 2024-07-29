package org.example;

public class OrderItem {
    private Integer id;
    private Integer menuItemId;
    private Integer quantity;
    private static int count=0;

    public OrderItem( Integer menuItemId) {
        this.id = count++;
        this.menuItemId = menuItemId;
        this.quantity = 1;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(Integer menuItemId) {
        this.menuItemId = menuItemId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", menuItemId=" + menuItemId +
                ", quantity=" + quantity +
                '}';
    }
}
