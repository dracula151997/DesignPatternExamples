package designpattern.creational.abstractfactory.example1.factory;

import designpattern.creational.abstractfactory.example1.Bank;

public class NationalBankOfEgypt implements Bank {
    private final String name;

    public NationalBankOfEgypt() {
        name = "National Bank of Egypt";
    }

    @Override
    public String name() {
        return name;
    }
}
