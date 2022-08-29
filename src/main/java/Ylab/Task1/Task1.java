package Ylab.Task1;

public class Task1 {
    public static void main(String[] args) {

        int[][] array = getRandomNumber();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                if (array[i][y] > max) {
                    max = array[i][y];
                }
                if (array[i][y] < min) {
                    min = array[i][y];
                }

            }
        }
        int average = getAverage(array);

        System.out.println("Максимальное значение в массиве " + max);
        System.out.println("Минимальное значение в массиве " + min);
        System.out.println("Среднее арехметическое значение в массиве " + average);
    }

    public static int[][] getRandomNumber() {

        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                array[i][y] = (int) (Math.random() * 100);
            }
        }

        return array;
    }

    public static int getAverage(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int y = 0; y < arr[i].length; y++) {
                sum = sum + arr[i][y];
            }
        }
        return sum/(arr.length*arr[0].length);
    }
}

