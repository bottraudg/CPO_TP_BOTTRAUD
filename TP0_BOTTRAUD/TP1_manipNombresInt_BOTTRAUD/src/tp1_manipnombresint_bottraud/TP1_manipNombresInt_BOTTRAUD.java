/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_bottraud;

import java.util.Scanner;

/**
 *
 * @author guilenebottraud
 */
public class TP1_manipNombresInt_BOTTRAUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int var1;
        int var2;
        int som;
        int dif;
        int div;
        int rest;
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);// initialisation du scanner
    System.out.println("Entrez le premier entier:");
    var1 = sc.nextInt();//stockage du 1er entier dans var1 
    System.out.println("Entrez le deuxième entier:");
        var2 = sc.nextInt();//stockage du 2eme entier dans var2
        
        
        // SOMME ET DIFFERENCE DES DEUX ENTIERS 
        
         som=var1+var2;
         System.out.println("somme des deux entiers:" + som); // afficher l'operation sur l'écran
         
         dif = var1-var2;
         System.out.println("difference des deux entiers:" + dif);// afficher l'operation sur l'écran
         
         // QUOTIENT ET RESTE DE LA DIVISION`
        
         div= var1/var2;
          System.out.println("division des deux entiers:"+div);// afficher l'operation sur l'écran
          rest= var1%var2;
          System.out.println("reste de la division des deux entiers:"+rest);// afficher l'operation sur l'écran
         System.out.println("resultat final: " + div+","+rest) ; 
    }
    
}
