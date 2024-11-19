package pokemones;

import utils.Estado;
import utils.TipoPokemon;

public class Charmander extends Pokemon {
    public Charmander() {
        super("Charmander", 39, 52, TipoPokemon.FUEGO, null, Estado.NORMAL);
    }

    public Charmander(String nombre, double puntosVida, double puntosAtaque, Estado estado) {
        super(nombre, puntosVida, puntosAtaque, TipoPokemon.FUEGO, null, estado);
    }
}
