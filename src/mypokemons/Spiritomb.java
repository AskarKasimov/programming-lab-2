package mypokemons;

import myattacks.FeintAttack;
import myattacks.NastyPlot;
import myattacks.OminousWind;
import myattacks.Swagger;
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
        addMove(new Swagger());
        addMove(new NastyPlot());
        addMove(new FeintAttack());
        addMove(new OminousWind());
    }
}
