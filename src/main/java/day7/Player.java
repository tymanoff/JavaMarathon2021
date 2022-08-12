package day7;

import java.util.Random;

public class Player {
    private int stamina;
    private static int countPlayers;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        if(stamina<0){
            stamina = MIN_STAMINA;
        }
        return stamina;
    }

    public void run() {
        this.stamina = this.stamina - 1;
        if (this.stamina == 0) {
            countPlayers = countPlayers - 1;
        }
    }
    public static void info(){
        if(countPlayers<6){
            int pay = 6 - countPlayers;
            System.out.println("Команды неполные. На поле еще есть " + pay + "свободных мест");
        }else System.out.println("На поле нет свободных мест");
    }
}
