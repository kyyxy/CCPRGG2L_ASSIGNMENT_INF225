import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Java program to check if a student number is valid
        Scanner emailscan = new Scanner(System.in);
        System.out.print("Enter Student Email Address : ");
        String emailAdd = emailscan.nextLine();

        // Email address
        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(emailAdd);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("Valid Email Address");
        } else {
            System.out.println("Invalid Email Address");
        }
        
        // Phone Number
        Scanner phonescan = new Scanner(System.in);
        System.out.print("Enter Phone Number : ");
        String phoneNum = phonescan.nextLine();
        
        pattern = Pattern.compile("09\\d{9}");
        matcher = pattern.matcher(phoneNum);

        match = matcher.matches();

        if (match) {
            System.out.println("Valid Phone Number");
        } else {
            System.out.println("Invalid Phone Number");
        }
    }
}
