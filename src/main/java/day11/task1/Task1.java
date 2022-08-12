package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        picker.doWork();
        picker.bonus();
        picker.doWork();
        picker.bonus();
        picker.bonus();



    }
}
