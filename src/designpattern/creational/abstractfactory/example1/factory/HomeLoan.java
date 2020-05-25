package designpattern.creational.abstractfactory.example1.factory;

public class HomeLoan extends Loan {
    @Override
    void getInterestRate(double r) {
        rate = r;

    }
}
