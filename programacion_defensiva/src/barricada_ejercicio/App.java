package barricada_ejercicio;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese su correo: ");
        String correo = input.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contrasena = input.nextLine();

        System.out.print("Ingrese su edad: ");
        String edad = input.nextLine();

        input.close();
     

        // Validación (barricada)
        String correoSeguro = ValidadorUsuario.validarCorreo(correo);
        String contrasenaSeguro = ValidadorUsuario.validarContrasena(contrasena);
        Integer edadSeguro = ValidadorUsuario.validarEdad(edad);

        // Guardar datos en objeto usuario en caso que todos los datos sean válidos
        // de lo contrario indicar mensaje de error
        if (correoSeguro != null && contrasenaSeguro != null && edadSeguro != null) {
            Usuario usuario = new Usuario(correoSeguro, contrasenaSeguro, edadSeguro);
            System.out.println("Usuario creado: " + usuario.mostrarInfo());
        } else {
            System.out.println("Datos invalidos: ");
            if (correoSeguro == null) {
                System.out.println("- Debe ingresar un correo valido");
            }
            if (contrasenaSeguro == null) {
                System.out.println("- La contraseña debe tener al menos 8 caracteres");
            }
            if (edadSeguro == null) {
                System.out.println("- La edad debe ser mayor o igual a 15 y menor o igual a 50 y debe ser un número");
            }
        }
    }
}
