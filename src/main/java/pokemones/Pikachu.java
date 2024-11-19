package pokemones;

import utils.Estado;
import utils.TipoPokemon;

public class Pikachu extends Pokemon {
    public Pikachu() {
        super("Pikachu", 35, 55, TipoPokemon.ELECTRICO, null, Estado.NORMAL);
    }

    public Pikachu(String nombre, double puntosVida, double puntosAtaque, Estado estado) {
        super(nombre, puntosVida, puntosAtaque, TipoPokemon.ELECTRICO, null, estado);
    }
}

