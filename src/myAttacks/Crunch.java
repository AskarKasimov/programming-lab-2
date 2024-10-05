package myAttacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Crunch extends PhysicalMove {
    public Crunch() {
        this.type = Type.DARK;
        this.power = 80;
        this.accuracy = 100;

        this.priority = 0;
        this.hits = 1;
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        super.applyOppDamage(pokemon, v);
        if (0.2 >= Math.random()) {
            pokemon.setMod(Stat.DEFENSE, (int) pokemon.getStat(Stat.DEFENSE) * 2 / 3);
        }
    }

    @Override
    protected String describe() {
        return "Физатака Crunch!";
    }
}
