package FactoryMethod;

import java.util.Scanner;

public class Application {
	public static Logistics logic;
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Choose the type of logistics, on land or on sea?(L/S)");
		String choose = in.next();
		if(choose.equals("L")) {
			logic = new RoadLogistics();
		}
		if(choose.equals("S")) {
			logic = new SeaLogistics();
		}
		logic.planDelivery();
		in.close();
	}
}
