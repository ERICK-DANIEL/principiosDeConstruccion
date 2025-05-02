package model;
// Libro.java
public class Book {
    private int id;
    private String title;
    private String autor;
    private int year;
    private String gender;
    private boolean avaliable;

    public Book(int id, String title, String autor, int year, String gender, boolean avaliable) {
        this.id = id;
        this.title = title;
        this.autor = autor;
        this.year = year;
        this.gender = gender;
        this.avaliable = avaliable;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean getAvaliable() {
        return avaliable;
    }

    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
    }
}
