public class Myself {
    int age;
    String name;

    //Constructor
    Myself(String myName, int myAge){
        
        this.age = myAge;
        this.name = myName;
    }
    void addFriend(Person friend){
        System.out.println("I am friend with " + friend.name);
    }
}
