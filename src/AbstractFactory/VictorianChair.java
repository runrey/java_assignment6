package AbstractFactory;

public class VictorianChair implements Chair{
	private boolean haslegs;

    public VictorianChair() {
        this.haslegs = true;
    }

    @Override
    public boolean hasLegs() {
        return this.haslegs;
    }

    @Override
    public void sitOn() {
        System.out.println("A Victorian Chair with legs");
    }
}
