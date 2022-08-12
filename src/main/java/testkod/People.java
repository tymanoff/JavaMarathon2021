package testkod;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class People {
    private String lastname;
    private String firstname;
    private String patronymic;

    public String getPersonName() {
        StringBuilder name = new StringBuilder();
        if (lastname != null) {
            name.append(lastname);
        } else {
            return "";
        }
        if (firstname != null && firstname.length() > 0) {
            name.append(" " + firstname.substring(0, 1) + ".");
        } else {
            return name.toString();
        }
        if (patronymic != null && patronymic.length() > 0){
            name.append(patronymic.substring(0, 1) + ".");
        }else {
            return name.toString();
        }

        return name.toString();
    }
}
