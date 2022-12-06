import java.util.ArrayList;

public class TestOrders {

    public static void main(String[] args) {
        
        // Menu items
        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price = 3.99;
        
        Item item2 = new Item();
        item2.name = "Latte";
        item2.price = 2.99;

        Item item3 = new Item();
        item3.name = "Drip Coffee";
        item3.price = 1.99;

        Item item4 = new Item();
        item4.name = "Cappuccino";
        item4.price = 2.99;


        // Order variables -- order1, order2, etc.
        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.ready = true;

        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.items = new ArrayList<Item>();
        order2.items.add(item1);
        order2.drinks = order2.items.get(0).name;
        order2.total += order2.items.get(0).price;
        order2.ready = true;

        Order order3 = new Order();
        order3.name = "Noah";
        order3.items = new ArrayList<Item>();
        order3.items.add(item4);
        order3.drinks = order3.items.get(0).name;
        order3.total += order3.items.get(0).price;

        Order order4 = new Order();
        order4.name = "Sam";
        order4.items = new ArrayList<Item>();
        order4.items.add(item2);
        order4.items.add(item2);
        order4.items.add(item2);
        order4.drinks = order4.items.get(0).name + ", " + order4.items.get(1).name + ", " + order4.items.get(2).name;
        order4.total = order4.items.get(0).price + order4.items.get(1).price + order4.items.get(2).price;


        System.out.printf("\nName: %s\n", order1.name);
        if (order1.ready == true) {
            System.out.println("Order ready!");
        }
        
        System.out.printf("\nName: %s\n", order2.name);
        System.out.printf("Drink(s): %s\n", order2.drinks);
        System.out.printf("Total: $%s\n", order2.total);
        if (order2.ready == true) {
            System.out.println("Order ready!");
        }

        System.out.printf("\nName: %s\n", order3.name);
        System.out.printf("Drink(s): %s\n", order3.drinks);
        System.out.printf("Total: $%s\n", order3.total);

        System.out.printf("\nName: %s\n", order4.name);
        System.out.printf("Drink(s): %s\n", order4.drinks);
        System.out.printf("Total: $%s\n", order4.total);
    }
}