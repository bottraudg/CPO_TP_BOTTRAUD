/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author guilenebottraud
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int resultat = 0;
        System.out.println("1) add");

        System.out.println("2) substarct");

        System.out.println("3) multiply");

        System.out.println("4) divide");

        System.out.println("5) modulo");

        Scanner sc = new Scanner(System.in);// déja initialiser pas besoin de le recreer
        int operateur = sc.nextInt();//récupérer une valeur entière saisie par l’utilisateur et la stocker dans une variable operateur.

        System.out.println("veillez choisir la première valeur :");

        int operande1 = sc.nextInt(); //demander à l’utilisateur une première valeur en a chant un message puis en récupérant sa saisie dans une variable operande1.

        System.out.println("veillez choisir la deuxième valeur :");

        int operande2 = sc.nextInt();

        

        switch (operateur) {
            case 1 :
             resultat = operande1 + operande2;
             break;
             
            case 2 :
                resultat = operande1 - operande2;
                break;
                
            case 3 :
                resultat= operande1 * operande2;
                break;
                
            case 4 :
                resultat= operande1 / operande2;
                break;
            
            case 5 :
                resultat= operande1 % operande2;
                break;
                 default :
            System.out.println("Choix incorrect");
              
        }
        System.out.println("resultat:" + resultat);
    }

    


}
