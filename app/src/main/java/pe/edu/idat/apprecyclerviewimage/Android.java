package pe.edu.idat.apprecyclerviewimage;

public class Android {

    private int id;
    private int image;
    private String nombre;
    private String version;

    public Android(int id, int image, String nombre, String version) {
        this.id = id;
        this.image = image;
        this.nombre = nombre;
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
