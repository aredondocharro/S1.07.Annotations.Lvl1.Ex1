public class OnSiteWorker extends Worker {
    public static double fuelCost = 50.0;

    public OnSiteWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return super.getHourlyRate() * hoursWorked + fuelCost;
    }
}