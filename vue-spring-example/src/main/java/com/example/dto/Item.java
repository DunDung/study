package com.example.dto;

public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String contents;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
