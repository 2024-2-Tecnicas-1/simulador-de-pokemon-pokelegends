package pokemones;

import utils.Estado;
import utils.TipoPokemon;

public class Grimer extends Pokemon {
    public Grimer() {
        super("Grimer", 80, 80, TipoPokemon.VENENO, null, Estado.NORMAL);
    }

    public Grimer(String nombre, double puntosVida, double puntosAtaque, Estado estado) {
        super(nombre, puntosVida, puntosAtaque, TipoPokemon.VENENO, null, estado);
    }
}