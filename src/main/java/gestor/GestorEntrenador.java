package gestor;

import negocio.AdministradorEntrenador;
import negocio.Simulador;
import negocio.Entrenador;
import utils.Menu;

import java.util.Scanner;

public class GestorEntrenador {
    public void iniciarMenu (Simulador simulador) {
        Scanner scanner = new Scanner(System.in);
        AdministradorEntrenador administrador = simulador.getAdministradorEntrenador();
        int opcion;
        boolean salir = false;
        do {
            Menu.mostrarMenuGestionEntrenadores();
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1: {
                    String nombre;
                    System.out.print("Ingrese el nombre del entrenador: ");
                    nombre = scanner.nextLine();
                    Entrenador nuevo = administrador.buscarEntrenador(nombre);
                    if (nuevo == null) {
                        nuevo = new Entrenador(nombre);
                        administrador.agregarEntrenador(nuevo);
                        System.out.println("\nEl entrenador " + nombre + " se ha creado correctamente!");
                    } else {
                        System.out.println("\nEl entrenador con el nombre " + nombre + " ya existe!");
                    }
                    break;
                }
                case 2: {
                    administrador.mostrarEntrenadores();
                    break;
                }
                case 3: {
                    String nombre;
                    System.out.print("Ingrese el nombre del entrenador que desea escoger: ");
                    nombre = scanner.nextLine();
                    Entrenador seleccion = administrador.buscarEntrenador(nombre);
                    if (seleccion != null) {
                        simulador.setEntrenadorSeleccionado(seleccion);
                        System.out.println("\nEl entrenador " + nombre + " ha sido seleccionado! Ya puede agregar pokemones a su equipo.");
                    } else {
                        System.out.println("\nEl entrenador con el nombre " + nombre + " no existe!");
                    }
                    break;
                }
                case 4: {
                    String nombre;
                    System.out.print("Ingrese el nombre del entrenador que desea eliminar: ");
                    nombre = scanner.nextLine();
                    Entrenador seleccion = administrador.buscarEntrenador(nombre);
                    if (seleccion == null) {
                        System.out.println("\nEl entrenador con el nombre " + nombre + " no existe!");
                        break;
                    }
                    break;
                }
                case 5:
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
