package parts;

public abstract class Part {

    private String name;

    public Part(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
