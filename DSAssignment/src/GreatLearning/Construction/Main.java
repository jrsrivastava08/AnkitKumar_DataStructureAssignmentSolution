package GreatLearning.Construction;

import java.util.Stack;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int floors;
		
		LinkedList<Integer> list = new LinkedList<>();
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the total no of floors in the building");
		floors = sc.nextInt();
		
		for(int i = 1; i <= floors; i++) {
			
			System.out.println("Enter the floor size given on day : " + i);
			list.add(sc.nextInt());			
		}
		
		Driver plan = new Driver();
		plan.implementConstructionPlan(list);
		
		sc.close();

	}

}