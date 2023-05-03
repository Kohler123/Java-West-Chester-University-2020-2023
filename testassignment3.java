import java.util.Scanner;


public class testassignment3 
{
	
	public static void main(String[] args) {
	 int floors;
	 double rooms = 0; 
	 int roomsOccupied = 0;
	 double totalRooms = 0;
	 double totalRoomsOccupied = 0;
	 double totalVacantRooms = 0;
	 double occupancyRate = 0.0;
		
		// Create Scanner object for user input
		Scanner input = new Scanner(System.in);
		
		// Prompt user for floor count
System.out.print("Enter the number of floors: ");
floors = input.nextInt();
		
		// Input validation: Floor count > 1
while(floors < 1){
System.out.print("Invalid Input. Enter a number of floors greater than 0: ");
floors = input.nextInt();

		}
		
		
for(int i=0; i<floors; i++)

      {
			
         
System.out.print("Enter the number of rooms (Floor " + (int)(i + 1) + "): ");

rooms = input.nextInt();
			
while(rooms < 10)
      {
System.out.print("Invalid input. Enter a number of rooms greater than 9 \n(Floor " + (int)(i + 1) + "): ");
rooms = input.nextInt();
		}
			
System.out.print("Enter the number of rooms occupied(Floor " + (int)(i + 1) + "): ");
roomsOccupied = input.nextInt();
			
totalRooms += rooms;
			
totalRoomsOccupied += roomsOccupied;
		}


totalVacantRooms = totalRooms - totalRoomsOccupied; 
		

occupancyRate = (totalRoomsOccupied/totalRooms);

System.out.println(" Total Rooms: " + totalRooms + " Rooms Occupied: " + totalRoomsOccupied + " Vacant Rooms: " + totalVacantRooms + " Occupancy Rate: " + occupancyRate + " % ");
      }
      
      }