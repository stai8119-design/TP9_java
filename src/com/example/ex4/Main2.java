package com.example.ex4;

import com.example.tp9.exceptions.InvalidUserException;
import com.example.tp9.utils.FileReaderUtil;
import com.example.tp9.utils.LoggerUtil;
import com.example.tp9.models.User;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("DÉBUT DE PROGRAMME:");
        
        try {
            User u = new User("", 150);
        } catch (InvalidUserException e) {
            System.err.println("Probleme de création utilisateur : " + e.getMessage());
            LoggerUtil.logError(e.getMessage());
        }

        FileReaderUtil fileUtil = new FileReaderUtil();
        fileUtil.readFileModern("inexistant.txt");
        
        System.out.println("FIN DE PROGRAMME");
    }
}