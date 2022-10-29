/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_bottraud;

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
   
   c1.FahrenheitVersCelcius(1);
   c2.FahrenheitVersCelcius(2);
   c1.KelvinVersCelcius(12);        
        
System.out.println("le nombre de conversion de c1 est : " + c1.nbConversions + "et de c2 est : " + c2.nbConversions);
//Q4 fin 

}
}