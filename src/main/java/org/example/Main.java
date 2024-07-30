package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Restaurant gourmetCorner = new Restaurant("Gourmet Corner");
        Restaurant tableForTwo = new Restaurant("Table for Two");

        gourmetCorner.getMenu().getMenuItems()
                .add(new MenuItem(gourmetCorner.getMenu().getId(), "Steak Frites", "Perfectly seasoned steak with crispy fries", 18.75));
        gourmetCorner.getMenu().getMenuItems()
                .add(new MenuItem(gourmetCorner.getMenu().getId(), "Caesar Salad", "Crisp romaine lettuce with Caesar dressing", 9.50));
        gourmetCorner.getMenu().getMenuItems()
                .add(new MenuItem(gourmetCorner.getMenu().getId(), "Lemonade", "Freshly squeezed lemonade", 3.50));
        gourmetCorner.getMenu().getMenuItems()
                .add(new MenuItem(gourmetCorner.getMenu().getId(), "Grilled Salmon", "Grilled wild salmon with a lemon butter sauce", 15.95));
        gourmetCorner.getMenu().getMenuItems()
                .add(new MenuItem(gourmetCorner.getMenu().getId(), "Risotto", "Creamy risotto with wild mushrooms", 11.00));
        gourmetCorner.getMenu().getMenuItems()
                .add(new MenuItem(gourmetCorner.getMenu().getId(), "Tiramisu", "Classic Italian dessert", 6.50));
        gourmetCorner.getMenu().getMenuItems()
                .add(new MenuItem(gourmetCorner.getMenu().getId(), "Pasta Carbonara", "Pasta with creamy sauce and pancetta", 12.75));
        gourmetCorner.getMenu().getMenuItems()
                .add(new MenuItem(gourmetCorner.getMenu().getId(), "Margarita Pizza", "Tomato, basil, and fresh mozzarella", 10.50));
        gourmetCorner.getMenu().getMenuItems()
                .add(new MenuItem(gourmetCorner.getMenu().getId(), "Apple Pie", "Homemade apple pie with cinnamon", 5.00));
        gourmetCorner.getMenu().getMenuItems()
                .add(new MenuItem(gourmetCorner.getMenu().getId(), "Iced Tea", "Refreshing iced tea with a hint of lemon", 2.50));

        tableForTwo.getMenu().getMenuItems()
                .add(new MenuItem(tableForTwo.getMenu().getId(), "Lobster Bisque", "Rich and creamy lobster soup", 22.00));
        tableForTwo.getMenu().getMenuItems()
                .add(new MenuItem(tableForTwo.getMenu().getId(), "Duck Confit", "Slow-cooked duck in its own fat", 27.50));
        tableForTwo.getMenu().getMenuItems()
                .add(new MenuItem(tableForTwo.getMenu().getId(), "Molten Chocolate Cake", "Decadent chocolate cake with a gooey center", 9.00));
        tableForTwo.getMenu().getMenuItems()
                .add(new MenuItem(tableForTwo.getMenu().getId(), "Filet Mignon", "Tender beef steak with peppercorn sauce", 31.00));
        tableForTwo.getMenu().getMenuItems()
                .add(new MenuItem(tableForTwo.getMenu().getId(), "Caesar Salad", "Crisp romaine lettuce with Caesar dressing and croutons", 12.00));

        Set<User> usersGourmetCorner= Set.of(
            new User("John Doe", "johndoe", "johndoe@example.com"),
            new User("Jane Smith", "janesmith", "janesmith@example.com"),
            new User("Alice Johnson", "alicej", "alicej@example.com"),
            new User("Bob Brown", "bobbrown", "bobbrown@example.com"),
            new User("Charlie Davis", "charlied", "charlied@example.com"),
            new User("Daisy Adams", "daisyadams", "daisy@example.com"),
            new User("Ethan Hill", "ethanhill", "ethan.hill@example.com"),
            new User("Fiona Clark", "fionaclark", "fiona.clark@example.com"),
            new User("George Wright", "georgew", "george.wright@example.com"),
            new User("Hannah Scott", "hannahscott", "hannah.scott@example.com")
        );

        Set<User> usersTableForTwo = Set.of(
                new User("Emily Rose", "emilyr", "emily.rose@example.com"),
                new User("Michael Bay", "michaelb", "michael.bay@example.com"),
                new User("Sophia Loren", "sophial", "sophia.loren@example.com"),
                new User("Lucas Grey", "lucasg", "lucas.grey@example.com"),
                new User("Olivia Wilde", "oliviaw", "olivia.wilde@example.com")
        );



        gourmetCorner.getOrders().add(
                new Order(1,gourmetCorner.getId(),
                        List.of( new OrderItem(1),
                                new OrderItem(2),
                                new OrderItem(3))
                ));

        gourmetCorner.getOrders().add(
                new Order(2,gourmetCorner.getId(),
                        List.of( new OrderItem(4),
                                new OrderItem(5),
                                new OrderItem(6))
                )
        );
        gourmetCorner.getOrders().add(
                new Order(3,gourmetCorner.getId(),
                        List.of( new OrderItem(7),
                                new OrderItem(8),
                                new OrderItem(9))
                )
        );

        tableForTwo.getOrders().add(
                new Order(1, tableForTwo.getId(),
                        List.of(new OrderItem(1),
                                new OrderItem(2)))
        );

        tableForTwo.getOrders().add(
                new Order(2, tableForTwo.getId(),
                        List.of(new OrderItem(3),
                                new OrderItem(4)))
        );

        tableForTwo.getOrders().add(
                new Order(3, tableForTwo.getId(),
                        List.of(new OrderItem(5)))
        );

    }
}