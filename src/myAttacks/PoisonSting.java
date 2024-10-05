package myAttacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class PoisonSting extends PhysicalMove {
    public PoisonSting() {
        this.type = Type.POISON;
        this.power = 15;
        this.accuracy = 100;

        this.priority = 0;
        this.hits = 1;
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (0.3 >= Math.random()) {
            Effect.poison(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "Физатака Poison Sting!";
    }
}
