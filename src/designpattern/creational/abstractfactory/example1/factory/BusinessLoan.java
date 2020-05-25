package designpattern.creational.abstractfactory.example1.factory;

public class BusinessLoan extends Loan {
    @Override
    void getInterestRate(double r) {
        rate = r;

    }
}
