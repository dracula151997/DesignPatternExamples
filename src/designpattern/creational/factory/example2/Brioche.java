package designpattern.creational.factory.example2;

public class Brioche implements Bread {
    @Override
    public String name() {
        return "Brioche";
    }

    @Override
    public String category() {
        return "30 kcal";
    }
}
