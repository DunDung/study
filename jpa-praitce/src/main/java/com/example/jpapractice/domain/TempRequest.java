package com.example.jpapractice.domain;

public class TempRequest {
    private int id;
    private String name;

    public TempRequest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TempRequest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
