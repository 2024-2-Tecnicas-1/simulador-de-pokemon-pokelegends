package simulador.entrenador;

import simulador.pokemon.Pokemon;

public class Entrenador {
    public String nombre;
    private Pokemon pokemon;

    public Entrenador(String nombre, Pokemon pokemon) {
        this.nombre = nombre;
        this.pokemon = pokemon;
    }

    public void seleccionarPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void enviarPokemon() {
        System.out.println(nombre + "envió a" + pokemon.nombre);
    }

    public Pokemon getPokemon() {
        return pokemon;
    }
}

