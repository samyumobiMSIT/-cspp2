/**Reservation class, stores the person and room number in the Hotel **/

public class Reservation{
    //instance variables
    private String name;
    private int roomNumber;
    

    //constructors, must supply the name, and optionally a room
    public Reservation(String person){
    	this.name=person;
		roomNumber=0;

    }
    public Reservation(String person, int room){
    	this.name=person;
		roomNumber=room;   

    }

    //mutators, set the room number or name
    public void setRoom(int newroom){
    	this.roomNumber=newroom;
    }

    public void setName(String newname){
    	this.name=newname;
    	
    }

    //accessors, return the room number or name
    public int getRoom(){
    	return roomNumber;
    	
    }

    public String getName(){
    	return name;
    }
}