package designpattern.creational.abstractfactory.example1.factory;

public class FactoryCreator {
    public static final String BANK = "Bank";
    public static final String LOAN = "Loan";

    public static AbstractFactory getFactory(String name) {
        if (name == null)
            return null;

        if (name.equalsIgnoreCase(BANK))
            return new BankFactory();
        else if (name.equalsIgnoreCase(LOAN))
            return new LoanFactory();

        return null;

    }

}
