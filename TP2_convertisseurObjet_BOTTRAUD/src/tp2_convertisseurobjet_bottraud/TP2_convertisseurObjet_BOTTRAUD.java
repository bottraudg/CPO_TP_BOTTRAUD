/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_bottraud;

import java.util.Scanner;

/**
 *
 * @author guilenebottraud
 */
public class TP2_convertisseurObjet_BOTTRAUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// initialisation du scanner
        int nb1 = 0;
        double temperature = 0;
        Convertisseur a = new Convertisseur();
        
        Convertisseur b = new Convertisseur();

        a.FarenheitVersCelcius(12);
        b.FarenheitVersCelcius(12);
        a.KelvinVersCelcius(12);

        System.out.println("Le nombre de conversion de a est : " + a.nbConversions + " et de b est : " + b.nbConversions);

        System.out.println("1) Temperature de Celcius vers Kelvin : ");// appelle de la methode CelciusVersKelvin
        System.out.println("2) Temperature de Kelvin vers Celcius  : "); // appelle de la methode KelvinVersCelcius
        System.out.println("3) Temperature de Farenheit vers Celcius : "); // appelle de la methode FarenheitVersCelcius
        System.out.println("4) Temperature de Celcius vers Farenheit : ");// appelle de la methode CelciusVersFarenheit
        System.out.println("5) Temperature de Kelvin vers Farenheit : ");// appelle de la methode KelvinVersFarenheit
        System.out.println("6) Temperature de Farenheit vers Kelvin : ");// appelle de la methode FarenheitVersKelvin

        while (nb1 > 6 || nb1 < 1) {
            System.out.println("ERREUR La valeur n'est pas comprise entre 1 et 6");
            System.out.println("\n Entrer un nombre :");
            nb1 = sc.nextInt(); //boucle tant que nb1 (1 a 6) n est pas associe a un programme
        }

      
      // temperature = sc.nextDouble();
        switch (nb1) {
            // Celcius Vers Kelvin
            case 1 -> {
                System.out.println("1) Temperature de Celcius vers Kelvin : " + a.CelciusVersKelvin(temperature));// appelle de la methode CelciusVersKelvin
            }
            //Kelvin Vers Celcius
            case 2 -> {
                System.out.println("2) Temperature de Kelvin vers Celcius  : " + a.KelvinVersCelcius(temperature)); // appelle de la methode KelvinVersCelcius

            }
            // Farenheit Vers Celcius
            case 3 -> {
                System.out.println("3) Temperature de Farenheit vers Celcius : " + a.FarenheitVersCelcius(temperature)); // appelle de la methode FarenheitVersCelcius

            }
            //Celcius Vers Farenheit
            case 4 -> {
                System.out.println("4) Temperature de Celcius vers Farenheit : " + a.CelciusVersFarenheit(temperature));// appelle de la methode CelciusVersFarenheit

            }
            //Kelvin Vers Farenheit
            case 5 -> {
                System.out.println("5) Temperature de Kelvin vers Farenheit : " + a.KelvinVersFarenheit(temperature));// appelle de la methode KelvinVersFarenheit

            }
            //Farenheit Vers Kelvin
            case 6 -> {
                System.out.println("6) Temperature de Farenheit vers Kelvin : " + a.FarenheitVersKelvin(temperature));// appelle de la methode FarenheitVersKelvin

            }

        }

    }// fin main

}// fin class
