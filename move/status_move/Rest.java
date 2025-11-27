package move.status_move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    protected void applySelfEffects(Pokemon p) {
        Effect eff = new Effect();
        eff.turns(1000);
        eff.condition(Status.SLEEP);
        p.setCondition(eff);
        p.setStats(0, 0, 0, 0, 0, 0);
    }

    @Override 
    protected String describe() {
        return "is falling asleep to restoring health";
    }
}