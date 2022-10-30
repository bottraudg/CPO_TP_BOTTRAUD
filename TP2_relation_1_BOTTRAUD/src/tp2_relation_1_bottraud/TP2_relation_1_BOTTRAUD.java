/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_bottraud;

/**
 *
 * @author guilenebottraud
 */
public class TP2_relation_1_BOTTRAUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ; 
Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ; 
Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ; 
Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
Personne bob = new Personne("Bobby", "Sixkiller");
Personne reno = new Personne("Reno", "Raines");
System.out.println("liste des voitures disponibles "+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
bob.liste_voitures[0] = uneClio ;
bob.nbVoitures = 1 ;
//uneClio.proprietaire = bob ;
     System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0] ) ;
     bob.liste_voitures[0] = uneClio ; 
     bob.liste_voitures[1] = uneMicra ;
     reno.liste_voitures[2] = une2008 ;
     reno.liste_voitures[3] = uneAutreClio;
            bob.nbVoitures = 2 ; // nb de voiture possedé par bob
        uneClio.Proprietaire = bob ;// on affecte une voiture l'objet uneClio au propriétaire bob
        uneMicra.Proprietaire = bob ;
        une2008.Proprietaire = reno ;
        uneAutreClio.Proprietaire = reno;
        
        //System.out.println("liste des voitures disponibles "+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0] ); 
        System.out.println("la deuxième voiture de Bob est " +  bob.liste_voitures[1]); // affichage
        System.out.println("la première voiture de Reno est " +  reno.liste_voitures[2]);
        System.out.println("la deuxième voiture de Reno est " +  reno.liste_voitures[3]);

    
    
    }
    
}
