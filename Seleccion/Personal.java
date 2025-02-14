package Seleccion;

// Convencion 1: Usar CamelCase para los nombres de las clases
public abstract class Personal {
    // Convencion 2: Usar camelCase para los nombres de las variables
    protected int identificador;
    protected String nombre;
    protected String apellido;
    protected int edad;

    protected Personal(int identificador, String nombre, String apellido, int edad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Convencion 3: Usar lineas en blanco para separar bloques logicos de codigo
    public String getNombre() {
        return nombre;
    }

    // convencion 4: utilizar "//" para comentarios de una sola linea

    public abstract void concentrarse();
    public abstract void viajar();
}