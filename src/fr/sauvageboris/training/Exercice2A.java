package fr.sauvageboris.training;

// Ecrire un programme qui calcule le TTC d’une paire de chaussure à 56 euros HT
public class Exercice2A {

    public static void main(String[] args) {
        double priceHT = 56;
        double priceTTC = priceHT * 1.2;
        System.out.println("Le prix TTC de votre paire de chaussures est de : " + priceTTC);
    }
}
