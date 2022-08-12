//package jsong;
//
//import jsong.model.People;
//import jsong.model.Root;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//
//import java.io.FileReader;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Test {
//
//    public People parse() {
//
//        People people = new People();
//        JSONParser parser = new JSONParser();
//
//        try (FileReader file = new FileReader("test.json")) {
//
//            JSONObject rootJsonOb = (JSONObject) parser.parse(file);
//            String name = (String) rootJsonOb.get("name");
//
//            JSONArray jsonArray = (JSONArray) rootJsonOb.get("people");
//
//            List<People> listPeople = new ArrayList<>();
//            for (Object it : jsonArray) {
//                JSONObject peopleIt = (JSONObject) it;
//
//                String namePeople = (String) peopleIt.get("name");
//                long age = (Long) peopleIt.get("age");
//
//                People people = new People(namePeople, (int) age);
//                listPeople.add(people);
//            }
//            people.setName(name);
//            people.setPeople(listPeople);
//
//            return people;
//        } catch (Exception e) {
//            System.out.println("Hm" + e);
//        }
//
//
//        return null;
//    }
//}
