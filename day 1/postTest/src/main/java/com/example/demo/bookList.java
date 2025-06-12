package com.example.demo;

public class bookList {
    private String title, author;
    private int id;

    public bookList(int id1, String title1, String author1) {
        this.id = id1;
        this.title = title1;
        this.author = author1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title1) {
        this.title = title1;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author1) {
        this.author = author1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id1) {
        this.id = id1;
    }
}

