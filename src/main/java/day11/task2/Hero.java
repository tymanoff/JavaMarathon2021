package day11.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NonNull
public abstract class Hero {

//    private String name;
    private int health;
    private double physDef;
    private double magicDef;
    private int physAtt;
    private int magicAtt;
    private int healHimself;
    private int healTeammate;

    public void checkHealth() {
        if (this.health > 100) {
            this.health = 100;
        } else if (this.health < 0) {
            this.health = 0;
        }
    }
}
