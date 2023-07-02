package technology;

public class Computer {

    public String make;

    public int yearMade;

    public double cost;

    public boolean toReplace = false;

    public Computer(String make, int yearMade, double cost) {
        this.make = make;
        this.yearMade = yearMade;
        this.cost = cost;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYearMade() {
        return yearMade;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isToReplace() {
        return toReplace;
    }

    public void needsReplaced() {
        if(yearMade <= 2017) {
            toReplace = true;
        }
    }

    public String onSound() {
        return "Gong";
    }


}
