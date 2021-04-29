package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {
    private Boolean shieldIsIntact = true;

    public Swordsman(Boolean hasArmor) {
        super(100, 10, hasArmor);
    }

    @Override
    public void sufferDamage(int damage) {
        if (shieldIsIntact) {
            shieldIsIntact = false;
        } else {
            super.sufferDamage(damage);
        }
    }
}
