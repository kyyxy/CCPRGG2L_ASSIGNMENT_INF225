public class App {
    public static void main(String[] args) throws Exception {

        Person Friend = new Person("Alfredo", 19);

        Myself Me = new Myself("Joebert", 20);

        Me.addFriend(Friend);

        Pet Dog = new Pet("Chuchay", Friend);
        Dog.showOwnerName();

        Car SportsCar = new Car("Drkzm", "Lamborghini", "Black", Me);
        SportsCar.showBrandName();

    }
}
