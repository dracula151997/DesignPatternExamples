package designpattern.creational.factory.example2;

public class BreadFactory {

    public Bread getBread(String name) {
        if (name == null)
            return null;

        if (name.equalsIgnoreCase(BreadClassName.BAGUETTE.name()))
            return new Baguette();
        else if (name.equalsIgnoreCase(BreadClassName.BRIOCHE.name()))
            return new Brioche();
        else
            return new Roll();
    }
}
