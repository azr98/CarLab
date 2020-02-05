package parts;

public class PetrolEngine extends Part {

    private double engineSize;
    private int horsePower;

    public PetrolEngine(String name, double engineSize, int horsePower) {
        super(name);
        this.engineSize = engineSize;
        this.horsePower = horsePower;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
