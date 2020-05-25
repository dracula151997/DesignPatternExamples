package designpattern.creational.abstractfactory.example1.factory;

import designpattern.creational.abstractfactory.example1.Bank;
import designpattern.creational.abstractfactory.example1.BankClasses;

public class BankFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bank) {
        if (bank == null)
            return null;

        if (bank.equalsIgnoreCase(BankClasses.ALEXANDRIA.name()))
            return new BankOfAlexandria();
        else if (bank.equalsIgnoreCase(BankClasses.NATIONAL.name()))
            return new NationalBank();
        else
            return new NationalBankOfEgypt();
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
