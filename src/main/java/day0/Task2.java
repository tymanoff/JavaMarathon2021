package day0;


class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.run();
    }

    static int a = 0;

    public int run() {

        for (int a = 0; a < 1 ;){

            System.out.println(a++ + ++a);
            a++;
        }
        System.out.println(a);
        return a;
    }
}



