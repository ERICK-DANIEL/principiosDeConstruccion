package controller;

import model.Book;
import model.Loan;
import model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class LoanController {
    private ArrayList<Loan> loans;
    private ArrayList<Book> books;
    private ArrayList<User> users;
    private Scanner scanner;

    public LoanController(ArrayList<Loan> loans, ArrayList<Book> books, ArrayList<User> users, Scanner scanner) {
        this.loans = loans;
        this.books = books;
        this.users = users;
        this.scanner = scanner;
    }

    public void lendBook() {
        System.out.println("--- PRESTAR LIBRO ---");

        int bookId = Integer.parseInt(getInput("ID del libro: "));
        int userId = Integer.parseInt(getInput("ID del usuario: "));

        Book book = null;
        User user = null;

        for (Book b : books) {
            if (b.getId() == bookId) {
                book = b;
                break;
            }
        }

        for (User u : users) {
            if (u.getId() == userId) {
                user = u;
                break;
            }
        }

        if (book == null) {
            System.out.println("Error: Libro no encontrado.");
            return;
        }

        if (user == null) {
            System.out.println("Error: Usuario no encontrado.");
            return;
        }

        if (!book.getAvaliable()) {
            System.out.println("Error: El libro no está disponible actualmente.");
            return;
        }

        int userBooks = 0;
        for (Loan l : loans) {
            if (l.getIdUser() == userId && !l.getDevolution()) {
                userBooks++;
            }
        }

        if (userBooks >= 3) {
            System.out.println("Error: El usuario ya tiene 3 libros prestados.");
            return;
        }

        Loan newLoan = new Loan(loans.size() + 1, bookId, userId, new Date(), null, false);
        loans.add(newLoan);
        book.setAvaliable(false);

        System.out.println("Préstamo realizado con éxito.");
    }

    public void returnBook() {
        System.out.println("--- DEVOLVER LIBRO ---");

        int bookId = Integer.parseInt(getInput("ID del libro: "));

        Loan loan = null;

        for (Loan l : loans) {
            if (l.getIdBook() == bookId && !l.getDevolution()) {
                loan = l;
                break;
            }
        }

        if (loan == null) {
            System.out.println("Error: No hay préstamos activos para este libro.");
            return;
        }

        loan.setDevolution(true);
        loan.setDateDevolution(new Date());

        for (Book b : books) {
            if (b.getId() == bookId) {
                b.setAvaliable(true);
                break;
            }
        }

        System.out.println("Libro devuelto con éxito.");
    }

    public void showActiveLoans() {
        System.out.println("--- PRÉSTAMOS ACTIVOS ---");
        boolean hasLoans = false;

        for (Loan loan : loans) {
            if (!loan.getDevolution()) {
                Book book = null;
                User user = null;

                for (Book b : books) {
                    if (b.getId() == loan.getIdBook()) {
                        book = b;
                        break;
                    }
                }

                for (User u : users) {
                    if (u.getId() == loan.getIdUser()) {
                        user = u;
                        break;
                    }
                }

                if (book != null && user != null) {
                    System.out.println("ID Préstamo: " + loan.getId() +
                            " | Libro: " + book.getTitle() +
                            " | Usuario: " + user.getName() +
                            " | Fecha: " + loan.getDateLoan());
                    hasLoans = true;
                }
            }
        }

        if (!hasLoans) {
            System.out.println("No hay préstamos activos.");
        }
    }

    private String getInput(String input) {
        System.out.print(input);
        return scanner.nextLine();
    }
}