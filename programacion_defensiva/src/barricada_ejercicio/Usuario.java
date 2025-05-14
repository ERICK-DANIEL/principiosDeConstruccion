package barricada_ejercicio;

// Clase usuario zona segura
public class Usuario {
    String correo;
    String contrasena;
    int edad;

    // implementar constructor: Usuario(String correo, String contrasena, int edad)
    public Usuario(String correo, String contrasena, int edad) {
        this.correo = correo;
        this.contrasena = contrasena;
        this.edad = edad;
    }

    // implementar método: mostrarInfo()
    public String mostrarInfo() {
        return "Usuario{" +
                "correo: " + correo +
                ", contraseña: " + contrasena +
                ", edad: " + edad +
                '}';
    }  
}
