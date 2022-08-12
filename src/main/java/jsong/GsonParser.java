package jsong;

import com.google.gson.Gson;
import jsong.model.People;

import java.io.FileReader;

public class GsonParser {

    public People parser(){

        Gson gson = new Gson();

        try (FileReader file = new FileReader("test.json")) {

            People people = gson.fromJson(file, People.class);

            return people;
        } catch (Exception e) {
            System.out.println("Hm" + e);
        }

        return null;
    }
}
