package pokemones;

import utils.Estado;
import utils.TipoPokemon;

public class Geodude extends Pokemon {
    public Geodude() {
        super("Geodude", 40, 80, TipoPokemon.ROCA, TipoPokemon.TIERRA, Estado.NORMAL);
    }

    public Geodude(String nombre, double puntosVida, double puntosAtaque, Estado estado) {
        super(nombre, puntosVida, puntosAtaque, TipoPokemon.ROCA, TipoPokemon.TIERRA, estado);
    }
}