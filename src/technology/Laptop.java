package technology;

public class Laptop extends Computer{

    public boolean forGaming = true;

    public double screenSize;

    public String brand;


    public Laptop(String make, int yearMade, double cost, double screenSize, String brand) {
        super(make, yearMade, cost);
        this.screenSize = screenSize;
        this.brand = brand;
    }

    public boolean isForGaming() {
        return forGaming;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void isGamingLaptop() {
        if(brand.equalsIgnoreCase("Apple")) {
            forGaming = false;
        }
    }

    public String laptopForCoding() {
        if(screenSize < 14) {
            return "Purchase laptop with larger screen.";
        } else return "Screen size is appropriate.";
    }
}
