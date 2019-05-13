package model.cancionPackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  --> @generated
 */
public class Gestor {

    private ArrayList<Cancion> listadoCanciones;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated
     */
    public Gestor() {
        super();
    }

    public void setListadoCanciones(ArrayList<Cancion> listadoCanciones) {
        this.listadoCanciones = listadoCanciones;
    }

    public ArrayList<Cancion> getListadoCanciones() {
        return listadoCanciones;
    }

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    private String leerArchivo(String direccion) {
        Path archivo = Paths.get(direccion);
        String Contenido = "";
        try {
            Contenido = new String(Files.readAllBytes(archivo));
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo.");
        }
        return Contenido;
    }

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    private void escribirArchivo(String direccion, String texto) {
        Path file = Paths.get(direccion);
        try {
            Files.write(file, texto.getBytes());
        } catch (IOException e) {
            System.out.println("El archivo no puede ser reescrito");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    private String[] separarString(String texto, String sacar) {
        String[] separacion = texto.split(sacar);

        return separacion;
    }

    public void agregarListado() {
        int indicador = 0;
        String informacion = leerArchivo("info canciones.txt"); //lee canciones apra agregar
        String[] separados = separarString(informacion, "\n"); //separa String por canciones
        //agregar una cancion
        for (int i = 0; i < separados.length; i++) {
            String[] temp = separarString(separados[i], " "); //separa String por espacios para determinar sus atributos
            indicador = indicador + i * 4; //crea un indicador por cancion

            int id = i + 1;

            String titulo = temp[indicador];

            String artista = temp[indicador + 2];

            String album = temp[indicador + 4];

            String año = temp[indicador + 6];

            String letra = leerArchivo(titulo.replaceAll(" ", "_"));

            Cancion cancion = new Cancion(id, titulo, artista, album, año, letra);

            listadoCanciones.add(cancion);

        }

    }

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    public void quitar(String direccion) {
        // TODO implement me
    }

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    public void agregar() {
        Scanner read = new Scanner(System.in);

        Cancion cancion;

        int id = 1;

        System.out.println("Escriba el titulo de la cancion");
        String titulo = read.nextLine();

        System.out.println("Escriba el artista");
        String artista = read.nextLine();

        System.out.println("Escriba el album");
        String album = read.nextLine();

        System.out.println("Escriba el año de creacion");
        String año = read.nextLine();

        System.out.println("Escribir letra de la cancion");
        String letra = read.nextLine();

        cancion = new Cancion(id, titulo, artista, album, año, letra);

        listadoCanciones.add(cancion);

        String informacion = leerArchivo("info canciones.txt");

        informacion = "\n" + listadoCanciones.get(listadoCanciones.size()).toStringWrite();

        escribirArchivo("info canciones.txt", informacion);

    }

}
