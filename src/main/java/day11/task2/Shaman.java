package day11.task2;

public class Shaman extends Hero implements PhysAttack,MagicAttack,Healer{


    public Shaman(int health, double physDef, double magicDef, int physAtt, int magicAtt, int healHimself, int healTeammate) {
        super(health, physDef, magicDef, physAtt, magicAtt, healHimself, healTeammate);
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + this.getHealth() +
                '}';
    }

    @Override
    public void Healer() {
        this.setHealth(this.getHealth()+this.getHealHimself());
        this.checkHealth();
    }

    @Override
    public void HealerTeammate(Hero hero) {
        hero.setHealth(hero.getHealth()+this.getHealTeammate());
        hero.checkHealth();
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
