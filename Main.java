import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Login login = new Login();//Should I call it login?
    login.addCredential(0, "ALee", "create");

    System.out.println("Please enter the Username and Password"); //Change to more "trademark"
      login.searchUsername();
      // System.out.print("Password: ");
      // userInput = scan.nextLine();
      // if (login.searchPassword(userInput)) {
        System.out.println("Access Granted");
    
    //Create login and username first, get a working login for guests
    //make sure they can access the information inside the array
    //Try and see if you can manipulate the array 
  }
}