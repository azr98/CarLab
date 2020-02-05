package parts;

public class HybridEngine extends Part {

    private int powerSplit;
    private double engineSize;

    public HybridEngine(String name, int powerSplit, double engineSize) {
        super(name);
        this.powerSplit = powerSplit;
        this.engineSize = engineSize;
    }

}
