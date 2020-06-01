package AbstractFactory;

import java.util.Scanner;

public class Application {
	private static FurnitureFactory factory;
    private static Chair chair;
    private static Sofa sofa;
    private static CoffeeTable coffeeTable;
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Choose the type of furniture, Modern or Victorian?(M/V)");
		String choose = in.next();
		if(choose.equals("M")) {
			factory = new ModernFurnitureFactory();
		}
		if(choose.equals("V")) {
			factory = new VictorianFurnitureFactory();
		}
		chair = factory.CreateChair();
        sofa = factory.CreateSofa();
        coffeeTable = factory.CreateCoffeeTable();
        
        System.out.println("Chair has legs? " + chair.hasLegs());
        chair.sitOn();

        System.out.println("What is the shape of coffee table? " + coffeeTable.getShape());
        coffeeTable.onTable();

        System.out.println("Does that sofa has cushions? " + sofa.hasCushion());
        System.out.println("Does that sofa has legs? " + sofa.hasLegs());
        sofa.lieOn();
        
		in.close();
	}
}
