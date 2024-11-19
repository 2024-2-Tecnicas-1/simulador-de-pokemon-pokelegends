package pokemones;

import utils.Estado;
import utils.TipoPokemon;

public class Squirtle extends Pokemon {
    public Squirtle() {
        super("Squirtle", 44, 48, TipoPokemon.AGUA, null, Estado.NORMAL);
    }

    public Squirtle(String nombre, double puntosVida, double puntosAtaque, Estado estado) {
        super(nombre, puntosVida, puntosAtaque, TipoPokemon.AGUA, null, estado);
    }
}
