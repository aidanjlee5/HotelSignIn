//Create a list that organizes the rooms into an array, maybe a method that searches through the array
//Array that stores Room objects and you can search through it to find their room
public class HotelRooms {
    
    private final int CAPACITY = 500;

    Room [] guestRooms = new Room[CAPACITY];

    public String guestName(int x) {
        return guestRooms[x].getGuest();
    }

    public int guestRoom(int x) {
        return guestRooms[x].getNumber();
    }

    public String guestStatus(int x) {
        return guestRooms[x].getStatus();
    }

    public int guestRoomPlan(int x) {
        return guestRooms[x].getRoomPlan();
    }

    public double guestBalance(int x) {
        return guestRooms[x].getBalance();
    }
}