package designpattern.creational.abstractfactory.example1.factory;

public class EducationLoan extends Loan {
    @Override
    void getInterestRate(double r) {
        rate = r;

    }
}
