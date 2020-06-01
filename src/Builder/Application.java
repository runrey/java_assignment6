package Builder;

import java.util.Scanner;

public class Application {
	private static final Director director = new Director();
    private static final HouseBuilder houseBuilder = new HouseBuilder();
    private static final HouseMapBuilder houseMapBuilder = new HouseMapBuilder();
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose the type of furniture, Large, Small or Average?(L/S/A)");
        String choose = in.next();
        
        
        if(choose.equals("L")) {
        	director.buildLargeHouse(houseBuilder);
            director.buildLargeHouse(houseMapBuilder);
		}
        if(choose.equals("S")) {
        	director.buildSmallHouse(houseBuilder);
            director.buildSmallHouse(houseMapBuilder);
		}
        if(choose.equals("A")) {
        	director.buildAverageHouse(houseBuilder);
            director.buildAverageHouse(houseMapBuilder);
		}

        //House house = houseBuilder.getResult();
        HouseMap houseMap = houseMapBuilder.getResult();

        System.out.println(houseMap.showMap());
        
        in.close();
    }
}
