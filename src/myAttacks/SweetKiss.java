package myAttacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SweetKiss extends StatusMove {
    public SweetKiss() {
        this.type = Type.FAIRY;
        this.power = 0;
        this.accuracy = 75;

        this.priority = 0;
        this.hits = 1;
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        Effect.confuse(pokemon);
    }

    @Override
    protected String describe() {
        return "Статус-атака Sweet Kiss!";
    }
}
