//Create the login and sign in username and passwords, array to store the username and passwords for employees/admins and guest username that won't close the program
//Checks them in and out
public class Login {
    private final int CAPACITY = 500; //There are only 500 rooms in the hotel
    // public Login() {

    // }

    Credentials [] database = new Credentials [CAPACITY];
    
    public void addCredential(int index, String givenUserId, String givenPassword) {
        database[index] = new Credentials(givenUserId, givenPassword);
    }
    
    public boolean searchUsername(String userUsername) {
        for (int x = 0; x < database.length; x++) {
            if (database[x].getUsername().equals(userUsername)) {
                return true;
            }
        }
        return false;
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