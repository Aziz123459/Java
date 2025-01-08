public class Test{
    public static void main(String[] args) {
        CoffeeKiosk kiosk= new CoffeeKiosk();
    kiosk.addItem("- milk",0.5);
    kiosk.addItem("- banana",2.5);
    kiosk.addItem("- date",1.0);
    kiosk.addItem("- avocado",4);
    kiosk.newOrder();
    }
}