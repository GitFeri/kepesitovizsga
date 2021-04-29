package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Army {
    List<MilitaryUnit> militaries = new ArrayList<>();

    public void addUnit(MilitaryUnit unit) {
        militaries.add(unit);
    }

    public int getArmySize() {
        return militaries.size();
    }

    public int getArmyDamage() {
        int result = 0;
        for (MilitaryUnit unit: militaries             ) {
            result += unit.doDamage();
        }
        return result;
    }

    public void damageAll(int damage) {
        Iterator<MilitaryUnit> units = militaries.iterator();
        while (units.hasNext()) {
            MilitaryUnit unit = units.next();
            unit.sufferDamage(damage);
            if (unit.doDamage() < 25) {
               units.remove();
            }

        }
    }
}
