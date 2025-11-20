import ru.ifmo.se.pokemon.*;
import pokemon.*;
import move.special_move.*;
import move.physical_move.*;
import move.status_move.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Grubbin("Grubbin", 7));
        b.addAlly(new Charjabug("Charjabug", 49));
        b.addAlly(new Vikavolt("Vikavolt", 49));
        b.addFoe(new Cryogonal("Cryogonal", 33));
        b.addFoe(new Eevee("Eevee", 1));
        b.addFoe(new Sylveon("Sylveon", 20));    
        b.go();
    }
}