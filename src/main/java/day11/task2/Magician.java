package day11.task2;

public class Magician extends Hero implements PhysAttack,MagicAttack{


    public Magician(int health, double physDef, double magicDef, int physAtt, int magicAtt, int healHimself, int healTeammate) {
        super(health, physDef, magicDef, physAtt, magicAtt, healHimself, healTeammate);
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + this.getHealth() +
                '}';
    }

    @Override
    public void PhysAttack(Hero hero) {
        hero.setHealth((int) (hero.getHealth()-(this.getPhysAtt()-this.getPhysAtt()*hero.getPhysDef())));
        hero.checkHealth();
    }

    @Override
    public void MagicAttack(Hero hero) {
        hero.setHealth((int) (hero.getHealth()-(this.getMagicAtt()-this.getMagicAtt()*hero.getMagicDef())));
        hero.checkHealth();
    }
}
