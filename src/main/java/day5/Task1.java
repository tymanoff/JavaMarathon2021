package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Loli");
        car1.setColor("green");
        car1.setYear(2013);
        System.out.println("Модель " + car1.getModel() + " цвет " + car1.getColor() + " год выпуска " + car1.getYear());


    }
}
