package move.special_move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class DrainingKiss extends SpecialMove {
    public DrainingKiss() {
        super(Type.FAIRY, 50, 100);
    }

    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        int healAmount = (int) (damage * 0.75);
        att.setMod(Stat.HP, -healAmount);
    }

    @Override 
    protected String describe() {
        return "uses Draining Kiss and heals itself";
    }
}