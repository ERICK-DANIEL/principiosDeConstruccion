package Seleccion;

public class Masajista extends Personal {
    private String profesion;
    private int aniosExperiencia;

    // Convencion 6: los nombres de los parametros usan lowerCamelCase
    public Masajista(int identificador, String nombre, String apellido, int edad, String profesion, int aniosExperiencia) {
        super(identificador, nombre, apellido, edad);
        this.profesion = profesion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getProfesion() {
        return profesion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista " + getNombre() + " se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El masajista " + getNombre() + " va a viajar");
    }

    public void darMasaje() {
        System.out.println("El masajista " + getNombre() + " da masaje");
    }
}
