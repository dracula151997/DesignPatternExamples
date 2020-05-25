package designpattern.creational.abstractfactory.example1.factory;

import designpattern.creational.abstractfactory.example1.Bank;

import java.util.Scanner;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of Bank from where you want to take loan amount: ");
        String name = scanner.nextLine();

        System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");
        String loan = scanner.nextLine();

        AbstractFactory bankFactory = FactoryCreator.getFactory(FactoryCreator.BANK);
        Bank bank = bankFactory.getBank(name);
        System.out.println("Bank name: " + bank.name());

        AbstractFactory loanFactory = FactoryCreator.getFactory(FactoryCreator.LOAN);
        Loan loan1 = loanFactory.getLoan(loan);

        loan1.getInterestRate(3.5);
        loan1.calculateLoanPayment(10, 2);


    }
}
