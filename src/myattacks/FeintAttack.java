package myattacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class FeintAttack extends PhysicalMove {
    public FeintAttack() {
        this.type = Type.DARK;
        this.power = 60;
        this.accuracy = 10000; // no miss

        this.priority = 0;
        this.hits = 1;
    }

    @Override
    protected String describe() {
        return "Физатака Feint Attack!";
    }
}
