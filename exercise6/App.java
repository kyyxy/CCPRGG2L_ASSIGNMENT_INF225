public class App {
    public static void main(String[] args) throws Exception {
    
        GroceryItem item1 = new GroceryItem();
        item1.name = "Tissue";
        item1.price = 43.12;
        item1.showItemName();
    

        GroceryItem item2 = new Toothbrush();
        item2.name = "Colgate";
        item2.price = 69.96;
        item2.showItemName();

        GroceryItem item3 = new Toothpaste();
        item3.name = "Pepsodent";
        item3.price = 96.143;
        item3.showItemName();

        //cashier object
        Cashier c1 = new Cashier();
        //polymorphic parameter
        c1.checkOut(item2);
        c1.showPrice(item2);
        c1.checkOut(item3);
        c1.showPrice(item3);


        //Polymorphic array
        GroceryItem[] itemArray = new GroceryItem[2];
        itemArray[0] = item2;
        itemArray[1] = item3;
        //loop through all item
        for (int i = 0; i < 2; i++) {
            itemArray[i].showItemName();
        }

        Dog myDog = new Dog();
        myDog.eat();

        Lion myLion = new Lion();
        myLion.walk();
        myLion.run();
    }
}
