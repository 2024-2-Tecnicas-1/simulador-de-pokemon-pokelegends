package pokemones;

import utils.Estado;
import utils.TipoPokemon;

import java.io.Serializable;

public abstract class Pokemon implements Serializable {
    protected String nombre;
    private double VIDA;
    private double ATAQUE;
    protected double puntosVida;
    protected double puntosAtaque;
    protected TipoPokemon tipo;
    protected TipoPokemon tipoAdicional;
    protected Estado estado;

    public Pokemon() {

    }

    public Pokemon(String nombre, double puntosVida, double puntosAtaque, TipoPokemon tipo, TipoPokemon tipoAdicional, Estado estado) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.puntosAtaque = puntosAtaque;
        this.tipo = tipo;
        this.tipoAdicional = tipoAdicional;
        this.estado = estado;
        VIDA = puntosVida;
        ATAQUE = puntosAtaque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public double getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public TipoPokemon getTipo() {
        return tipo;
    }

    public void setTipo(TipoPokemon tipo) {
        this.tipo = tipo;
    }

    public TipoPokemon getTipoAdicional() {
        return tipoAdicional;
    }

    public void setTipoAdicional(TipoPokemon tipoAdicional) {
        this.tipoAdicional = tipoAdicional;
    }

    public double getVIDA() {
        return VIDA;
    }

    public void setPuntosVida(double puntosVida) {
        this.puntosVida = puntosVida;
    }

    public void setPuntosAtaque(double puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public boolean atacar(Pokemon oponente) {
        //Realiza ataque al oponente teniendo en cuenta ventajas y desventajas, retorna si el oponente ya no tiene vida despues del ataque
        double damage = TipoPokemon.calcularMultiplicadorDeDamage(this.tipo, oponente.tipo);
        if (oponente.tipoAdicional != null) {
            if (TipoPokemon.calcularMultiplicadorDeDamage(this.tipo, oponente.tipoAdicional) > damage) {
                damage = TipoPokemon.calcularMultiplicadorDeDamage(this.tipo, oponente.tipoAdicional);
            }
        }
        double multiplicador = getMultiplicador(oponente, damage);

        oponente.recibirDamage(this.puntosAtaque * multiplicador);

        if (oponente.getPuntosVida() < 0) {
            oponente.setPuntosVida(0);
        }
        return oponente.getPuntosVida() == 0;
    }

    private double getMultiplicador(Pokemon oponente, double damage) {
        double damageAdicional = 0;
        if (this.tipoAdicional != null) {
            damageAdicional = TipoPokemon.calcularMultiplicadorDeDamage(this.tipoAdicional, oponente.tipo);
            if (TipoPokemon.calcularMultiplicadorDeDamage(this.tipo, oponente.tipoAdicional) > damage) {
                damageAdicional = TipoPokemon.calcularMultiplicadorDeDamage(this.tipoAdicional, oponente.tipoAdicional);
            }
        }
        return Math.max(damage, damageAdicional);
    }

    public void recibirDamage(double damage) {
        this.puntosVida -= damage;
        this.estado = Estado.DEBILITADO;
    }

    public void entrenar() {
        // subir estadisticas del pokemon
        this.puntosVida += 5;
        this.puntosAtaque += 3;
        VIDA = this.puntosVida;
        ATAQUE = this.puntosAtaque;
        System.out.println("\n+5 en vida y +3 en ataque!");
        System.out.println("Vida: " + this.puntosVida);
        System.out.println("Ataque: " + this.puntosAtaque);
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", VIDA=" + VIDA +
                ", ATAQUE=" + ATAQUE +
                ", puntosVida=" + puntosVida +
                ", puntosAtaque=" + puntosAtaque +
                ", tipo=" + tipo +
                ", tipoAdicional=" + tipoAdicional +
                ", estado=" + estado +
                '}';
    }

    public String obtenerEstadisticas () {
        return "Pokemon " + this.nombre + "(ATK " + this.puntosAtaque + ") -> " +
                "Vida restante: " + this.puntosVida;
    }
}
