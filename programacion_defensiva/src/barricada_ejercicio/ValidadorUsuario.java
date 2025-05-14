package barricada_ejercicio;

// clase barricada
public class ValidadorUsuario {

    // implementar método: validarCorreo(String correo)
    // aceptar email que contengan @ y .
    public static String validarCorreo(String correo) {
        if (correo == null || correo.isBlank() || !correo.contains("@") || !correo.contains(".")) {
            return null;
        }
        // Elimina caracteres no alfabéticos
        return correo.replaceAll("[^a-zA-Z0-9@.]", "");
    }

    // implementar método: validarContrasena(String contrasena)
    // constraseña debe tener longitud mayor o igual a 8
    public static String validarContrasena(String contrasena) {
        if (contrasena == null || contrasena.isBlank()) {
            return null;
        } else if (contrasena.length() < 8) {
            return null;
        }
        
        return contrasena;
    }


    // implementar método: validarEdad(String edadTexto)
    // edad debe ser mayor o gual a 15 y menor o igual a 50
    public static Integer validarEdad(String edadTexto) {
        try {
            int edad = Integer.parseInt(edadTexto);

            if (edad < 15 || edad > 50) {
                return null;
            }
            return edad;
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
