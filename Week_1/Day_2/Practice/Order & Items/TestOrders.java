import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Items item1=new Items();
        item1.name="mocha";
        item1.price=2.0;

        Items item2=new Items();
        item2.name="latte";
        item2.price=2.5;

        Items item3=new Items();
        item3.name="drip coffee";
        item3.price=3.5;

        Items item4=new Items();
        item4.name="cappuccino";
        item4.price=1.2;
        // Order variables -- order1, order2 etc.
        Orders Order1=new Orders();
        Order1.name="Cindhuri";
        Order1.ready=true;
        

        Orders Order2=new Orders();
        Order2.name="Jimmy";
        Order2.items.add( item1);
        Order2.total+=item1.price;
        Order2.ready=true;

        Orders Order3=new Orders();
        Order3.name="Noah";
        Order3.items.add( item4);
        Order3.total+=item4.price;

        Orders Order4=new Orders();
        Order4.name="Sam";
        Order4.items.add( item2);
        Order4.items.add( item2);
        Order4.items.add( item2);
        Order4.total+=(item2.price)*3;

        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", Order1.name);
        System.out.printf("Total: %s\n", Order1.total);
        System.out.printf("Ready: %s\n", Order1.ready);
        System.out.println("************************");
        System.out.printf("Name: %s\n", Order2.name);
        System.out.printf("Total: %s\n", Order2.total);
        System.out.printf("Ready: %s\n", Order2.ready);
        System.out.printf("items: %s\n", Order2.items);
        System.out.println("************************");
        System.out.printf("Name: %s\n", Order3.name);
        System.out.printf("Total: %s\n", Order3.total);
        System.out.printf("Ready: %s\n", Order3.ready);
        System.out.printf("items: %s\n", Order3.items);
        System.out.println("************************");
        System.out.printf("Name: %s\n", Order4.name);
        System.out.printf("Total: %s\n", Order4.total);
        System.out.printf("Ready: %s\n", Order4.ready);
        System.out.printf("items: %s\n", Order4.items);
    }
}
