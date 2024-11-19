package pokemones;

import utils.Estado;
import utils.TipoPokemon;

public class Jigglypuff extends Pokemon {
    public Jigglypuff() {
        super("Jigglypuff", 115, 45, TipoPokemon.NORMAL, TipoPokemon.HADA, Estado.NORMAL);
    }

    public Jigglypuff(String nombre, double puntosVida, double puntosAtaque, Estado estado) {
        super(nombre, puntosVida, puntosAtaque, TipoPokemon.NORMAL, TipoPokemon.HADA, estado);
    }
}