
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import lightoff_bottraud_version_console.CelluleLumineuse;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author guilenebottraud
 */
public class CelluleGraphique extends JButton {

    CelluleLumineuse celluleLumineuseAssociee;
    int largeur;
    int hauteur;

    // constructeur (appelé depuis FenetrePrincipale)
    public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int l, int h) {
        this.celluleLumineuseAssociee = celluleLumineuseAssociee;
        this.largeur = l;
        this.hauteur = h;
    }
    // Methode gérant le dessin de la cellule @Override

    
        @Override
    protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    int w=this.getWidth();
    int h=this.getHeight();
    if (celluleLumineuseAssociee.estEteint()==true){
        g.setColor(new Color(62, 134, 41));
    }
    else{
        g.setColor(Color.DARK_GRAY);
    }
    g.fillOval(2, 2, w-4, h-4);
    }

}
