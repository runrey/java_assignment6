package AbstractFactory;

public class ModernSofa implements Sofa{
	private boolean hasLegs;
    private boolean hasCushion;

    public ModernSofa() {
        this.hasLegs = false;
        this.hasCushion = false;
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
        System.out.println("This a modern sofa without legs and cushion");
    }
}
