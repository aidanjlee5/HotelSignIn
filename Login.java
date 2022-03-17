//Create the login and sign in username and passwords, array to store the username and passwords for employees/admins and guest username that won't close the program
//Checks them in and out
import java.util.*;
public class Login {
    private final int CAPACITY = 500; //There are only 500 rooms in the hotel
    private Scanner scanner = new Scanner(System.in); //Change variable name?
    // public Login() {

    // }

    Credentials [] database = new Credentials [CAPACITY];
    
    public void addCredential(int index, String givenUserId, String givenPassword) {
        database[index] = new Credentials(givenUserId, givenPassword);
    }
    
    public boolean searchUsername() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Username: ");
        String userInput = scanner.nextLine();
        for (int x = 0; x < database.length; x++) {
            if (database[x].getUsername().equals(userInput)) {
                return true;
            }
        }
        System.out.println("Username not found, please try again");
        return searchUsername();
    }

    public boolean searchPassword(String userPassword) {
        for (int x = 0; x < database.length; x++) {
            if (database[x].getPassword().equals(userPassword)) {
                return true;
            }
        }
        return false;
    }
}