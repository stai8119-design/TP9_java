package com.example.tp9.models;

import com.example.tp9.exceptions.InvalidUserException;

public class User {
    private String username;
    private int age;

    public User(String username, int age) throws InvalidUserException {
        if (username == null || username.trim().isEmpty()) {
            throw new InvalidUserException("Erreur: Nom d'utilisateur est vide");
        }
        if (age < 0 || age > 120) {
            throw new InvalidUserException("Erreur: L'âge que vous avez entré n'est pas logique.");
        }
        this.username = username;
        this.age = age;
    }

    public String getUsername() { return username; }
    public int getAge() { return age; }
}