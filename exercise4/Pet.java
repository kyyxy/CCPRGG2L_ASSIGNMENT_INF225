public class Pet {
    String name;

    Person owner;

    Pet (String petName, Person ownerName){
        this.name = petName;
        this.owner = ownerName;
    }
    void showOwnerName(){
        System.out.println("I am " + this.name + " My owner name is " + owner.name);
    }
}
