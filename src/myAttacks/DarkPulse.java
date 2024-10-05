package myAttacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DarkPulse extends SpecialMove {
    public DarkPulse() {
        this.type = Type.DARK;
        this.power = 80;
        this.accuracy = 100;

        this.priority = 0;
        this.hits = 1;
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (0.2 >= Math.random()) {
            Effect.flinch(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "Спецатака Dark Pulse!";
    }
}
