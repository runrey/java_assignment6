package AbstractFactory;

public class VictorianSofa implements Sofa{
	private boolean hasLegs;
    private boolean hasCushion;
    
    public VictorianSofa() {
        this.hasLegs = true;
        this.hasCushion = true;
    }

    @Override
    public boolean hasLegs() {
        return this.hasLegs;
    }

    @Override
    public boolean hasCushion() {
        return this.hasCushion;
    }

    @Override
    public void lieOn() {
            System.out.println("This a victorian sofa with legs and cushion");
    }
}
