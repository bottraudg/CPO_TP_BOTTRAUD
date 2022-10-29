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
        // TODO code application logic here

   //Q4 debut 
   Convertisseur c1 = new Convertisseur();
   Convertisseur c2 = new Convertisseur();
   
   c1.KelvinVersCelcius(1);
   c2.FahrenheitVersCelcius(2);
   c1.KelvinVersFahrenheit(12);        
        
System.out.println("le nombre de conversion de c1 est : " + c1.nbConversions   + "et de c2 est : " + c2.nbConversions);
//Q4 fin 
// scanner pris du TP0
int nb;
//nb=5;
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :");
nb=sc.nextInt(); // On demande a sc de donner le prochain entier
//Q5 debut 
//menu :
System.out.println("1) CelciusVersKelvin");
        System.out.println("2) KelvinVersCelcius");
        System.out.println("3) FarenheitVersCelcius");
        System.out.println("4) CelciusVersFarenheit");
        System.out.println("5) KelvinVersFarenheit");
        System.out.println("6) FarenheitVersKelvin");
        System.out.println(" Bonjour, quelle conversion voulez vous effectuez ?");
        int nbr = sc.nextInt();
        while (nbr>6 || nb<1) {
            System.out.println("Erreur: la valeur doit etre comprise entre 1 et 6");
            System.out.println("\n Entrer un nombre :");
            nbr= sc.nextInt();// on fait une boucle tent que nbr n'est pas associé a un programme 
        }
        System.out.println(" Bonjour, quelle température ?");
        double temp = sc.nextDouble();
        switch (nbr) {
            case 1 -> {
                // CelciusVersKelvin
                System.out.println("La température en Kelvin est : " + c1.CelciusVersKelvin(temp));
            }
            case 2 -> {
                //KelvinVersCelcius
                System.out.println("La température en Celcius est : " + c1.KelvinVersCelcius(temp));
            }
            case 3 -> {
                //FarenheitVersCelcius
                System.out.println("La température en Celcius est : " + c1.FahrenheitVersCelcius(temp));
            }
            case 4 -> {
                //CelciusVersFarenheit
                System.out.println("La température en Fareinheit est : " + c1.CelciusVersFahrenheit(temp));
            }
            case 5 -> {
                //KelvinVersFarenheit
                System.out.println("La température en Fareinheit est : " + c1.KelvinVersFahrenheit(temp));
            }
            case 6 -> {
                //FarenheitVersKelvin
                System.out.println("La température en Kelvin est : " + c1.FahrenheitVersKelvin(temp));
            }
// Q5 fin 
        }

    }
}
