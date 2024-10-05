package myPokemons;

import myAttacks.FeintAttack;
import myAttacks.NastyPlot;
import myAttacks.OminousWind;
import myAttacks.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Spiritomb extends Pokemon {
    public Spiritomb(String s, int i) {
        super(s, i);
        setStats(
                50,
                92,
                108,
                92,
                108,
                35
        );
        setType(Type.GHOST, Type.DARK);
        setMove(
                new Swagger(),
                new NastyPlot(),
                new FeintAttack(),
                new OminousWind()
        );
    }
}
