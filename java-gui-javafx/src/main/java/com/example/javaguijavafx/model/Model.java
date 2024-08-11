package com.example.javaguijavafx.model;

/**
 * A class representing a library user and their book details.
 */
public class Model {
    // Private fields for storing user and book details
    private String name;
    private String email;
    private String phone;
    private String libraryCard;
    private String bookTitle;
    private String author;

    /**
     * Constructor to initialize a Model object with the given details.
     *
     * @param name        the name of the library user
     * @param email       the email of the library user
     * @param phone       the phone number of the library user
     * @param libraryCard the library card number of the library user
     * @param bookTitle   the title of the book
     * @param author      the author of the book
     */
    public Model(String name, String email, String phone, String libraryCard, String bookTitle, String author) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.libraryCard = libraryCard;
        this.bookTitle = bookTitle;
        this.author = author;
    }

    // Getter and setter methods for each field

    /**
     * Gets the name of the library user.
     *
     * @return the name of the library user
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the library user.
     *
     * @param name the name to set for the library user
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the email of the library user.
     *
     * @return the email of the library user
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of the library user.
     *
     * @param email the email to set for the library user
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the phone number of the library user.
     *
     * @return the phone number of the library user
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone number of the library user.
     *
     * @param phone the phone number to set for the library user
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets the library card number of the library user.
     *
     * @return the library card number of the library user
     */
    public String getLibraryCard() {
        return libraryCard;
    }

    /**
     * Sets the library card number of the library user.
     *
     * @param libraryCard the library card number to set for the library user
     */
    public void setLibraryCard(String libraryCard) {
        this.libraryCard = libraryCard;
    }

    /**
     * Gets the title of the book.
     *
     * @return the title of the book
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     * Sets the title of the book.
     *
     * @param bookTitle the title to set for the book
     */
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    /**
     * Gets the author of the book.
     *
     * @return the author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book.
     *
     * @param author the author to set for the book
     */
    public void setAuthor(String author) {
        this.author = author;
    }
}
