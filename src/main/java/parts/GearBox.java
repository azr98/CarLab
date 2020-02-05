package parts;

public class GearBox extends Part {

    private boolean isAutomatic;
    private int speed;

    public GearBox(String name, boolean isAutomatic, int speed) {
        super(name);
        this.isAutomatic = isAutomatic;
        this.speed = speed;
    }
}
