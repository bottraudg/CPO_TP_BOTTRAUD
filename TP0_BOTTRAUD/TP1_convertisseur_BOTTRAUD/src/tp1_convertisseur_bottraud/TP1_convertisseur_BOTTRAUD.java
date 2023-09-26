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
        Scanner sc = new Scanner(System.in);// initialisation du scanner
    System.out.println("Entrez la temperature en Celsius:");
    tCelcius = sc.nextDouble();//stockage de la 1ere valeur réelle dans var1 
    System.out.println(CelciusVersKelvin(tCelcius));// appelle de la methode CelciusVersKelvin
    System.out.println(KelvinVersCelcius( tKelvin)); // appelle de la methode KelvinVersCelcius
    System.out.println(FarenheitVersCelcius( tFarenheit)); // appelle de la methode KelvinVersCelcius
    
   
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
     public static double CelciusVersFarenheit (double Celcius) { 
         double tFarenheit;
       tFarenheit= tCelcius -32;
        return tFarenheit;
}
    

}