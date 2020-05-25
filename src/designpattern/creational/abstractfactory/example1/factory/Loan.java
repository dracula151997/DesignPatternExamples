package designpattern.creational.abstractfactory.example1.factory;

public abstract class Loan {
    protected double rate;

    abstract void getInterestRate(double rate);

    public void calculateLoanPayment(double loanAmount, int years) {
        /**
         * How to calculate the monthly loan payment (e.g EMI)
         *
         * rate = annual interest rate / 12 * 100
         * n = number of monthly installments
         * 1 year = 12 month
         * n = year * 12
         */

        double emi;
        int n;

        n = years * 12;
        rate = rate / 1200;
        emi = ((rate * Math.pow((1 + rate), n)) / ((Math.pow((1 + rate), n)) - 1)) * loanAmount;
        System.out.println("your monthly EMI is " + emi + " for the amount " + loanAmount + " you have borrowed");
    }
}
