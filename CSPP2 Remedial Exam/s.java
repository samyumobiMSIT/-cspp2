import java.util.*;
/**
 * Class for main.
 */
public class Solution{

  public static void main(String[] args){
  		Hotel h = new Hotel();
		String name;
		int roomnum;
  		Scanner scan = new Scanner(System.in);
		int readLines = Integer.parseInt(scan.nextLine());
		int c=0;
		while (c<readLines) {
			String line = scan.nextLine();
			String tokens[]=line.split(" ");
				switch(tokens[0])
				{
					case "reserve":
									
									name = tokens[1];
									roomnum = -1;
								    //if we got a good name, try to reserve a room
								    if(!((name==null) || (name.equals(""))))
								        roomnum = h.reserveRoom(name);
								    if(roomnum==-1)
					                System.out.println("No reservation for you!");
								    //give feedback
								    if(roomnum!=-1)
								        System.out.println(name+" reserved room "+roomnum);
								 
									break;

					case "reserveN":
									name = tokens[1];
									//if we got a bad input, report failure
									

								    if((name==null) || (name.equals("")))
								        roomnum = -1;
								    else{
								    	try{
								    		roomnum = Integer.parseInt(tokens[2]);
								    	}
								    	catch(Exception e){
								    		roomnum = -1;
								    	}
								     
								    }    
								    //give feedback
								    if(!h.reserveRoom(name, roomnum))
								        System.out.println("No reservation for you!");
								    else
								    	System.out.println(name+" "+roomnum);
								    
								    break;

					case "print":
								//print all the reservations done in the hotel
								h.printReservations();
								 break;
					case "cancel":
								//cancel the rooms for that particular person
								name = tokens[1];
								if(!((name==null) || (name.equals("")))){
								        h.cancelReservations(name);
								        System.out.println(name+" now has no reservations.");
								    }else{
								        System.out.println("No input");
   								 }
   								 break;
					case "build":
								//add more number of rooms to the existing rooms
								roomnum = Integer.parseInt(tokens[1]);
								
							    if(h.buildRooms(roomnum))
							        System.out.println("Added "+roomnum+" more rooms");
							    else
							        System.out.println("No rooms are added");
							      break;
				}
				c++;
		}
	}
}
