package designpattern.creational.abstractfactory.example1.factory;

import designpattern.creational.abstractfactory.example1.Bank;

public class NationalBank implements Bank {
    private static String name;

    public NationalBank() {
        name = "National Bank";
    }

    @Override
    public String name() {
        return name;
    }
}
