package negocio;

import pokemones.Pokemon;
import utils.Estado;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Entrenador implements Serializable {
    private String nombre;
    List<Pokemon> equipo;

    public Entrenador() {
        this.equipo = new ArrayList<>();
    }

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.equipo = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pokemon> getEquipo() {
        return equipo;
    }

    public void agregarPokemon (Pokemon pokemon) {
        this.equipo.add(pokemon);
    }

    public void entrenarPokemon (Pokemon pokemon) {
        for (Pokemon p : this.equipo) {
            if (p.equals(pokemon)) {
                p.entrenar();
            }
        }
    }

    public Pokemon buscarPokemon (String nombre) {
        for (Pokemon p : this.equipo) {
            if (p.getNombre().equals(nombre)) {
                return p;
            }
        }
        return null;
    }

    public void mostrarPokemones () {
        System.out.println("\n--- POKEMONES ---");
        for (Pokemon p : this.equipo) {
            System.out.println(p.toString());
        }
    }

    public Pokemon prepararBatalla (String nombre) {
        for (Pokemon p : this.equipo) {
            if (p.getNombre().equals(nombre)) {
                return p;
            }
        }
        return null;
    }

    public void curarPokemones () {
        for (Pokemon p : this.equipo) {
            if (p.getEstado().equals(Estado.DEBILITADO)) {
                p.setPuntosVida(p.getVIDA());
                p.setEstado(Estado.NORMAL);
            }
        }
    }

    public boolean eliminarPokemon (String nombre) {
        Pokemon buscar = buscarPokemon(nombre);
        if (buscar == null) return false;
        this.equipo.remove(buscar);
        return true;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "nombre='" + nombre + '\'' +
                ", equipo=" + equipo +
                '}';
    }
}