package designpattern.creational.abstractfactory.example1.factory;

import designpattern.creational.abstractfactory.example1.Bank;
import designpattern.creational.abstractfactory.example1.BankClasses;
import designpattern.creational.abstractfactory.example1.LoanClasses;

public class LoanFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        if (loan == null)
            return null;

        if (loan.equalsIgnoreCase(LoanClasses.BUSINESS.name()))
            return new BusinessLoan();
        else if (loan.equalsIgnoreCase(LoanClasses.EDUCATION.name()))
            return new EducationLoan();
        else
            return new HomeLoan();
    }
}
