import gestor.GestorBatalla;
import gestor.GestorEntrenador;
import gestor.GestorPokemon;
import negocio.Simulador;
import persistencia.Persistencia;
import utils.Menu;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Simulador simulador = new Simulador();
        int opcion;
        boolean salir = false;

        do {
            Menu.mostrarMenuPrincipal();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1: {
                    GestorEntrenador gestor = new GestorEntrenador();
                    gestor.iniciarMenu(simulador);
                    break;
                }
                case 2: {
                    GestorPokemon gestor = new GestorPokemon();
                    gestor.iniciarMenu(simulador);
                    break;
                }
                case 3: {
                    GestorBatalla gestor = new GestorBatalla();
                    gestor.iniciarMenu(simulador);
                    break;
                }
                case 4: {
                    String nombreArchivo;
                    System.out.print("Ingrese el nombre del archivo a cargar: ");
                    nombreArchivo = scanner.nextLine();
                    simulador = (Simulador) Persistencia.leer(nombreArchivo);
                    break;
                }
                case 5: {
                    String nombreArchivo;
                    System.out.print("Ingrese el nombre del archivo donde va a guardar el simulador: ");
                    nombreArchivo = scanner.nextLine();
                    Persistencia.guardar(simulador, nombreArchivo);
                    break;
                }
                case 6:
                    salir = true;
                    System.out.println("Saliendo del simulador...");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida...");
                    break;
            }
        } while (!salir);
    }
}
 
