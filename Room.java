//Create a program that represents a room, with a number, name, and assigned cleaner, maybe check-in and check-out
//Maybe have tier-list, specific plans that the customer bought, what type of room(balcony, middle, which floor, etc)
//Maybe add a balance that is associated with the number and clears when they check out, used for when you stay at the hotel
public class Room{
  private String name, status;
  private int roomNum, roomPlan;
  private double balance; 

  public Room(String guest, int number, String occupancy, int roomType, double bal) {
    name = guest;
    roomNum = number;
    status = occupancy;
    roomPlan = roomType;
    bal = balance;
  }

  public String getGuest() {
    return name;
  }

  public int getNumber() {
    return roomNum;
  }

  public String getStatus() {
    return status;
  }

  public int getRoomPlan() {
    return roomPlan;
  }

  public double getBalance() {
    return balance;
  }
}