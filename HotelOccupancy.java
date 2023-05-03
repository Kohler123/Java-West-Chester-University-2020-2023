//Brandon Kohler
//March 5th 2020
// CSC 141
//Assignment 3 Hotel Occupancy 

import java.util.Scanner;

public class HotelOccupancy 
      {	
   public static void main(String[] args)
      {
      int floors; 
      int roomsOccupied = 0;
      double rooms = 0;
      double totalRooms = 0;
      double totalRoomsOccupied = 0;
      double totalVacantRooms = 0;
      double occupancyRate = 0.0;
   	
      Scanner input = new Scanner(System.in);
      System.out.println ("Hello,");
      System.out.print("Please enter the number of floors in the hotel: ");//Program will keep going if user inputs a number above 0
      floors = input.nextInt();
   	
      while(floors < 1)
      {
         System.out.print("Invalid please enter a number of that is greater than 0: ");// This is a error if the user inputs a number that isnt available like numbers under 1
         floors = input.nextInt();
            }
      
      for(int i=0; i<floors; i++)
      { 
         System.out.print("Please enter the number of rooms (Floor " + (int)(i + 1) + "):");
         rooms = input.nextInt();
      	
         while(rooms < 10)
      {
            System.out.print("Invalid. please enter a number that is greater than 9:"); //This is a error if the user inputs a number that isnt available like numbers under 10
            rooms = input.nextInt();
            }	
         System.out.print("Please enter the number of rooms that are occupied(Floor " + (int)(i + 1) + "): ");
         roomsOccupied = input.nextInt();
      	
         totalRooms += rooms; // Calculation of Total Rooms
      	
         totalRoomsOccupied += roomsOccupied;// Calculation of Total Rooms Occupied 
            }
      totalVacantRooms = totalRooms - totalRoomsOccupied; //Calculation of Total Vacant Rooms
   	
      occupancyRate = (totalRoomsOccupied/totalRooms); // Calculation of Occupany Rate
   
      System.out.println(" The total amount rooms in the hotel are: " + totalRooms + " Rooms Occupied(Unavailable): " + totalRoomsOccupied + " Vacant Rooms(Available); " + totalVacantRooms + " Hotels Occupancy Rate: " + occupancyRate + " %% ");
            }
      
            }
      
      
//Brandon Kohler
//March 5th 2020
// CSC 141
//Assignment 3 Hotel Occupancy