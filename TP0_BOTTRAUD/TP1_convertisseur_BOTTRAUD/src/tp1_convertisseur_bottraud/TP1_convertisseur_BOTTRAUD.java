/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_bottraud;

import java.util.Scanner;

/**
 *
 * @author guilenebottraud
 */
public class TP1_convertisseur_BOTTRAUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double tKelvin = 0;
       double tCelcius = 0;
       double tFarenheit = 0;
       double temperature = 0;
        Scanner sc = new Scanner(System.in);// initialisation du scanner
    System.out.println("Bonjour, saisissez une valeur  ");
    System.out.println("Saisissez la conversion que vous souhaiter effectuer : ");
    temperature = sc.nextDouble();//stockage de la 1ere valeur réelle dans var1 
    System.out.println("1) Temperature de Celcius vers Kelvin : " + CelciusVersKelvin(temperature));// appelle de la methode CelciusVersKelvin
    System.out.println("2) Temperature de Kelvin vers Celcius  : " + KelvinVersCelcius( temperature)); // appelle de la methode KelvinVersCelcius
    System.out.println("3) Temperature de Farenheit vers Celcius : " + FarenheitVersCelcius( temperature)); // appelle de la methode FarenheitVersCelcius
    System.out.println("4) Temperature de Celcius vers Farenheit : " + CelciusVersFarenheit( temperature));// appelle de la methode CelciusVersFarenheit
    System.out.println("5) Temperature de Kelvin vers Farenheit : " + KelvinVersFarenheit( temperature));// appelle de la methode KelvinVersFarenheit
    System.out.println("6) Temperature de Farenheit vers Kelvin : " + FarenheitVersKelvin( temperature));// appelle de la methode FarenheitVersKelvin
    System.out.println( temperature + " degré Kelvin est égal à " + KelvinVersCelcius( temperature) + " degré Celcius"); 

    }
             // CONVERTION CELCIUS VERS KELVIN
    public static double CelciusVersKelvin (double tCelcius) { 
         double tKelvin;
       tKelvin= tCelcius+273.15;
        return tKelvin;
    }
             // CONVERTION KELVIN VERS CELCIUS
    public static double KelvinVersCelcius (double tKelvin) { 
         double tCelcius;
       tCelcius= tKelvin-273.15;
        return tCelcius;
    }
            // CONVERTION FARENHEIT VERS CELCIUS
    public static double FarenheitVersCelcius (double tFarenheit) { 
         double tCelcius;
       tCelcius= tFarenheit-32;
        return tCelcius;
    }
             // CONVERTION CELCIUS VERS FARENHEIT
     public static double CelciusVersFarenheit (double tCelcius) { 
         double tFarenheit;
       tFarenheit= tCelcius -32;
        return tFarenheit;
}
    // CONVERTION KELVIN VERS FARENHEIT
     public static double KelvinVersFarenheit (double tKelvin) { 
         double tFarenheit;
       tFarenheit= tKelvin -460;
        return tFarenheit;
}
     
     // CONVERTION FARENHEIT VERS KELVIN
     public static double FarenheitVersKelvin (double tFarenheit) { 
         double tKelvin;
       tKelvin = tFarenheit + 460;
        return tKelvin;

}
}