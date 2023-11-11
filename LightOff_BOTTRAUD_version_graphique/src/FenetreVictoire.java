
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
public class FenetreVictoire extends javax.swing.JFrame {

    
    // private JButton[] listeBoutons;
    /**
     * Creates new form FenetrePrincipale
     */
    public FenetreVictoire() {
        initComponents();
        

    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("BRAVO TU AS GAGNÉ");
        jLabel1.setToolTipText("");
        jLabel1.setAlignmentX(10.0F);
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 150, 30));

        jLabel2.setText("🏆");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 20, 20));

        jLabel3.setText("🏆");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 20, 20));

        jLabel4.setText("🏆");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 20, 20));

        jLabel5.setText("🏆");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 20, 20));

        jLabel6.setText("🏆");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 20, 20));

        jLabel7.setText("🏆");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 20, 20));

        jLabel8.setText("🏆");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 20, 20));

        jLabel9.setText("🏆");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 20, 20));

        jLabel10.setText("🏆");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 20, 20));

        jLabel11.setText("🏆");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 20, 20));

        jLabel12.setText("🏆");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 20, 20));

        jLabel13.setText("🏆");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 20, 20));

        jLabel14.setText("🏆");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 20, 20));

        jLabel15.setText("🏆");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 20, 20));

        jLabel16.setText("🏆");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 20, 20));

        jLabel17.setText("🏆");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 20, 20));

        jLabel18.setText("🏆");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 20, 20));

        jLabel19.setText("🏆");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 20, 20));

        jLabel20.setText("🏆");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 20, 20));

        jLabel21.setText("🏆");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 20, 20));

        jLabel22.setText("🏆");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 20, 20));

        jLabel23.setText("🏆");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 20, 20));

        jLabel24.setText("🏆");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 20, 20));

        jLabel25.setText("🏆");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 20, 20));

        jLabel26.setText("🏆");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 20, 20));

        jLabel27.setText("🏆");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 20, 20));

        jLabel28.setText("🏆");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 20, 20));

        jLabel29.setText("🏆");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 20, 20));

        jLabel30.setText("🏆");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 20, 20));

        jLabel31.setText("🏆");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 20, 20));

        jLabel32.setText("🏆");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 20, 20));

        jLabel33.setText("🏆");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 20, 20));

        jLabel34.setText("🏆");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 20, 20));

        jLabel35.setText("🏆");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 20, 20));

        jLabel36.setText("🏆");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 20, 20));

        jLabel37.setText("🏆");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 20, 20));

        jLabel38.setText("🏆");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 20, 20));

        jLabel39.setText("🏆");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 20, 20));

        jLabel40.setText("🏆");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 20, 20));

        jLabel41.setText("🏆");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 20, 20));

        jLabel42.setText("🏆");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 20, 20));

        jLabel43.setText("🏆");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 20, 20));

        jLabel44.setText("🏆");
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 20, 20));

        jLabel45.setText("🏆");
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 20, 20));

        jLabel46.setText("🏆");
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 20, 20));

        jLabel47.setText("🏆");
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 20, 20));

        jLabel48.setText("🏆");
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 20, 20));

        jLabel49.setText("🏆");
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 20, 20));

        jLabel50.setText("🏆");
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 20, 20));

        jLabel51.setText("🏆");
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 20, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents


   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

}
