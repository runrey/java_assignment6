package AbstractFactory;

public class ModernCoffeeTable implements CoffeeTable{
	private final String shape;

    public ModernCoffeeTable() {
        this.shape = "oval";
    }

    @Override
    public String getShape() {
        return this.shape;
    }

    @Override
    public void onTable() {
        System.out.println( "This modern coffee table has a " + getShape() + " shape." );
    }
}
