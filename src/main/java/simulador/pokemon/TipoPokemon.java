package simulador.pokemon;

public class TipoPokemon {
    FUEGO, AGUA, PLANTA, ELECTRICO, PSIQUICO, ROCA, NORMAL, VENENO, HADA, LUCHA, VOLADOR, TIERRA;

    public static double obtenerMultiplicadorDeDanio(TipoPokemon atacante, TipoPokemon defensor) {
        // Aquí irían las reglas de ventaja/desventaja entre tipos
        // Por ejemplo: fuego tiene ventaja sobre planta, etc.
        return 1.0; // Temporalmente devolvemos un multiplicador neutro
    }
}

