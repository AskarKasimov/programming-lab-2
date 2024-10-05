package mypokemons;

import myattacks.FireFang;
import ru.ifmo.se.pokemon.Type;

public class Drapion extends Skorupi {
    public Drapion(String s, int i) {
        super(s, i);
        setStats(
                70,
                90,
                110,
                60,
                75,
                95
        );
        setType(Type.POISON, Type.DARK);
        addMove(new FireFang());
    }
}
