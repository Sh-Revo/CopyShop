package TechSpec;

public class RAM {
    private int size;
    private String name;

    public RAM(String name, int size) {
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
