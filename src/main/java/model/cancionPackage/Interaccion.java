package model.cancionPackage;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  --> @generated
 */
public class Interaccion {

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */

    private Cancion listadoCanciones;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated
     */
    public Interaccion() {

        super();
    }
    public static void prueba(){
        Gestor gestor = new Gestor();
        gestor.agregar();
    }

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
  public void menu() {
        int accion = preguntarAccion();
        Gestor gestor = new Gestor();
        switch (accion) {
            case 1:
                gestor.agregar();
                break;
            case 2:
              gestor.quitar();
                break;
            case 3:
              Gestr
                break;
            case 4:
                System.out.println("Nos vemos");
                System.exit(0);
                break;
            default:
                System.out.println("Numero incorrecto, intentar nuevamente");
                menu(listadoCanciones);
        }
    }
    

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    private int preguntarAccion() {
        Scanner read = new Scanner(System.in);
        System.out.print("Inserte 1 si quiere agregar una cancion. \n"
                + "inserte 2 si quiere quitar una cancion. \n"
                + "inserte 3 si desea ver las canciones. \n"
                + "inserte 4 si desea terminar. \n");
        return read.nextInt();
    }

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    private boolean salir() {
        // TODO implement me
        return false;
    }

}
