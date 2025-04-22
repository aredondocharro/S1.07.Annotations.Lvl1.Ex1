public class Main {
    public static void main(String[] args) {
        Worker generalWorker = new Worker("Alejandro", "Redondo", 20.0);
        OnlineWorker onlineWorker = new OnlineWorker("Jane", "Doe", 18.0);
        OnSiteWorker onsiteWorker = new OnSiteWorker("Ferran", "Garcia", 22.0);

        int hours = 160;

        System.out.println(generalWorker.getFullName() + " earns: " + generalWorker.calculateSalary(hours) + "€");
        System.out.println(onlineWorker.getFullName() + " earns: " + onlineWorker.calculateSalary(hours) + "€");
        System.out.println(onsiteWorker.getFullName() + " earns: " + onsiteWorker.calculateSalary(hours) + "€");
    }
}