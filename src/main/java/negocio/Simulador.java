package negocio;

import java.io.Serializable;

public class Simulador implements Serializable {
    private AdministradorEntrenador administradorEntrenador;
    private PokemonBuilder pokemonBuilder;
    private Entrenador entrenadorSeleccionado;

    public Simulador() {
        this.administradorEntrenador = new AdministradorEntrenador();
        this.pokemonBuilder = new PokemonBuilder();
        this.entrenadorSeleccionado = null;
    }

    public Simulador(AdministradorEntrenador administradorEntrenador, PokemonBuilder pokemonBuilder, Entrenador entrenadorSeleccionado) {
        this.administradorEntrenador = administradorEntrenador;
        this.pokemonBuilder = pokemonBuilder;
        this.entrenadorSeleccionado = entrenadorSeleccionado;
    }

    public AdministradorEntrenador getAdministradorEntrenador() {
        return administradorEntrenador;
    }

    public void setAdministradorEntrenador(AdministradorEntrenador administradorEntrenador) {
        this.administradorEntrenador = administradorEntrenador;
    }

    public PokemonBuilder getAdministradorPokemon() {
        return pokemonBuilder;
    }

    public void setAdministradorPokemon(PokemonBuilder pokemonBuilder) {
        this.pokemonBuilder = pokemonBuilder;
    }

    public Entrenador getEntrenadorSeleccionado() {
        return entrenadorSeleccionado;
    }

    public void setEntrenadorSeleccionado(Entrenador entrenadorSeleccionado) {
        this.entrenadorSeleccionado = entrenadorSeleccionado;
    }
}

