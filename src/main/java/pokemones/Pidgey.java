package pokemones;

import utils.Estado;
import utils.TipoPokemon;

public class Pidgey extends Pokemon {
    public Pidgey() {
        super("Pidgey", 40, 45, TipoPokemon.NORMAL, TipoPokemon.VOLADOR, Estado.NORMAL);
    }

    public Pidgey(String nombre, double puntosVida, double puntosAtaque, Estado estado) {
        super(nombre, puntosVida, puntosAtaque, TipoPokemon.NORMAL, TipoPokemon.VOLADOR, estado);
    }
}
