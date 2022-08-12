package jsong;

import jsong.model.People;


public class Main {
    public static void main(String[] args) {
//        Test parserTest = new Test();
//        Root root = parserTest.parse();


        GsonParser gsonParser = new GsonParser();
        People people = gsonParser.parser();

        System.out.println(people.getPersonName().charAt(0) +
                " " +
                people.getPersonName().charAt(1) +
                ". ");
    }
}
