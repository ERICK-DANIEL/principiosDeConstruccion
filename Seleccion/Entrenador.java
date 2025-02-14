package Seleccion;

public class Entrenador extends Personal {
    private int idFederacion;

    public Entrenador(int identificador, String nombre, String apellido, int edad, int idFederacion) {
        super(identificador, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador " + getNombre() + " se concentra.");
    }

    @Override
    public void viajar() {
        System.out.println("El entrenador " + getNombre() + " va a viajar");
    }

    public void dirigirPartido() {
        System.out.println("El entrenador " + getNombre() + " dirige el partido");
    }

    public void dirigirEntrenamiento() {
        System.out.println("El entrenador " + getNombre() + " dirige el entrenamiento");
    }
}
