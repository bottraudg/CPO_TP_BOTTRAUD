
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
public class FenetreMenu extends javax.swing.JFrame {

    //FenetrePrincipale fenetre;

    // private JButton[] listeBoutons;
    /**
     * Creates new form FenetrePrincipale
     */
    public FenetreMenu() {
        initComponents();

    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetreMenu().setVisible(true);
            }
        });
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FACILE = new javax.swing.JButton();
        MOYEN = new javax.swing.JButton();
        DIFFICILE = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField9 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FACILE.setText("FACILE");
        FACILE.setPreferredSize(new java.awt.Dimension(100, 50));
        FACILE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FACILEActionPerformed(evt);
            }
        });
        getContentPane().add(FACILE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        MOYEN.setText("MOYEN");
        MOYEN.setPreferredSize(new java.awt.Dimension(100, 50));
        MOYEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOYENActionPerformed(evt);
            }
        });
        getContentPane().add(MOYEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        DIFFICILE.setText("DIFFICILE");
        DIFFICILE.setPreferredSize(new java.awt.Dimension(100, 50));
        DIFFICILE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIFFICILEActionPerformed(evt);
            }
        });
        getContentPane().add(DIFFICILE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel1.setText("BIENVENUE DANS LE JEU LIGHTSOFF 😎");
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 17));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 250, 40));

        jLabel2.setText("CHOISISSEZ UN NIVEAU DE JEU : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, 40));

        jButton1.setText("CONFUSION");
        jButton1.setPreferredSize(new java.awt.Dimension(110, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        jTextField1.setBackground(new java.awt.Color(246, 246, 246));
        jTextField1.setText("Nombre de coups: 50");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 160, -1));

        jTextField2.setBackground(new java.awt.Color(246, 246, 246));
        jTextField2.setText("Grille : 4/4");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        jTextField3.setBackground(new java.awt.Color(246, 246, 246));
        jTextField3.setText("Nombre de coups: 10");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 160, -1));

        jTextField4.setBackground(new java.awt.Color(246, 246, 246));
        jTextField4.setText("Grille : 5/5");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        jTextField5.setBackground(new java.awt.Color(246, 246, 246));
        jTextField5.setText("Nombre de coups: 50");
        jTextField5.setCaretColor(new java.awt.Color(1, 2, 3));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 160, -1));

        jTextField6.setBackground(new java.awt.Color(246, 246, 246));
        jTextField6.setText("Grille : 3/3");
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        jTextField7.setBackground(new java.awt.Color(246, 246, 246));
        jTextField7.setText("Nombre de coups: 15");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 160, -1));

        jTextField8.setBackground(new java.awt.Color(246, 246, 246));
        jTextField8.setText("Grille : 4/4");
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(0, 204, 0));
        jScrollPane1.setBorder(null);

        jTextArea1.setBackground(new java.awt.Color(246, 246, 246));
        jTextArea1.setRows(5);
        jTextArea1.setText("But du jeu: \nChanger toutes les cellules en noires.\n\nRègles du jeu: \nVous avez à votre disposition des \nboutons qui active des lignes, \ndes colonnes ou des diagonales. \nCliquersur un bouton va rendre les \ncellules noires vertes et inversement.\n\nVous ne pouvez pas changer une seule\ncellule.");
        jTextArea1.setSelectedTextColor(new java.awt.Color(102, 102, 255));
        jTextArea1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 250, 210));
        jScrollPane1.getAccessibleContext().setAccessibleName("");

        jTextField9.setBackground(new java.awt.Color(246, 246, 246));
        jTextField9.setText("Attention les boutons ne sont pas ceux qu'ils pretendent être 😈");
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FACILEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FACILEActionPerformed
        new FenetrePrincipale(3,50).setVisible(true); 
        this.dispose();// TODO add your handling code here:

    }//GEN-LAST:event_FACILEActionPerformed

    private void MOYENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOYENActionPerformed
        new FenetrePrincipale(4, 50).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MOYENActionPerformed

    private void DIFFICILEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIFFICILEActionPerformed
        new FenetrePrincipale(5,10).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DIFFICILEActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new NiveauConfusion(4,15).setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DIFFICILE;
    private javax.swing.JButton FACILE;
    private javax.swing.JButton MOYEN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
