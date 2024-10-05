package myattacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Flamethrower extends SpecialMove {
    public Flamethrower() {
        this.type = Type.FIRE;
        this.power = 90;
        this.accuracy = 100;

        this.priority = 0;
        this.hits = 1;
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        super.applyOppDamage(pokemon, v);
        // TODO: Water Veil check, but not my case
        if (0.1 >= Math.random()) {
            Effect.burn(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "Спецатака Flamethrower!";
    }
}
