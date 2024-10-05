package myAttacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class NastyPlot extends StatusMove {
    public NastyPlot() {
        this.type = Type.DARK;
        this.power = 0;
        this.accuracy = 0;

        this.priority = 0;
        this.hits = 1;
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        pokemon.setMod(Stat.SPECIAL_ATTACK, (int) (pokemon.getStat(Stat.SPECIAL_ATTACK) * 1.5 * 1.5));
    }

    @Override
    protected String describe() {
        return "Статус-атака Nasty Plot!";
    }
}
