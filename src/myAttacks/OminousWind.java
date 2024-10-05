package myAttacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class OminousWind extends SpecialMove {
        public OminousWind() {
        this.type = Type.GHOST;
        this.power = 60;
        this.accuracy = 100;

        this.priority = 0;
        this.hits = 1;
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        if (0.1 >= Math.random()) {
            pokemon.setStats(
                    pokemon.getHP(),
                    pokemon.getStat(Stat.ATTACK) * 1.5,
                    pokemon.getStat(Stat.DEFENSE) * 1.5,
                    pokemon.getStat(Stat.SPECIAL_ATTACK) * 1.5,
                    pokemon.getStat(Stat.SPECIAL_DEFENSE) * 1.5,
                    pokemon.getStat(Stat.SPEED) * 1.5
            );
        }
    }

    @Override
    protected String describe() {
        return "Спецатака Ominous Wind!";
    }
}
