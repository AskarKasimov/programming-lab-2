package myattacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class FireFang extends PhysicalMove {
    public FireFang() {
        this.type = Type.FIRE;
        this.power = 65;
        this.accuracy = 95;

        this.priority = 0;
        this.hits = 1;
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        super.applyOppDamage(pokemon, v);
        if (0.1 >= Math.random()) {
            Effect.burn(pokemon);
        }
        if (0.1 >= Math.random()) {
            Effect.flinch(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "Физатака Fire Fang!";
    }
}
