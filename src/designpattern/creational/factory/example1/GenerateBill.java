package designpattern.creational.factory.example1;

import java.util.Scanner;

public class GenerateBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PlanFactory planFactory = new PlanFactory();

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        String planName = scanner.nextLine();

        System.out.print("Enter the number of units for bill will be calculated: ");
        int unit = scanner.nextInt();

        Plan plan = planFactory.getPlan(planName);

        System.out.print("Bill amount for " + planName + " of  " + unit + " units is: ");
        plan.getRate();
        plan.calculateBill(unit);


    }
}
