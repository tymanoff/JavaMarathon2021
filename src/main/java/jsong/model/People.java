package jsong.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class People {
    private String name;
    private int age;

    public String getPersonName(){

        return getName();
    }


}
