package myAttacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Confide extends StatusMove {
    public Confide() {
        this.type = Type.NORMAL;
        this.power = 0;
        this.accuracy = 0;

        this.priority = 0;
        this.hits = 1;
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        pokemon.setMod(Stat.SPECIAL_ATTACK, (int) pokemon.getStat(Stat.SPECIAL_ATTACK) * 2 / 3);
    }

    @Override
    protected String describe() {
        return "Статус-атака Confide!";
    }
}
