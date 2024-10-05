package mypokemons;

import myattacks.Confide;
import myattacks.Rest;
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
        addMove(new Confide());
        addMove(new Rest());
    }
}
