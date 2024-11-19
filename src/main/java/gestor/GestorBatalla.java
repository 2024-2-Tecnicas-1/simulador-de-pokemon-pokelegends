package gestor;

import negocio.AdministradorEntrenador;
import negocio.Batalla;
import negocio.Entrenador;
import negocio.Simulador;
import pokemones.Pokemon;
import utils.Menu;

import java.util.Scanner;

public class GestorBatalla {
    public void iniciarMenu (Simulador simulador) {
        Batalla batalla = new Batalla();
        int opcion;
        boolean salir = false;
        Scanner scanner = new Scanner(System.in);
        String nombre;

        do {
            Menu.mostrarMenuBatalla();
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1: {
                    AdministradorEntrenador administrador = simulador.getAdministradorEntrenador();
                    System.out.print("Ingrese el nombre del entrenador 1: ");
                    Entrenador buscar = administrador.buscarEntrenador(scanner.nextLine());
                    if (buscar == null) {
                        System.out.println("\nEl entrenador no existe!");
                        break;
                    }
                    if (batalla.getP2() != null) {
                        if (buscar.getNombre().equals(batalla.getP2().getNombre())) {
                            System.out.println("\nSeleccione un entrenador diferente!");
                            break;
                        }
                    }

                    batalla.setE1(buscar);
                    System.out.println("\nEl entrenador " + buscar.getNombre() + " fue asignado!");
                    break;
                }
                case 2: {
                    AdministradorEntrenador administrador = simulador.getAdministradorEntrenador();
                    System.out.print("Ingrese el nombre del entrenador 2: ");
                    Entrenador buscar = administrador.buscarEntrenador(scanner.nextLine());
                    if (buscar == null) {
                        System.out.println("\nEl entrenador no existe!");
                        break;
                    }
                    if (batalla.getP1() != null) {
                        if (buscar.getNombre().equals(batalla.getP1().getNombre())) {
                            System.out.println("\nSeleccione un entrenador diferente!");
                            break;
                        }
                    }

                    batalla.setE2(buscar);
                    System.out.println("\nEl entrenador " + buscar.getNombre() + " fue asignado!");
                    break;
                }
                case 3: {
                    Entrenador e = batalla.getE1();
                    e.mostrarPokemones();
                    System.out.print("\nIngrese el nombre del pokemon para la batalla: ");
                    Pokemon buscar = e.buscarPokemon(scanner.nextLine());
                    if (buscar == null) {
                        System.out.println("\nEl pokemon no existe!");
                        break;
                    }
                    batalla.setP1(buscar);
                    System.out.println("\nEl pokemon " + buscar.getNombre() + " ha sido asignado!");
                    break;
                }
                case 4: {
                    Entrenador e = batalla.getE2();
                    e.mostrarPokemones();
                    System.out.print("\nIngrese el nombre del pokemon para la batalla: ");
                    Pokemon buscar = e.buscarPokemon(scanner.nextLine());
                    if (buscar == null) {
                        System.out.println("\nEl pokemon no existe!");
                        break;
                    }
                    batalla.setP2(buscar);
                    System.out.println("\nEl pokemon " + buscar.getNombre() + " ha sido asignado!");
                    break;
                }
                case 5: {
                    if (batalla.getE1() == null || batalla.getE2() == null || batalla.getP1() == null || batalla.getP2() == null) {
                        System.out.println("\nDebe realizar las asignaciones respectivas para poder batallar!");
                        break;
                    }
                    boolean ganador = false;
                    Pokemon pGanador = null;
                    int opcionBatalla;
                    while (!ganador) {
                        System.out.println("\n" + batalla.getP1().getNombre() + " vs " + batalla.getP2().getNombre() + "\n");
                        System.out.println("1. " + batalla.getP1().getNombre() + " -> Atacar");
                        System.out.println("2. " + batalla.getP2().getNombre() + " -> Atacar");
                        System.out.println("3. Finalizar batalla");
                        System.out.print("Opcion: ");
                        opcionBatalla = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcionBatalla) {
                            case 1:
                                pGanador = batalla.iniciarBatalla(batalla.getP1(), batalla.getP2());
                                break;
                            case 2:
                                pGanador = batalla.iniciarBatalla(batalla.getP2(), batalla.getP1());
                                break;
                            case 3:
                                ganador = true;
                                System.out.println("\nLa batalla finalizo antes de que algun pokemon ganara!");
                                break;
                        }

                        if (pGanador != null) {
                            ganador = true;
                            System.out.println("\nEl pokemon " + pGanador.getNombre() + " ha ganado el combate!");
                        }
                    }
                    break;
                }
                case 6:
                    System.out.println("\nVolviendo al menu principal...");
                    salir = true;
                    break;
                default:
                    System.out.println("\nIngrese una opcion valida...");
                    break;
            }
        } while (!salir);
    }
}
