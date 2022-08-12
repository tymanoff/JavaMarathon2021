package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Loli");
        car.setColor("green");
        car.setYear(2013);


        car.info();
        System.out.println(car.yearDifference(1900));


        Motorbike motorbike = new Motorbike("Harli","black",1999);
        motorbike.info();
        System.out.println(motorbike.yearDifference(1900));



    }
}
