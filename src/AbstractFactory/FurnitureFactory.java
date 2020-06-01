package AbstractFactory;

public interface FurnitureFactory {
	Chair CreateChair();
    CoffeeTable CreateCoffeeTable();
    Sofa CreateSofa();
}
