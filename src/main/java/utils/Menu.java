package utils;

public class Menu {
    public static void mostrarMenuPrincipal () {
        System.out.println("\n----- Simulador de Batallas Pokemon -----");
        System.out.println("1. Gestionar Entrenadores");
        System.out.println("2. Gestionar Pokemones");
        System.out.println("3. Iniciar simulacion de batalla");
        System.out.println("4. Cargar simulador");
        System.out.println("5. Guardar simulador");
        System.out.println("6. Salir");
        System.out.print("Elige una opcion: ");
    }

    public static void mostrarMenuGestionEntrenadores() {
        System.out.println("\nGestionar Entrenadores");
        System.out.println("1. Registrar nuevo entrenador");
        System.out.println("2. Ver lista de entrenadores");
        System.out.println("3. Seleccionar un entrenador");
        System.out.println("4. Eliminar entrenador");
        System.out.println("5. Volver al menu principal");
        System.out.print("Elige una opcion: ");
    }

    public static void mostrarMenuGestionPokemon(String entrenador) {
        System.out.println("\nBienvenido entrenador " + entrenador + "!");
        System.out.println("--- Gestionar Pokemones ---");
        System.out.println("1. Ver todos los Pokemones registrados");
        System.out.println("2. Registrar nuevo Pokemon");
        System.out.println("3. Registrar nuevo Pokemon con valores personalizados");
        System.out.println("4. Entrenar un pokemon");
        System.out.println("5. Eliminar un pokemon");
        System.out.println("6. Curar pokemones heridos");
        System.out.println("7. Volver al menu principal");
        System.out.print("Elige una opcion: ");
    }

    public static void mostrarMenuBatalla() {
        System.out.println("\n--- Menu de batalla ---");
        System.out.println("1. Elegir entrenador 1");
        System.out.println("2. Elegir entrenador 2");
        System.out.println("3. Seleccionar Pokémon de entrenador 1");
        System.out.println("4. Seleccionar Pokémon de entrenador 2");
        System.out.println("5. Comenzar batalla");
        System.out.println("6. Volver al menú principal");
        System.out.print("Elige una opcion: ");
    }
}
