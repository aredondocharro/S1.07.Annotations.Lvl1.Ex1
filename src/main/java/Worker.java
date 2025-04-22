public class Worker {
    private String name;
    private String surname;
    private double hourlyRate;

    public Worker(String name, String surname, double hourlyRate) {
        this.name = name;
        this.surname = surname;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(int hoursWorked) {
        return hourlyRate * hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public String getFullName() {
        return name + " " + surname;
    }
}