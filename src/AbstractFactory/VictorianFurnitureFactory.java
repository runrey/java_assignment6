package AbstractFactory;

public class VictorianFurnitureFactory implements FurnitureFactory{
	VictorianFurnitureFactory() {
		
    }

    @Override
    public Chair CreateChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable CreateCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa CreateSofa() {
        return new VictorianSofa();
    }
}
