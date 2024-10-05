package myPokemons;

import myAttacks.Flamethrower;
import ru.ifmo.se.pokemon.Type;

public class Togekiss extends Togetic {
    public Togekiss(String s, int i) {
        super(s, i);
        setStats(
                85,
                50,
                95,
                120,
                115,
                80
        );
        setType(Type.FAIRY, Type.FLYING);
        addMove(new Flamethrower());
    }
}
