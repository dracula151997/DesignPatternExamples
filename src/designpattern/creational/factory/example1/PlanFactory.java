package designpattern.creational.factory.example1;

public class PlanFactory {

    public Plan getPlan(String planType) {
        switch (planType) {
            case "InstitutionalPlan":
                return new InstitutionalPlan();
            case "CommercialPlan":
                return new CommercialPlan();
            case "DomesticPlan":
                return new DomesticPlan();
            default:
                return null;

        }
    }
}
