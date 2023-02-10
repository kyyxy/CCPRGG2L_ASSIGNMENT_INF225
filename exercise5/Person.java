public class Person {

    // Private variable
    // Private variables are only accessible within the class where they are
    // declared. They are not accessible outside of this class.
    private String name;
    private int CCnumber;

    // get() method
    public String getName() {

        return this.name;
    }

    public int getCCnumber(){

        return this.CCnumber;
    }


    // set() method
    public void setName(String newName) {

        this.name = newName;
    }

    public void setCCnumber(int newCCnumber){

        this.CCnumber = newCCnumber;
    }
}