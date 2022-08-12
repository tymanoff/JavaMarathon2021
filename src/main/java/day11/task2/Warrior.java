package day11.task2;

public class Warrior extends Hero implements PhysAttack{


    public Warrior(int health, double physDef, double magicDef, int physAtt, int magicAtt, int healHimself, int healTeammate) {
        super(health, physDef, magicDef, physAtt, magicAtt, healHimself, healTeammate);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + this.getHealth() +
                '}';
    }

    @Override
    public void PhysAttack(Hero hero) {
        hero.setHealth((int) (hero.getHealth()-(this.getPhysAtt()-this.getPhysAtt()*hero.getPhysDef())));
        hero.checkHealth();
    }
}
