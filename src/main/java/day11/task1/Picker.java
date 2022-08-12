package day11.task1;

public class Picker implements Worker{
    private double salary;
    private boolean isPayed;
    private Warehouse warehouse;
    private boolean isBonusTake;

    public Picker(double salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
    }

    public Picker(Warehouse warehouse) {
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
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        this.salary += 80;
        this.warehouse.setCountPickedOrders(this.warehouse.getCountPickedOrders()+1);
    }


    @Override
    public void bonus() {
        if(isBonusTake){
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if(this.warehouse.getCountPickedOrders()>=10000){
            this.salary += 70000;
            isBonusTake = true;
            System.out.println("Бонус уже был выплачен");
        } else {
            System.out.println("Бонус пока не доступен");
        }

    }
}
