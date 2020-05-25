package designpattern.creational.factory.example2;

public class BreadTest {
    public static void main(String[] args) {
        BreadFactory breadFactory = new BreadFactory();

        Bread bagutteClass = breadFactory.getBread(BreadClassName.BAGUETTE.name());
        System.out.println(bagutteClass.name() + ", " + bagutteClass.category());

        Bread briocheClass = breadFactory.getBread(BreadClassName.BRIOCHE.name());
        System.out.println(briocheClass.name() + ", " + briocheClass.category());

        Bread rollClass = breadFactory.getBread(BreadClassName.ROLL.name());
        System.out.println(rollClass.name() + ", " + rollClass.category());


    }
}
