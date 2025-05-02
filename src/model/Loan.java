package model;

// Prestamo.java
import java.util.Date;

public class Loan {
    private int id;
    private int idBook;
    private int idUser;
    private Date dateLoan;
    private Date dateDevolution;
    private boolean devolution;

    public Loan(int id, int idBook, int idUser, Date dateLoan, Date dateDevolution, boolean devolution) {
        this.id = id;
        this.idBook = idBook;
        this.idUser = idUser;
        this.dateLoan = dateLoan;
        this.dateDevolution = dateDevolution;
        this.devolution = devolution;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public Date getDateLoan() {
        return dateLoan;
    }

    public void setDateLoan(Date dateLoan) {
        this.dateLoan = dateLoan;
    }

    public Date getDateDevolution() {
        return dateDevolution;
    }

    public void setDateDevolution(Date dateDevolution) {
        this.dateDevolution = dateDevolution;
    }

    public boolean getDevolution() {
        return devolution;
    }

    public void setDevolution(boolean devolution) {
        this.devolution = devolution;
    }
}
