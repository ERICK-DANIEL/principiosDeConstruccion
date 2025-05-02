package controller;

import model.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class BookController {
    private ArrayList<Book> books;
    private Scanner scanner;

    public BookController(ArrayList<Book> books, Scanner scanner) {
        this.books = books;
        this.scanner = scanner;
    }

    public void registerBook() {
        System.out.println("--- REGISTRAR NUEVO LIBRO ---");

        int id = Integer.parseInt(getInput("ID: "));
        String title = getInput("Título: ");
        String author = getInput("Autor: ");
        int year = Integer.parseInt(getInput("Año: "));
        String genre = getInput("Género: ");

        books.add(new Book(id, title, author, year, genre, true));
        System.out.println("Libro registrado con éxito.");
    }

    public void showBooks() {
        System.out.println("--- LISTADO DE LIBROS ---");

        if (books.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }

        for (Book book : books) {
            System.out.println("ID: " + book.getId() +
                    " | Título: " + book.getTitle() +
                    " | Autor: " + book.getAutor() +
                    " | Año: " + book.getYear() +
                    " | Género: " + book.getGender() +
                    " | Disponible: " + (book.getAvaliable() ? "Sí" : "No"));
        }
    }

    public void searchBooks() {
        System.out.println("--- BUSCAR LIBROS ---");

        String query = getInput("Ingrese el título o autor: ").toLowerCase();

        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(query) || book.getAutor().toLowerCase().contains(query)) {
                System.out.println("ID: " + book.getId() +
                        " | Título: " + book.getTitle() +
                        " | Autor: " + book.getAutor() +
                        " | Año: " + book.getYear() +
                        " | Género: " + book.getGender() +
                        " | Disponible: " + (book.getAvaliable() ? "Sí" : "No"));
                found = true;
            }
        }

        if (!found) {
            System.out.println("No se encontraron libros que coincidan con la búsqueda.");
        }
    }

    private String getInput(String input) {
        System.out.print(input);
        return scanner.nextLine();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}