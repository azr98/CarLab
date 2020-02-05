package parts;

public class ElectricEngine extends Part {

    private int range;
    private int torque;

    public ElectricEngine(String name, int range, int torque) {
        super(name);
        this.range = range;
        this.torque = torque;
    }
}
