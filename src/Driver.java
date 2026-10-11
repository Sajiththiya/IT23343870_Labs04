
public class Driver {

    private String driverID;
    private String driverName;
    private double baseSalary;
    private int performanceScore;

    // Constructor 1
    public Driver(String driverID, String driverName) {
        this(driverID, driverName, 0, 1);
    }

    // Constructor 2
    public Driver(String driverID, String driverName,
                  double baseSalary) {
        this(driverID, driverName, baseSalary, 1);
    }

    // Constructor 3
    public Driver(String driverID, String driverName,
                  double baseSalary, int performanceScore) {
        this.driverID = driverID;
        this.driverName = driverName;
        this.baseSalary = baseSalary;
        setPerformanceScore(performanceScore);
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public int getPerformanceScore() {
        return performanceScore;
    }

    public void setPerformanceScore(int performanceScore) {
        if (performanceScore >= 1 && performanceScore <= 5) {
            this.performanceScore = performanceScore;
        } else {
            this.performanceScore = 1;
        }
    }

    public double calculateBonus() {
        return calculateBonus(performanceScore);
    }

    public double calculateBonus(int score) {
        double percentage;

        switch (score) {
            case 5:
                percentage = 0.25;
                break;
            case 4:
                percentage = 0.20;
                break;
            case 3:
                percentage = 0.15;
                break;
            case 2:
                percentage = 0.10;
                break;
            default:
                percentage = 0;
        }

        return baseSalary * percentage;
    }

    public double calculateTotalSalary() {
        return baseSalary + calculateBonus();
    }

    public void displayDetails() {
        System.out.println("Driver ID: " + driverID);
        System.out.println("Name: " + driverName);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Performance Score: " + performanceScore);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + calculateTotalSalary());
        System.out.println();
    }
}
