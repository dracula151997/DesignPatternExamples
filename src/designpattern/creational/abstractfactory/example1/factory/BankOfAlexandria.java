package designpattern.creational.abstractfactory.example1.factory;

import designpattern.creational.abstractfactory.example1.Bank;

public class BankOfAlexandria implements Bank {
    private final String name;

    public BankOfAlexandria() {
        name = "Bank of Alexandria";

    }

    @Override
    public String name() {
        return name;
    }
}
