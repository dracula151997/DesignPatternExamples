package designpattern.creational.abstractfactory.example1.factory;

import designpattern.creational.abstractfactory.example1.Bank;

public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
