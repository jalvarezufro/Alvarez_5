package model.cancionPackage;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  --> @generated
 */
public class Cancion {

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    private int id;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    private String Título;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    private String Artista;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    private String Álbum;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    private String Año;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    private String Letra;

    public Cancion(int id, String titulo, String artista, String album, String ano, String letra) {
        this.id = id;
        this.Título = titulo;
        this.Artista = artista;
        this.Álbum = album;
        this.Año = ano;
        this.Letra = letra;
    }

    public Cancion() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.Título = titulo;
    }

    public void setArtista(String artista) {
        this.Artista = artista;
    }

    public void setAno(String ano) {
        this.Año = ano;
    }

    public void setLetra(String letra) {
        this.Letra = letra;
    }

    public void setAlbum(String album) {
        this.Álbum = album;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return Título;
    }

    public String getArtista() {
        return Artista;
    }

    public String getAno() {
        return Año;
    }

    public String getLetra() {
        return Letra;
    }

    public String getAlbum() {
        return Álbum;
    }

    @Override
    public String toString() {
        return "Cancion{" + "Id=" + id + ", Título=" + Título + ", Artista=" + Artista + ", Álbum=" + Álbum + ",  Año=" + Año + ", Letra=" + Letra + '}';
    }

    public String toStringWrite() {
        return "Título: " + Título + " Artista: " + Artista + " Álbum: " + Álbum + " Año: " + Año;
    }

}
