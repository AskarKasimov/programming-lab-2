package myattacks;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        this.type = Type.NORMAL;
        this.power = 0;
        this.accuracy = 85;

        this.priority = 0;
        this.hits = 1;
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        pokemon.setMod(Stat.ATTACK, (int) (pokemon.getStat(Stat.ATTACK) * 1.5 * 1.5));
        Effect.confuse(pokemon);
    }

    @Override
    protected String describe() {
        return "Статус-атака Swagger!";
    }
}
