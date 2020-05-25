package designpattern.creational.factory.example2;

public class Baguette implements Bread {
    @Override
    public String name() {
        return "Buguette";
    }

    @Override
    public String category() {
        return "65 kcal";
    }
}
