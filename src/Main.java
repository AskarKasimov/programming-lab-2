import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Spiritomb("Спиритомбик", 1));
        b.addAlly(new Skorupi("Скорупик", 1));
        b.addAlly(new Togepi("Тогепик", 1));

        b.addFoe(new Drapion("Драпик", 1));
        b.addFoe(new Togetic("Тогетик", 1));
        b.addFoe(new Togekiss("Тогекиссик", 1));
        b.go();
    }
}