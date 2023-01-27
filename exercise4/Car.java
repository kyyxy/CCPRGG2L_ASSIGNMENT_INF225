public class Car {
    String name;
    String brand;
    String color;

    Myself owner;

    Car (String carName, String carBrand, String carColor, Myself ownerName){
        this.name = carName;
        this.brand = carBrand;
        this.color = carColor;
        this.owner = ownerName;
    }
    void showBrandName(){
        System.out.println("I am " + owner.name + " My Car is "  + this.name + " Its brand was " + this.brand + " and it is color " + this.color);
    }


}
