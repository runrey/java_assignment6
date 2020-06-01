package AbstractFactory;

public class ModernChair implements Chair{
	private boolean haslegs;

    public ModernChair() {
        this.haslegs = false;
    }

    @Override
    public boolean hasLegs() {
        return this.haslegs;
    }

    @Override
    public void sitOn() {
        System.out.println("A Modern Chair with no legs");
    }
}
