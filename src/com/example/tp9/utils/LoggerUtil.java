package com.example.tp9.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class LoggerUtil {
    public static void logError(String msg) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("error.log", true))) {
            bw.write("[" + LocalDateTime.now() + "] " + msg);
            bw.newLine();
        } catch (IOException ex) {
            System.err.println("Erreur log: " + ex.getMessage());
        }
    }
}