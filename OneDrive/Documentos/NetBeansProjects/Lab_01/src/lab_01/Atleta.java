package lab_01;

public class Atleta {

//1. Se crean los atributos de la clase "plantilla".
    private String nombre;
    private String pais;
    private double tiempo;

    //2. se crea un constructor, --> para crear el objeto
    public Atleta() {

    }

    public Atleta(String nombre) {
        this.nombre = nombre;
    }

// 3. metodos get y set para acceder a los atributos.
    // click derecho insert codigo 'get'
    public String getNombre() {
        return nombre;
    }

// click derecho insert codigo 'set'
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    //4. metodo to Strng para poder ver la informacion
    @Override
    public String toString() {
        return "Atleta {" + "Nombre = " + nombre + ", Pais = " + pais + ", Tiempo = " + tiempo +  '}';
    }

}
