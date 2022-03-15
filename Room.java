//Create a program that represents a room, with a number, name, and assigned cleaner, maybe check-in and check-out
//Maybe have tier-list, specific plans that the customer bought, what type of room(balcony, middle, which floor, etc)
//Maybe add a balance that is associated with the number and clears when they check out, used for when you stay at the hotel
public class Room{
  private String name, status, roomPlan;
  private int roomNum;

  public Room(String guest, int number, String occupancy, String roomType, int bal) {
    name = guest;
    roomNum = number;
    status = occupancy;
    roomPlan = roomType;
    bal = balance;
  }
}