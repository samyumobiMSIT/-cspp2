import java.util.ArrayList;

public class Hotel
{
	private ArrayList rooms;
	public int max=0;
	int[] roomNumbers;
	static int limit=15;
	public Hotel()
	{
	   	rooms = new ArrayList(15);
		  roomNumbers=new int[1532321];
		  for(int i=0;i<limit;i++)     roomNumbers[i]=i+1;
	}
	public Hotel(int numRooms)
	{
		rooms = new ArrayList(numRooms);
		max=numRooms;
	}
	public boolean buildRooms(int num)
	{
		if(num<=0)return false;
		rooms.ensureCapacity(rooms.size() + num);
		 for(int i=limit;i<limit+num;i++)    roomNumbers[i]=limit+1;
		 limit=limit+num;
		return true;
	}
	public int reserveRoom(String person)
	{
		int roomnumber=0;
		for(int i=0;i<limit;i++)
		{
			if(roomNumbers[i]>=0)
			{	
			  roomnumber=roomNumbers[i];
				roomNumbers[i]=-2;
				break;
			}
			else roomnumber=-1;
		}
		String val=person+" :  "+roomnumber;
		rooms.add(val);
		return roomnumber;
	}
 
	public boolean reserveRoom(String person, int roomNum)
	{
		  if(roomNum>limit) 
		  {
			  System.out.println("No such room number found ");
			  return false;
		  }
		  else if(roomNumbers[roomNum]<0)
					return false;
		
		else  	rooms.add(person+" : "+roomNum);
 
		return true;
	}

	public void cancelReservations(String person)
	{
		for(int i=0;i<rooms.size();i++)
		{
			String value=(String) rooms.get(i);
			String name=(value.split(" "))[0];
			if(name.equals(person))
			{
				int roomnumber=Integer.parseInt((value.split(" : "))[1]);
				roomNumbers[roomnumber]=0;
				rooms.remove(i);
			}
		}
	}
 
	public void printReservations()
	{
		 System.out.println("Rooms allocated are"+rooms);     // printing the linked list
	}
}
