package myPokemons;

import myAttacks.Crunch;
import myAttacks.DarkPulse;
import myAttacks.PoisonSting;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Skorupi extends Pokemon {
    public Skorupi(String s, int i) {
        super(s, i);
        setStats(
                40,
                50,
                90,
                30,
                55,
                65
        );
        setType(Type.POISON, Type.BUG);
        setMove(
                new Crunch(),
                new DarkPulse(),
                new PoisonSting()
        );
    }
}
