package pokemones;

import utils.Estado;
import utils.TipoPokemon;

public class Abra extends Pokemon {
    public Abra() {
        super("Abra", 25, 20, TipoPokemon.PSIQUICO, null, Estado.NORMAL);
    }

    public Abra(String nombre, double puntosVida, double puntosAtaque, Estado estado) {
        super(nombre, puntosVida, puntosAtaque, TipoPokemon.PSIQUICO, null, estado);
    }
}