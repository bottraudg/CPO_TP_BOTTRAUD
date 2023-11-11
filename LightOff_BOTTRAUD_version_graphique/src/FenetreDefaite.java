
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import lightoff_bottraud_version_console.GrilleDeCellules;
import lightoff_bottraud_version_console.Partie;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author guilenebottraud
 */
public class FenetreDefaite extends javax.swing.JFrame {

    
    // private JButton[] listeBoutons;
    /**
     * Creates new form FenetrePrincipale
     */
    public FenetreDefaite() {
        initComponents();
        

    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("TU AS PERDU 🥲");
        jLabel1.setAlignmentX(10.0F);
        jLabel1.setAlignmentY(0.0F);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        jLabel2.setText("👎👎👎");
        jLabel2.setAlignmentY(0.0F);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 40, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents


   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}
