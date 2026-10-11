
public class DriverApp {

    public static void main(String[] args) {

        Driver driver1 = new Driver("D1001", "John Smith",
                4000.0, 5);

        Driver driver2 = new Driver("D1002", "Emily Davis",
                3500.0);

        driver2.setPerformanceScore(3);

        Driver driver3 = new Driver("D1003", "Michael Johnson");

        driver3.setDriverID("D1003");

        // Demonstrating the first constructor
        Driver tempDriver = new Driver("D1004", "Test Driver");

        // Driver 3 with salary and score
        driver3 = new Driver("D1003", "Michael Johnson",
                5000.0, 1);

        driver1.displayDetails();
        driver2.displayDetails();
        driver3.displayDetails();

        System.out.println(
                "Bonus for driver3 with custom rating 4: "
                        + driver3.calculateBonus(4)
        );
    }
}
