package day12;

import java.util.*;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args){
        Numbers numbers = new Numbers();
        numbers.addNumber(1);
        numbers.addNumber(2);
        numbers.addNumber(3);
        numbers.addNumber(1);

        System.out.println(numbers);
        List<Integer> numbersList1 = new ArrayList<>();
        numbersList1.add(4);
        numbersList1.add(8);
        numbersList1.add(5);
        numbersList1.add(7);
        System.out.println(numbersList1);

        Set<Integer> numbersSet = new HashSet<>(numbersList1);
        for (Integer temp : numbersSet){
            System.out.println(temp);
        }

        numbersList1 = numbersSet.stream().sorted().collect(Collectors.toList());
        System.out.println(numbersList1);
        for (Integer temp : numbersSet){
            System.out.println(temp);
        }



    }
}
class Numbers{
    private List<Integer> numbersList = new ArrayList<>();

    public Numbers() {

    }

    public List<Integer> getNumbersList() {
        return numbersList;
    }

    public void setNumbersList(List<Integer> numbersList) {
        this.numbersList = numbersList;
    }

    public void addNumber(int number){
        numbersList.add(number);
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "numbersList=" + numbersList +
                '}';
    }
}
