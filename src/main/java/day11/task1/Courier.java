package day11.task1;

public class Courier implements Worker{
    private double salary;
    private boolean isPayed;
    private Warehouse warehouse;
    private boolean isBonusTake;

    public Courier(double salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        this.salary += 100;
        this.warehouse.setCountDeliveredOrders(this.warehouse.getCountDeliveredOrders()+1);
    }

    @Override
    public void bonus() {
        if(isBonusTake){
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if(this.warehouse.getCountDeliveredOrders()>=10000){
            this.salary += 50000;
            isBonusTake = true;
            System.out.println("Бонус уже был выплачен");
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }
}
