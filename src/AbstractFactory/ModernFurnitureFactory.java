package AbstractFactory;

public class ModernFurnitureFactory implements FurnitureFactory{
	ModernFurnitureFactory() {
		
    }

    @Override
    public Chair CreateChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable CreateCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa CreateSofa() {
        return new ModernSofa();
    }
}
