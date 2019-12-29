package Categories;

import TechSpec.TimeLife;

public class Sweet extends Item {
    TimeLife timeLife;

    public Sweet(int id, String name, double value, String description, double price, TimeLife timeLife) {
        super(id, name, value, description, price);
        this.timeLife = timeLife;
    }

    @Override
    public void show(){
        super.show();
        System.out.println("Годен до: "+timeLife.getBuff());
    }
}
