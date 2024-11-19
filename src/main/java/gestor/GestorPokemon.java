package gestor;

import negocio.PokemonBuilder;
import negocio.Simulador;
import pokemones.Pokemon;
import negocio.Entrenador;
import utils.Estado;
import utils.Menu;

import java.util.Scanner;

public class GestorPokemon {

    public void iniciarMenu(Simulador simulador) {
        Scanner scanner = new Scanner(System.in);
        Entrenador entrenador = simulador.getEntrenadorSeleccionado();
        if (entrenador == null) {
            System.out.println("Aun no se ha seleccionado un entrenador!");
            return;
        }
        int opcion;
        boolean salir = false;
        do {
            Menu.mostrarMenuGestionPokemon(entrenador.getNombre());
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1: {
                    entrenador.mostrarPokemones();
                    break;
                }
                case 2: {
                    String nombre;
                    System.out.print("Ingrese el nombre del pokemon que desea agregar al equipo: ");
                    nombre = scanner.nextLine();
                    Pokemon buscar = entrenador.buscarPokemon(nombre);
                    if (buscar == null) {
                        PokemonBuilder crear = new PokemonBuilder();
                        try {
                            entrenador.agregarPokemon(crear.crearPokemon(nombre));
                            System.out.println("\nEl pokemon " + nombre + " se ha agregado al equipo!");
                        } catch (IllegalArgumentException e) {
                            System.out.println("\n" + e.getMessage());
                        }
                    } else {
                        System.out.println("\nEl pokemon " + nombre + " ya existe en el equipo!");
                    }
                    break;
                }
                case 3: {
                    String nombre;
                    double vida, ataque;

                    System.out.print("Ingrese el nombre del pokemon que desea agregar al equipo: ");
                    nombre = scanner.nextLine();
                    Pokemon buscar = entrenador.buscarPokemon(nombre);

                    if (buscar != null) {
                        System.out.println("\nEl pokemon " + nombre + " ya existe en el equipo!");
                        break;
                    }

                    System.out.print("Ingrese los puntos de vida: ");
                    vida = scanner.nextDouble();
                    System.out.print("Ingrese los puntos de ataque;");
                    ataque = scanner.nextDouble();

                    PokemonBuilder crear = new PokemonBuilder();
                    try {
                        entrenador.agregarPokemon(crear.crearPokemon(nombre, vida, ataque, Estado.NORMAL));
                        System.out.println("\nEl pokemon " + nombre + " se ha agregado al equipo!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("\n" + e.getMessage());
                    }
                    break;
                }
                case 4: {
                    String nombre;
                    System.out.print("Ingrese el nombre del pokemon que desea entrenar: ");
                    nombre = scanner.nextLine();
                    Pokemon buscar = entrenador.buscarPokemon(nombre);
                    if (buscar != null) {
                        entrenador.entrenarPokemon(buscar);
                    } else {
                        System.out.println("\nEl pokemon " + nombre + " no existe en el equipo!");
                    }
                    break;
                }
                case 5: {
                    String nombre;
                    System.out.print("Ingrese el nombre del pokemon que desea eliminar del equipo: ");
                    nombre = scanner.nextLine();

                    if (entrenador.eliminarPokemon(nombre)) {
                        System.out.println("\nEl pokemon " + nombre + " se ha eliminado del equipo!");
                    } else {
                        System.out.println("\nEl pokemon " + nombre + " no existe en el equipo!");
                    }
                    break;
                }
                case 6: {
                    entrenador.curarPokemones();
                    System.out.println("\nLos pokemones heridos han sido curados!");
                    break;
                }
                case 7:
                    salir = true;
                    System.out.println("Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida...");
                    break;
            }
        } while (!salir);
    }
}

