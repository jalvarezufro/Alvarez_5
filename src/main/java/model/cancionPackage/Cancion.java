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
    private String T�tulo;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    private String Artista;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    private String �lbum;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    private String A�o;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  --> @generated @ordered
     */
    private String Letra;

    public Cancion(int id, String titulo, String artista, String album, String ano, String letra) {
        this.id = id;
        this.T�tulo = titulo;
        this.Artista = artista;
        this.�lbum = album;
        this.A�o = ano;
        this.Letra = letra;
    }

    public Cancion() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.T�tulo = titulo;
    }

    public void setArtista(String artista) {
        this.Artista = artista;
    }

    public void setAno(String ano) {
        this.A�o = ano;
    }

    public void setLetra(String letra) {
        this.Letra = letra;
    }

    public void setAlbum(String album) {
        this.�lbum = album;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return T�tulo;
    }

    public String getArtista() {
        return Artista;
    }

    public String getAno() {
        return A�o;
    }

    public String getLetra() {
        return Letra;
    }

    public String getAlbum() {
        return �lbum;
    }

    @Override
    public String toString() {
        return "Cancion{" + "Id=" + id + ", T�tulo=" + T�tulo + ", Artista=" + Artista + ", �lbum=" + �lbum + ",  A�o=" + A�o + ", Letra=" + Letra + '}';
    }

    public String toStringWrite() {
        return "T�tulo: " + T�tulo + " Artista: " + Artista + " �lbum: " + �lbum + " A�o: " + A�o;
    }

}
