package Seleccion;

public class Jugador extends Personal {
    private int numPlay;
    private String posicionEnCancha;

    public Jugador(int identificador, String nombre, String apellido, int edad, int numPlay, String posicionEnCancha) {
        super(identificador, nombre, apellido, edad);
        this.numPlay = numPlay;
        this.posicionEnCancha = posicionEnCancha;
    } 

    public int getNumPlay() {
        return numPlay;
    }

    public String getPosicionEnCancha() {
        return posicionEnCancha;
    }

    @Override
    public void concentrarse() {
        System.out.println("El jugador " + getNombre() + " se concentra.");
    }

    @Override
    public void viajar() {
        System.out.println("El jugador " + getNombre() + " va a viajar");
    }

    public void jugarPartido() {
        System.out.println("El jugador " + getNombre() + " juega el partido");
    }

    public void entrenar() {
        System.out.println("El jugador " + getNombre() + " entrena");
    }
}
