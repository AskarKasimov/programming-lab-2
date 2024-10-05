import myPokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.addAlly(new Spiritomb("Спиритомбик", 1));
        battle.addAlly(new Skorupi("Скорупик", 1));
        battle.addAlly(new Togepi("Тогепик", 1));

        battle.addFoe(new Drapion("Драпик", 1));
        battle.addFoe(new Togetic("Тогетик", 1));
        battle.addFoe(new Togekiss("Тогекиссик", 1));
        battle.go();
    }
}