package negocio;

import pokemones.Pokemon;

public class Batalla {
    private Entrenador e1;
    private Entrenador e2;
    private Pokemon p1;
    private Pokemon p2;

    public Batalla() {
        this.e1 = new Entrenador();
        this.e2 = new Entrenador();
        this.p1 = null;
        this.p2 = null;
    }

    public Batalla(Entrenador e1, Entrenador e2, Pokemon p1, Pokemon p2) {
        this.e1 = e1;
        this.e2 = e2;
        this.p1 = p1;
        this.p2 = p2;
    }

    public Entrenador getE1() {
        return e1;
    }

    public void setE1(Entrenador e1) {
        this.e1 = e1;
    }

    public Entrenador getE2() {
        return e2;
    }

    public void setE2(Entrenador e2) {
        this.e2 = e2;
    }

    public Pokemon getP1() {
        return p1;
    }

    public void setP1(Pokemon p1) {
        this.p1 = p1;
    }

    public Pokemon getP2() {
        return p2;
    }

    public void setP2(Pokemon p2) {
        this.p2 = p2;
    }

    public Pokemon iniciarBatalla (Pokemon atacante, Pokemon defensor) {
        System.out.println("\n--- PELEA!!! ---\n");
        if (atacante.atacar(defensor)) {
            System.out.println(atacante.obtenerEstadisticas());
            System.out.println(defensor.obtenerEstadisticas());
            return atacante;
        }
        if (defensor.atacar(atacante)) {
            System.out.println(atacante.obtenerEstadisticas());
            System.out.println(defensor.obtenerEstadisticas());
            return defensor;
        }
        System.out.println(atacante.obtenerEstadisticas());
        System.out.println(defensor.obtenerEstadisticas());
        return null;
    }
}
