package designpattern.creational.factory.example2;

public class Roll implements Bread {
    @Override
    public String name() {
        return "Roll";
    }

    @Override
    public String category() {
        return "75 kcal";
    }
}
