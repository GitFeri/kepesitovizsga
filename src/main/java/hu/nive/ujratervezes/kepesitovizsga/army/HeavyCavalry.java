package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {
    private int numOfDamage = 0;

    public HeavyCavalry() {
        super(150, 20, true);
    }

    @Override
    public int doDamage() {
        numOfDamage++;
        if (numOfDamage == 1) {
            return super.doDamage() * 3;
        }
        return super.doDamage();
    }
}
