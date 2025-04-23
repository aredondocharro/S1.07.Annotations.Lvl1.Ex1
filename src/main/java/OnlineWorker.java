public class OnlineWorker extends Worker {
    private static final double internetFlatPrice = 30.0;

    public OnlineWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return super.getHourlyRate() * hoursWorked + internetFlatPrice;
    }
}