package Categories;
import TechSpec.Grade;
import TechSpec.TimeLife;

public class Vegetable extends Item {
    Grade grade;
    TimeLife timeLife;

    public Vegetable(int id, String name, double value, String description, double price, Grade grade, TimeLife timeLife) {
        super(id, name, value, description, price);
        this.grade = grade;
        this.timeLife = timeLife;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Сорт: "+grade.getGrade()+"\nГоден до: "+timeLife.getBuff());

    }
}
