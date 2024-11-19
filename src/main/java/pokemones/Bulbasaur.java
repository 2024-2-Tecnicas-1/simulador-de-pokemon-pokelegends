package pokemones;

import utils.Estado;
import utils.TipoPokemon;

public class Bulbasaur extends Pokemon {
    public Bulbasaur() {
        super("Bulbasaur", 45, 49, TipoPokemon.PLANTA, TipoPokemon.VENENO, Estado.NORMAL);
    }

    public Bulbasaur(String nombre, double puntosVida, double puntosAtaque, Estado estado) {
        super(nombre, puntosVida, puntosAtaque, TipoPokemon.PLANTA, TipoPokemon.VENENO, estado);
    }
}