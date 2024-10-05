package myPokemons;

import myAttacks.Confide;
import myAttacks.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Togepi extends Pokemon {
    public Togepi(String s, int i) {
        super(s, i);
        setStats(
                35,
                20,
                65,
                40,
                65,
                20
        );
        setType(Type.FAIRY);
        setMove(
                new Confide(),
                new Rest()
        );
    }
}
