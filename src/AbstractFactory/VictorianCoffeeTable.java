package AbstractFactory;

public class VictorianCoffeeTable implements CoffeeTable{
	private String shape;

    public VictorianCoffeeTable() {
        this.shape = "rectangle";
    }

    @Override
    public String getShape() {
        return this.shape;
    }

    @Override
    public void onTable() {
        System.out.println( "This victorian coffee table has a " + getShape() + " shape." );
    }
}
