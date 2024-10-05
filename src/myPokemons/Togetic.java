package myPokemons;

import myAttacks.SweetKiss;
import ru.ifmo.se.pokemon.Type;

public class Togetic extends Togepi {
    public Togetic(String s, int i) {
        super(s, i);
        setStats(
                55,
                40,
                85,
                80,
                105,
                40
        );
        addType(Type.FAIRY);
        addMove(new SweetKiss());
    }
}
