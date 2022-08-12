package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior(100, 0.8, 0,30,0, 0 ,0);
        Paladin paladin = new Paladin(100, 0.5, 0.2,15,0, 25,10);
        Magician magician = new Magician(100, 0, 0.8,5, 20, 0, 0);
        Shaman shaman = new Shaman(100, 0.2, 0.2, 10, 15, 50, 30);

        warrior.PhysAttack(paladin);
        System.out.println(paladin.toString());
        paladin.PhysAttack(magician);
        System.out.println(magician.toString());
        shaman.HealerTeammate(magician);
        System.out.println(magician.toString());
        magician.MagicAttack(paladin);
        System.out.println(paladin.toString());
        shaman.PhysAttack(warrior);
        System.out.println(warrior.toString());
        paladin.Healer();
        System.out.println(paladin.toString());
        warrior.PhysAttack(magician);
        System.out.println(magician.toString());
        warrior.PhysAttack(magician);
        System.out.println(magician.toString());
        warrior.PhysAttack(magician);
        System.out.println(magician.toString());
        warrior.PhysAttack(magician);
        System.out.println(magician.toString());
        warrior.PhysAttack(magician);
        System.out.println(magician.toString());




    }
}
