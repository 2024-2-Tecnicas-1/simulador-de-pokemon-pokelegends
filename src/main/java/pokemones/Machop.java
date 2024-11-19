package pokemones;

import utils.Estado;
import utils.TipoPokemon;

public class Machop extends Pokemon {
    public Machop() {
        super("Machop", 70, 80, TipoPokemon.LUCHA, null, Estado.NORMAL);
    }

    public Machop(String nombre, double puntosVida, double puntosAtaque, Estado estado) {
        super(nombre, puntosVida, puntosAtaque, TipoPokemon.LUCHA, null, estado);
    }
}
