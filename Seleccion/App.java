package Seleccion;

public class App {
    public static void main(String[] args) {
        Jugador futbolista = new Jugador(1, "Juan", "Perez", 25, 7, "Delantero");
        Entrenador entrenador = new Entrenador(2, "Luis", "Gomez", 45, 1234);
        Masajista masajista = new Masajista(3, "Ana", "Rodriguez", 30, "Fisioterapeuta", 5);

        futbolista.concentrarse();
        futbolista.jugarPartido();

        entrenador.dirigirPartido();
        entrenador.concentrarse();

        masajista.viajar();
        masajista.darMasaje();
    }
}