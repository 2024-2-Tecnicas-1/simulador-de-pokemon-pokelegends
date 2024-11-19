package utils;

import java.io.Serializable;

public enum TipoPokemon implements Serializable {
    FUEGO, AGUA, PLANTA, VENENO, ELECTRICO, PSIQUICO, ROCA, TIERRA, NORMAL, VOLADOR, HADA, LUCHA, ACERO, BICHO, HIELO, FANTASMA;

    public static double calcularMultiplicadorDeDamage(TipoPokemon atacante, TipoPokemon defensor) {
        switch (atacante) {
            case FUEGO:
                return switch (defensor) {
                    case AGUA, ROCA, ACERO -> 0.5;
                    case PLANTA, BICHO, HIELO -> 2.0;
                    default -> 1.0;
                };
            case AGUA:
                return switch (defensor) {
                    case FUEGO, ROCA -> 2.0;
                    case PLANTA -> 0.5;
                    default -> 1.0;
                };
            case PLANTA:
                return switch (defensor) {
                    case FUEGO, ACERO, VENENO, BICHO -> 0.5;
                    case AGUA, ROCA, TIERRA -> 2.0;
                    default -> 1.0;
                };
            case VENENO:
                return switch (defensor) {
                    case PLANTA, HADA -> 2.0;
                    case FANTASMA, ROCA -> 0.5;
                    default -> 1.0;
                };
            case ELECTRICO:
                return switch (defensor) {
                    case AGUA, VOLADOR -> 2.0;
                    case PLANTA -> 0.5;
                    case TIERRA -> 0.0;
                    default -> 1.0;
                };
            case PSIQUICO:
                return switch (defensor) {
                    case VENENO, LUCHA -> 2.0;
                    default -> 1.0;
                };
            case ROCA:
                return switch (defensor) {
                    case FUEGO, HIELO, VOLADOR, BICHO, ACERO -> 2.0;
                    case LUCHA -> 0.5;
                    default -> 1.0;
                };
            case TIERRA:
                return switch (defensor) {
                    case FUEGO, ACERO, VENENO, ROCA -> 2.0;
                    case ELECTRICO -> 0.0;
                    case VOLADOR -> 0.5;
                    default -> 1.0;
                };
            case NORMAL:
                switch (defensor) {
                    case FANTASMA: return 0.0;
                    default: return 1.0;
                }
            case VOLADOR:
                return switch (defensor) {
                    case PLANTA, ELECTRICO, BICHO -> 2.0;
                    case ROCA -> 0.5;
                    default -> 1.0;
                };
            case HADA:
                switch (defensor) {
                    case PSIQUICO: return 2.0;
                    default: return 1.0;
                }
            case LUCHA:
                return switch (defensor) {
                    case NORMAL, ROCA, HIELO -> 2.0;
                    case FANTASMA, PSIQUICO, HADA -> 0.5;
                    default -> 1.0;
                };
            case ACERO:
                return switch (defensor) {
                    case HADA, FUEGO, ROCA, LUCHA -> 2.0;
                    case PSIQUICO -> 0.5;
                    default -> 1.0;
                };
            case BICHO:
                return switch (defensor) {
                    case PLANTA, VOLADOR -> 2.0;
                    case ACERO, FANTASMA -> 0.5;
                    default -> 1.0;
                };
            case HIELO:
                return switch (defensor) {
                    case PLANTA, TIERRA -> 2.0;
                    default -> 1.0;
                };
            case FANTASMA:
                return switch (defensor) {
                    case FANTASMA -> 2.0;
                    case NORMAL -> 0.0;
                    case VENENO -> 0.5;
                    default -> 1.0;
                };
            default:
                return 1.0;
        }
    }
}

