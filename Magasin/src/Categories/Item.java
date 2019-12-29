package Categories;

public class Item {
    private int id;
    private String name;
    private double value;
    private String description;
    private double price;

    public Item(int id,String name, double value, String description, double price) {
        this.id=id;
        this.name = name;
        this.value = value;
        this.description = description;
        this.price = price;
    }
    public Item(){

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public double getPrice() {
        return price;
    }

    public void setValue(double value) {
        this.value = value;
    }

     public void show(){
        System.out.println("\nId: "+id+"\nНазвание: "+name+
                "\nКол-во: "+value+
                "\nОписание: "+description+
                "\nЦена: "+price
                );
    }
}
