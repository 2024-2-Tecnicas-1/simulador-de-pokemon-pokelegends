package simulador;

import java.util.ArrayList;
import java.util.Scanner;
import simulador.pokemon.Pokemon;


public class Principal {
    public static void main(String[] args) {
  ArrayList<Pokemon> pokemonList = new ArrayList<>();

        pokemonList.add(new Pokemon("Charmander", 39, 52, "Fuego") {});
        pokemonList.add(new Pokemon("Squirtle", 44, 48, "Agua") {});
        pokemonList.add(new Pokemon("Bulbasaur", 45, 49, "Planta/Veneno") {});
        pokemonList.add(new Pokemon("Pikachu", 35, 55, "Eléctrico") {});
        pokemonList.add(new Pokemon("Abra", 25, 20, "Psíquico") {});
        pokemonList.add(new Pokemon("Geodude", 40, 80, "Roca/Tierra") {});
        pokemonList.add(new Pokemon("Pidgey", 40, 45, "Normal/Volador") {});
        pokemonList.add(new Pokemon("Jigglypuff", 115, 45, "Normal/Hada") {});
        pokemonList.add(new Pokemon("Machop", 70, 80, "Lucha") {});
        pokemonList.add(new Pokemon("Grimer", 80, 80, "Veneno") {});

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Mostrar lista de Pokémon");
            System.out.println("2. Seleccionar Pokémon");
            System.out.println("3. Simular batalla");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarListaPokemon(pokemonList);
                    break;
                case 2:
                    seleccionarPokemon(pokemonList, scanner);
                    break;
                case 3:
                    simularBatalla(pokemonList, scanner);
                    break;
                case 4:
                    System.out.println("Adiós!");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    public static void mostrarListaPokemon(ArrayList<Pokemon> pokemonList) {
        for (Pokemon pokemon : pokemonList) {
            pokemon.mostrarInfo();
        }
    }

    public static void seleccionarPokemon(ArrayList<Pokemon> pokemonList, Scanner scanner) {
        System.out.println("Ingrese el número del Pokémon:");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > pokemonList.size()) {
            System.out.println("Número de Pokémon no válido.");
            return;
        }

        Pokemon pokemon = pokemonList.get(numero - 1);
        pokemon.mostrarInfo();
    }

    public static void simularBatalla(ArrayList<Pokemon> pokemonList, Scanner scanner) {
        System.out.println("Seleccione el primer Pokémon:");
        int primero = scanner.nextInt();
        System.out.println("Seleccione el segundo Pokémon:");
        int segundo = scanner.nextInt();

        if (primero < 1 || primero > pokemonList.size() || segundo < 1 || segundo > pokemonList.size()) {
            System.out.println("Número de Pokémon no válido.");
            return;
        }

        Pokemon pokemon1 = pokemonList.get(primero - 1);
        Pokemon pokemon2 = pokemonList.get(segundo - 1);

        System.out.println("¡Comienza la batalla entre " + pokemon1.nombre + " y " + pokemon2.nombre + "!");
        
        // Simulación simple de batalla
        while (pokemon1.salud > 0 && pokemon2.salud > 0) {
            pokemon2.salud -= pokemon1.ataque;
            System.out.println(pokemon1.nombre + " ataca a " + pokemon2.nombre + " y le hace " + pokemon1.ataque + " de daño.");
            if (pokemon2.salud <= 0) {
                System.out.println(pokemon2.nombre + " ha sido derrotado!");
                break;
            }

            pokemon1.salud -= pokemon2.ataque;
            System.out.println(pokemon2.nombre + " ataca a " + pokemon1.nombre + " y le hace " + pokemon2.ataque + " de daño.");
            if (pokemon1.salud <= 0) {
                System.out.println(pokemon1.nombre + " ha sido derrotado!");
                break;
            }
        }
    }
}  
    

