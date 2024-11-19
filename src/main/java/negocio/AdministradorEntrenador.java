package negocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AdministradorEntrenador implements Serializable {
    private List<Entrenador> entrenadores;

    public AdministradorEntrenador() {
        this.entrenadores = new ArrayList<>();
    }

    public void agregarEntrenador (Entrenador entrenador) {
        this.entrenadores.add(entrenador);
    }

    public Entrenador buscarEntrenador (String nombre) {
        for (Entrenador entrenador : this.entrenadores) {
            if (entrenador.getNombre().equals(nombre)) {
                return entrenador;
            }
        }
        return null;
    }

    public List<Entrenador> getEntrenadores() {
        return this.entrenadores;
    }

    public boolean eliminarEntrenador (Entrenador entrenador) {
        for (Entrenador e : this.entrenadores) {
            if (e.equals(entrenador)) {
                this.entrenadores.remove(e);
                return true;
            }
        }
        return false;
    }

    public void mostrarEntrenadores () {
        System.out.println("\n--- ENTRENADORES ---");
        for (Entrenador entrenador : this.entrenadores) {
            System.out.println(entrenador.toString());
        }
    }
}

