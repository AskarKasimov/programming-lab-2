package myattacks;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        this.type = Type.PSYCHIC;
        this.power = 0;
        this.accuracy = 0;

        this.priority = 0;
        this.hits = 1;
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        Effect restSleep = (new Effect()).condition(Status.SLEEP).attack(0.0).turns(2);
        pokemon.setCondition(restSleep);
        pokemon.setMod(Stat.HP, 100); // TODO: heal to user's max, not to const
    }

    @Override
    protected String describe() {
        return "Статус-атака Rest!";
    }
}
