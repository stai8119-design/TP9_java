package com.example.ex4;

import com.example.tp9.models.Calculator;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("DÉBUT DE PROGRAMME");
        Calculator calc = new Calculator();

        System.out.println("Test de l'addition:");
        double somme = calc.add(7, 4);
        System.out.println("7 + 4 = " + somme);

        System.out.println("Test de la division valide:");
        try {
            double div1 = calc.divide(21, 3);
            System.out.println("21 / 3 = " + div1);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Test de la division par 0:");
        try {
            double div2 = calc.divide(2, 0);
            System.out.println("2 / 0 = " + div2);
        } catch (IllegalArgumentException ex) {
            System.out.println("Erreur: " + ex.getMessage());
        }
        System.out.println("FIN DE PROGRAMME");
    }
}