package controller;

import model.User;
import java.util.ArrayList;
import java.util.Scanner;

public class UserController {
    private ArrayList<User> users;
    private Scanner scanner;

    public UserController(ArrayList<User> users, Scanner scanner) {
        this.users = users;
        this.scanner = scanner;
    }

    public void registerUser() {
        System.out.println("--- REGISTRAR NUEVO USUARIO ---");

        int id = Integer.parseInt(getInput("ID: "));
        String name = getInput("Nombre: ");
        String email = getInput("Email: ");
        String phone = getInput("Teléfono: ");

        users.add(new User(id, name, email, phone));
        System.out.println("Usuario registrado con éxito.");
    }

    public void showUsers() {
        System.out.println("--- LISTADO DE USUARIOS ---");

        if (users.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
            return;
        }

        for (User user : users) {
            System.out.println("ID: " + user.getId() +
                    " | Nombre: " + user.getName() +
                    " | Email: " + user.getEmail() +
                    " | Teléfono: " + user.getPhone());
        }
    }

    private String getInput(String input) {
        System.out.print(input);
        return scanner.nextLine();
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}