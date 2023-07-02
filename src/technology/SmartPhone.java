package technology;

public class SmartPhone extends Computer{

    public String carrier;

    public double planCost;

    public SmartPhone(String make, int yearMade, double cost, String carrier, double planCost) {
        super(make, yearMade, cost);
        this.carrier = carrier;
        this.planCost = planCost;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }


    public double getPlanCost() {
        return planCost;
    }

    public void setPlanCost(double planCost) {
        this.planCost = planCost;
    }

    public String shopAround() {
        if(planCost > 50.00) {
            return "Shop around!";
        } else return "This plan is within your budget.";
    }
}
