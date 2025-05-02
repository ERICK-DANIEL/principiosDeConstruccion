package app;

import controller.BookController;
import controller.UserController;
import controller.LoanController;
import model.Book;
import model.User;
import model.Loan;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    private final ArrayList<Book> books = new ArrayList<>();
    private final ArrayList<User> users = new ArrayList<>();
    private final ArrayList<Loan> loans = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    private final BookController bookController;
    private final UserController userController;
    private final LoanController loanController;

    public Biblioteca() {
        this.bookController = new BookController(books, scanner);
        this.userController = new UserController(users, scanner);
        this.loanController = new LoanController(loans, books, users, scanner);
        initializeData();
    }

    public void run() {
        boolean exit = false;
        while (!exit) {
            System.out.println("--- SISTEMA DE BIBLIOTECA ---");
            System.out.println("1. Registrar nuevo libro");
            System.out.println("2. Registrar nuevo usuario");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Buscar libros");
            System.out.println("6. Ver todos los libros");
            System.out.println("7. Ver todos los usuarios");
            System.out.println("8. Ver préstamos activos");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (option) {
                case 1 -> bookController.registerBook();
                case 2 -> userController.registerUser();
                case 3 -> loanController.lendBook();
                case 4 -> loanController.returnBook();
                case 5 -> bookController.searchBooks();
                case 6 -> bookController.showBooks();
                case 7 -> userController.showUsers();
                case 8 -> loanController.showActiveLoans();
                case 9 -> {
                    exit = true;
                    System.out.println("¡Sistema de biblioteca! sesión finalizada");
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }

    private void initializeData() {
        books.add(new Book(1, "Don Quijote de la Mancha", "Miguel de Cervantes", 1605, "Ficción", true));
        books.add(new Book(2, "Cien años de soledad", "Gabriel García Márquez", 1967, "Novela", true));
        books.add(new Book(3, "El principito", "Antoine de Saint-Exupéry", 1943, "Fábula", true));

        users.add(new User(101, "Jose Camacho", "jantonio@gmail.com", "123456789"));
        users.add(new User(102, "Patricia Moreno", "patricia@gmail.com", "987654321"));
    }
}