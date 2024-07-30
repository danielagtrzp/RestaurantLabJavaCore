package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Main {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Restaurant gourmetCorner = new Restaurant("Gourmet Corner");
        Restaurant tableForTwo = new Restaurant("Table for Two");

        List<Restaurant> restaurants = List.of(
                gourmetCorner,
                tableForTwo
        );

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

        gourmetCorner.getUsers().addAll(Set.of(
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
        ));

        tableForTwo.getUsers().addAll(Set.of(
                new User("Emily Rose", "emilyr", "emily.rose@example.com"),
                new User("Michael Bay", "michaelb", "michael.bay@example.com"),
                new User("Sophia Loren", "sophial", "sophia.loren@example.com"),
                new User("Lucas Grey", "lucasg", "lucas.grey@example.com"),
                new User("Olivia Wilde", "oliviaw", "olivia.wilde@example.com")
        ));



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

        showMainPage(restaurants);
        bufferedReader.close();
    }

    private static void showMainPage(List<Restaurant> restaurants) throws IOException {
        System.out.println("Welcome, how can we help you today?");

        System.out.println("a. Create user.");
        System.out.println("b. List users by restaurant Id.");
        System.out.println("c. Show orders by restaurant id.");
        System.out.println("d. Show orders by status");
        System.out.println("e. Show orders by users id.");
        System.out.println("f. Show the menu by restaurant id.");
        System.out.println("g. Add Menu Item to a restaurant menu.");
        System.out.println("h. delete Menu Item to a restaurant menu.");
        System.out.println("i. List Menu Items from a Menu.");
        System.out.println("j. Add items into the cart.");
        System.out.println("k. Delete items from the cart.");
        System.out.println("l. Increment the quantity of items in the cart.");
        System.out.println("m. Decrement the quantity of items in the cart.");
        System.out.println("n. Clean the cart.");
        System.out.println("ñ. submit order from the cart.");

        System.out.println(" ");
        System.out.println("Insert your selection here: ");

        String line = readLine();
        switch (line){
            //User options
            case "a":
                createUser(restaurants);
                break;
            case "b":
                listRestaurantUsers(restaurants);
                break;
            case "c":
                break;
            case "d":
                break;
            case "e":
                break;
            //Menu Options
            case "f":
                findMenuByRestaurantId(restaurants);
                break;
            case "g":
                addMenuItem(restaurants);
                break;
            case "h":
                deleteMenuItemById(restaurants);
                break;
            case "i":
                listMenuItemById(restaurants);
                break;
            case "j":
                break;
            case "k":
                break;
            case "l":
                break;
            case "m":
                break;
            case "n":
                break;
            case "ñ":
                break;
            default:
                System.out.println("option not available");
                showMainPage(restaurants);
        }
    }

    private static void listRestaurantUsers(List<Restaurant> restaurants) throws IOException {
        System.out.println("Insert restaurant id: ");
        String id = readLine();
        var restaurant = restaurants.stream().filter(x->x.getId()==Integer.parseInt(id)).findFirst();
        restaurant.ifPresent(value -> System.out.println(value.getUsers()));
    }

    private static void createUser(List<Restaurant> restaurants) throws IOException {
        System.out.println("Insert restaurant id: ");
        String id = readLine();
        var restaurant = restaurants.stream().filter(x->x.getId()==Integer.parseInt(id)).findFirst();

        System.out.println("Insert name: ");
        String name = readLine();

        System.out.println("Insert username: ");
        String userName = readLine();

        System.out.println("Insert email: ");
        String email = readLine();

        restaurant.ifPresent(value->value.getUsers().add(new User(name,userName,email)));
        System.out.println(restaurant.get().getUsers());
    }

    private static void addMenuItem(List<Restaurant> restaurants) throws IOException {
        System.out.println("Insert restaurant id: ");
        String id = readLine();
        var restaurant = restaurants.stream().filter(x->x.getId()==Integer.parseInt(id)).findFirst();
        System.out.println("Insert name of new menuitem:");
        String name = readLine();

        System.out.println("Insert Description: ");
        String desc = readLine();

        System.out.println("Insert Price: ");
        String price = readLine();

        restaurant.ifPresent(value -> value.getMenu().add(new MenuItem(value.getMenu().getId(), name, desc, Double.parseDouble(price))));
        System.out.println(restaurant.get().getMenu().getMenuItems());
    }

    private static void deleteMenuItemById(List<Restaurant> restaurants) throws IOException {
        System.out.println("Insert restaurant id: ");
        String id = readLine();
        var restaurant = restaurants.stream().filter(x->x.getId()==Integer.parseInt(id)).findFirst();

        System.out.println(restaurant.get().getMenu().getMenuItems());
        System.out.println("Insert the menu item Id that you want to delete:");
        String menuItemId = readLine();
        restaurant.get().getMenu().delete(Integer.parseInt(menuItemId));
        System.out.println(restaurant.get().getMenu().getMenuItems());
    }

    private static void listMenuItemById(List<Restaurant> restaurants) throws IOException {
        System.out.println("Insert restaurant id: ");
        String id = readLine();
        var result = restaurants.stream().filter(x->x.getId()==Integer.parseInt(id)).findFirst();
        result.ifPresent(restaurant -> System.out.println(restaurant.getMenu().getMenuItems()));
    }

    private static void findMenuByRestaurantId(List<Restaurant> restaurants) throws IOException {
        System.out.println("Insert restaurant id: ");
        String id = readLine();
        var result = restaurants.stream().filter(x->x.getId()==Integer.parseInt(id)).findFirst();
        result.ifPresent(restaurant -> System.out.println(restaurant.getMenu()));
    }

    public static String readLine() throws IOException {
        return bufferedReader.readLine().trim();
    }
}