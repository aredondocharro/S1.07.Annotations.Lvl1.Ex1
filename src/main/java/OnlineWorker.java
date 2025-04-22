public class OnlineWorker extends Worker {
    private static final double INTERNET_FLAT_RATE = 30.0;

    public OnlineWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return super.getHourlyRate() * hoursWorked + INTERNET_FLAT_RATE;
    }
}