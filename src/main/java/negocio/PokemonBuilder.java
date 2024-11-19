package negocio;

import pokemones.*;
import utils.Estado;

import java.io.Serializable;

public class PokemonBuilder implements Serializable {

    public Pokemon crearPokemon(String nombre) {
        return switch (nombre.toLowerCase()) {
            case "charmander" -> new Charmander();
            case "squirtle" -> new Squirtle();
            case "bulbasaur" -> new Bulbasaur();
            case "pikachu" -> new Pikachu();
            case "abra" -> new Abra();
            case "geodude" -> new Geodude();
            case "pidgey" -> new Pidgey();
            case "jigglypuff" -> new Jigglypuff();
            case "machop" -> new Machop();
            case "grimer" -> new Grimer();
            default -> throw new IllegalArgumentException("El pokemon " + nombre + " no fue reconocido!");
        };
    }

    public Pokemon crearPokemon(String nombre, double puntosVida, double puntosAtaque, Estado estado) {
        return switch (nombre.toLowerCase()) {
            case "charmander" -> new Charmander(nombre, puntosVida, puntosAtaque, estado);
            case "squirtle" -> new Squirtle(nombre, puntosVida, puntosAtaque, estado);
            case "bulbasaur" -> new Bulbasaur(nombre, puntosVida, puntosAtaque, estado);
            case "pikachu" -> new Pikachu(nombre, puntosVida, puntosAtaque, estado);
            case "abra" -> new Abra(nombre, puntosVida, puntosAtaque, estado);
            case "geodude" -> new Geodude(nombre, puntosVida, puntosAtaque, estado);
            case "pidgey" -> new Pidgey(nombre, puntosVida, puntosAtaque, estado);
            case "jigglypuff" -> new Jigglypuff(nombre, puntosVida, puntosAtaque, estado);
            case "machop" -> new Machop(nombre, puntosVida, puntosAtaque, estado);
            case "grimer" -> new Grimer(nombre, puntosVida, puntosAtaque, estado);
            default -> throw new IllegalArgumentException("El pokemon " + nombre + " no fue reconocido!");
        };
    }

    public Object crearPokemon(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}