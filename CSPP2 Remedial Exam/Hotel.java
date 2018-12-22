// import java.util.ArrayList;

// public class Hotel
// {
//   private ArrayList rooms;
//   public int max=0;
//   int[] roomNumbers;
//   static int limit=15;
//   Reservation r;
//   public Hotel()
//   {
//       rooms = new ArrayList(15);
//       roomNumbers=new int[1532321];
//       for(int i=0;i<limit;i++)     roomNumbers[i]=i+1;
//   }
//   public Hotel(int numRooms)
//   {
//     rooms = new ArrayList(numRooms);
//     max=numRooms;
//   }
//   public boolean buildRooms(int num)
//   {
//     if(num<=0) {
//       return false;
//     }
//     rooms.ensureCapacity(rooms.size() + num);
//      for(int i=limit;i<limit+num;i++)    roomNumbers[i]=limit+1;
//      limit=limit+num;
//     return true;
//   }
//   public int reserveRoom(String person)
//   {
//     int roomnumber=0;
//     for(int i=0;i<limit;i++)
//     {
//       if(roomNumbers[i]>=0)
//       { 
//         roomnumber=roomNumbers[i];
//         roomNumbers[i]=-2;
//         break;
//       }
//       else roomnumber=-1;
//     }
//     String val=person+" "+roomnumber;
//     rooms.add(val);
//     return roomnumber;
//   }
 
//   public boolean reserveRoom(String person, int roomNum)
//   {
//       if(roomNum>limit) 
//       {
//         System.out.println("No such room number found ");
//         return false;
//       }
//       else if(roomNumbers[roomNum]<0)
//           return false;
    
//     else    rooms.add(person+"  "+roomNum);
 
//     return true;
//   }

//   public void cancelReservations(String person)
//   {
//     for(int i=0;i<rooms.size();i++)
//     {
//       String value=(String) rooms.get(i);
//       String name=(value.split(" "))[0];
//       if(name.equals(person))
//       {
//         int roomnumber=Integer.parseInt((value.split("  "))[1]);
//         roomNumbers[roomnumber]=0;
//         rooms.remove(i);
//       }
//     }
//   }
 
//   public void printReservations()
//   {
//      System.out.println(" "+rooms);     
//   }
// }

/*
  the Hotel is an ArrayList of Reservations
  it allows a person to request a room and cancel their reservation
  also we can add more rooms
*/

import java.util.ArrayList;

public class Hotel {
    //instance variable, ArrayList tracks current reservations
  private ArrayList<Reservation> rooms;

    //constructors, can specify how many rooms to start with
    //default is 5 rooms
  public Hotel(){
    rooms = new ArrayList<Reservation>();
    rooms.ensureCapacity(5);
    for (int i = 0; i < 5; i++)
       rooms.add(null);
  }
  public Hotel(int numRooms){
    rooms = new ArrayList<Reservation>();
    rooms.ensureCapacity(numRooms);
    for(int i = 0; i< numRooms; i++)
      rooms.add(null);
  }

    //adds more rooms to the hotel, returns true on success
  public boolean buildRooms(int num){
  //make sure the parameter is valid
    if(num<=0)return false;

  //increase the capacity of the Vector
    rooms.ensureCapacity(rooms.size() + num);
    for(int i = 0; i < num; i++)
       rooms.add(null);
    return true;
  }

    //reserves and returns an available room
  //report succes
    //or returns -1 if the hotel is full
  public int reserveRoom(String person){
    for(int i = 0; i < rooms.size(); i++) {
      if(rooms.get(i) == null) {
        Reservation res = new Reservation(person,i);
        //rooms.add(new Reservation(person,i));
        rooms.set(i,res);
        return i;
      }
    }
    return -1;
  }
    //reserves a particular room for this person
    //returns false on failure (eg. room is already reserved)
  public boolean reserveRoom(String person, int roomNum) {
    for (Reservation temp : rooms) {
      if(temp.getRoom() == roomNum) {
        return false;
      }
    }
    Reservation res = new Reservation(person);
    rooms.set(roomNum,res);
    //rooms.add(new Reservation(person,roomNum));
    return true;
  }

    //cancels all reservations by this person
  public void cancelReservations(String person){
    int index = 0;
    for (Reservation temp : rooms) {
      if(temp.getName().compareTo(temp.getName()) == 0) {
        //temp.setRoom(0);
        rooms.remove(index);
      }
      index++;
    }
  }
    //prints out all the current reservations to the screen
    //also should display the total number of reservations and vacancies
    public void printReservations(){
      // for(int i = 0 ;i < rooms.size(); i++) {
      //   System.out.print("\nName:" + rooms.get(i).getName());
      //   System.out.println("\tRoom No:" + rooms.get(i).getRoom());
      // }
      for (Reservation temp : rooms) {
        System.out.print("\nName:" + temp.getName());
        System.out.println("\tRoom No:" + temp.getRoom());
      }
    }
}