public class TestOrder {
    public static void main(String[] args){
        // Menu items
        Item item1 = new Item("drip coffee", 2.5);
        Item item2 = new Item("capuccino", 3.0);
        Item item3 = new Item("latte", 3.2);
        Item item4 = new Item("mocha", 3.5);
        //orders
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Aziz");
        Order order4 = new Order("Alfred");
        Order order5 = new Order("Salah");
        // add all items
        order1.addItem(item4);
        order1.addItem(item4);

        order2.addItem(item1);
        order2.addItem(item2);

        order3.addItem(item4);
        order3.addItem(item3);

        order4.addItem(item2);
        order4.addItem(item3);
        order5.addItem(item1);

        order5.addItem(item3);
        order5.addItem(item3);
        // Test status
        System.out.println(order3.getStatusMessage());
        // Test order total
        System.out.println(order3.getOrderTotal());
        order3.display();
    }
}