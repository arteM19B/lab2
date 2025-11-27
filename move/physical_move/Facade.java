package move.physical_move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;
import static ru.ifmo.se.pokemon.Status.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }
    
    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        double baseDamage = super.calcBaseDamage(att, def);
        Status cond = att.getCondition();
        super.calcBaseDamage(att, def);
        if (cond.equals(BURN) || cond.equals(POISON) || cond.equals(PARALYZE)) {
            System.out.println("damage received from: " + def.toString());
            return baseDamage * 2;
        }
        System.out.println("damage received from: " + def.toString());
        return baseDamage;
    }

    @Override
    protected String describe() {
        return "attacks powerfully";
    }
}