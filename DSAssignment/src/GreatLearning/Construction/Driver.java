package GreatLearning.Construction;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building"); 
		int floorCount = scan.nextInt();
		int[] floors = new int[floorCount];
		for(int i = 0; i < floorCount; i++) {  
			System.out.println("Enter the floor size given on day: " + (i+1));
			floors[i] = scan.nextInt(); 
		}  
		scan.close();
		Main service = new Main();
		service.printConstructionOrder(floors);
	}

}