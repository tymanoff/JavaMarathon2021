package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing",2000, 10, 20);

        airplane.setYear(1999);
        airplane.setLength(15);

        airplane.fillUp(1);
        airplane.fillUp(2);

        airplane.info();


    }
}
