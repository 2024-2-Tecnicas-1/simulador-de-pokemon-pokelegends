package persistencia;

import java.io.*;

public class Persistencia {
    public static void guardar(Object objeto, String nombreArchivo){
        File file = new File("datos/" + nombreArchivo);

        try (FileOutputStream fileOut = new FileOutputStream(file);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(objeto);
            System.out.println("El objeto ha sido guardado en: datos/" + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object leer(String nombreArchivo){
        Object objeto = null;
        File file = new File("datos/" + nombreArchivo);

        if (file.exists()) {
            try (FileInputStream fileIn = new FileInputStream(file);
                 ObjectInputStream in = new ObjectInputStream(fileIn)) {
                objeto = (Object) in.readObject();
                System.out.println("\nSimulador cargado correctamente!");
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("El archivo " + nombreArchivo + " no existe.");
        }
        return objeto;
    }
}
