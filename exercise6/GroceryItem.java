public class GroceryItem {

    String name;
    double price;

    public void showItemName() {

        System.out.println("This is a " + this.name);

    }
    public void showItemPrice(){
        System.out.println("This is worth" + this.price );
    }

}