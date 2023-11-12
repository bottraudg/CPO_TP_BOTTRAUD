
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
public class NiveauConfusion extends javax.swing.JFrame {

    GrilleDeCellules grille = null;
    int nbCoups=0;
    int i;

    
    /**
     * Creates new form FenetrePrincipale
     */
    public NiveauConfusion(int taille, int coupsMax) {
        initComponents();
        int nbLignes = taille;
        int nbColonnes = taille;
        int Coupsmax=coupsMax;
        jLabel1.setText("il vous reste " + Coupsmax +" coups");

        this.grille = new GrilleDeCellules(nbLignes, nbColonnes);
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(grille.matriceCellules[i][j], 36, 36);
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille }
                initialiserPartie();
            }
        }
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, nbColonnes * 40, nbLignes * 40));
        this.pack();
        this.revalidate();
        
        // A CHAQUE BOUTON J'ASSIGNE LA MAUVAISE ACTION: 
           
                C1.addActionListener(new ActionListener(){
               

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(3);
                    nbCoups++;
                    jLabel1.setText("il vous reste "+ (Coupsmax - nbCoups) + " coups");
                     if (Coupsmax-nbCoups==0){
                        FenetreDefaite f=new FenetreDefaite();
                            f.setVisible(true);
                            NiveauConfusion.this.dispose();
                    }
                    repaint();
                    verifierFinDePartie();
                }
            });
                
          C2.addActionListener(new ActionListener(){
               

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(1);
                    nbCoups++;
                    jLabel1.setText("il vous reste "+ (Coupsmax - nbCoups) + " coups");
                     if (Coupsmax-nbCoups==0){
                        FenetreDefaite f=new FenetreDefaite();
                            f.setVisible(true);
                            NiveauConfusion.this.dispose();
                    }
                    repaint();
                    verifierFinDePartie();
                }
            });
           C3.addActionListener(new ActionListener(){
               

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerDiagonaleMontante();
                    nbCoups++;
                    jLabel1.setText("il vous reste "+ (Coupsmax - nbCoups) + " coups");
                     if (Coupsmax-nbCoups==0){
                        FenetreDefaite f=new FenetreDefaite();
                            f.setVisible(true);
                            NiveauConfusion.this.dispose();
                    }
                    repaint();
                    verifierFinDePartie();
                }
            });
            
           C4.addActionListener(new ActionListener(){
               

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(0);
                    nbCoups++;
                    jLabel1.setText("il vous reste "+ (Coupsmax - nbCoups) + " coups");
                     if (Coupsmax-nbCoups==0){
                        FenetreDefaite f=new FenetreDefaite();
                            f.setVisible(true);
                            NiveauConfusion.this.dispose();
                    }
                    repaint();
                    verifierFinDePartie();
                }
            });
           
            C5.addActionListener(new ActionListener(){
               

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerDiagonaleDescendante();
                    nbCoups++;
                    jLabel1.setText("il vous reste "+ (Coupsmax - nbCoups) + " coups");
                     if (Coupsmax-nbCoups==0){
                        FenetreDefaite f=new FenetreDefaite();
                            f.setVisible(true);
                            NiveauConfusion.this.dispose();
                    }
                    repaint();
                    verifierFinDePartie();
                }
            });
            C6.addActionListener(new ActionListener(){
               

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(2);
                    nbCoups++;
                    jLabel1.setText("il vous reste "+ (Coupsmax - nbCoups) + " coups");
                     if (Coupsmax-nbCoups==0){
                        FenetreDefaite f=new FenetreDefaite();
                            f.setVisible(true);
                            NiveauConfusion.this.dispose();
                    }
                    repaint();
                    verifierFinDePartie();
                }
            });
            
             C7.addActionListener(new ActionListener(){
               

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(2);
                    nbCoups++;
                    jLabel1.setText("il vous reste "+ (Coupsmax - nbCoups) + " coups");
                     if (Coupsmax-nbCoups==0){
                        FenetreDefaite f=new FenetreDefaite();
                            f.setVisible(true);
                            NiveauConfusion.this.dispose();
                    }
                    repaint();
                    verifierFinDePartie();
                }
            });
              C8.addActionListener(new ActionListener(){
               

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(0);
                    nbCoups++;
                    jLabel1.setText("il vous reste "+ (Coupsmax - nbCoups) + " coups");
                     if (Coupsmax-nbCoups==0){
                        FenetreDefaite f=new FenetreDefaite();
                            f.setVisible(true);
                            NiveauConfusion.this.dispose();
                    }
                    repaint();
                    verifierFinDePartie();
                }
            });
        
        
DiagMont.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            DiagMontActionPerformed(evt);
            nbCoups++;
           
               grille.activerColonneDeCellules(1);
           
            jLabel1.setText("Il vous reste "+(Coupsmax-nbCoups)+" coups");
            repaint();
           
                    if (Coupsmax-nbCoups==0){
                        FenetreDefaite f=new FenetreDefaite();
                            f.setVisible(true);
                            NiveauConfusion.this.dispose();
                    }
           
        }
    });
DiagDes.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            DiagDesActionPerformed(evt);
            nbCoups++;
           
               grille.activerColonneDeCellules(3);
           
            jLabel1.setText("Il vous reste "+(Coupsmax-nbCoups)+" coups");
            repaint();
           
                    if (Coupsmax-nbCoups==0){
                        FenetreDefaite f=new FenetreDefaite();
                            f.setVisible(true);
                            NiveauConfusion.this.dispose();
                    }
           
        }
    });
        
    }

    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(50);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        DiagMont = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        C6 = new javax.swing.JButton();
        C7 = new javax.swing.JButton();
        C8 = new javax.swing.JButton();
        DiagDes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 160, 150));

        DiagMont.setText("D");
        DiagMont.setPreferredSize(new java.awt.Dimension(30, 30));
        DiagMont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagMontActionPerformed(evt);
            }
        });
        getContentPane().add(DiagMont, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 40, -1));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        C1.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        C2.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        C3.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        C4.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        C5.setPreferredSize(new java.awt.Dimension(30, 30));
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });
        getContentPane().add(C5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        C6.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(C6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        C7.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(C7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        C8.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(C8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        DiagDes.setText("D");
        DiagDes.setPreferredSize(new java.awt.Dimension(30, 30));
        DiagDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagDesActionPerformed(evt);
            }
        });
        getContentPane().add(DiagDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 40, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DiagDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagDesActionPerformed
        this.grille.activerDiagonaleDescendante();
        repaint();
        verifierFinDePartie();
    }//GEN-LAST:event_DiagDesActionPerformed

    private void DiagMontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagMontActionPerformed
        this.grille.activerDiagonaleMontante();
        repaint();
        verifierFinDePartie();
    }//GEN-LAST:event_DiagMontActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C5ActionPerformed

    private void verifierFinDePartie() {
        if (grille.cellulesToutesEteintes()) {
          /*  JButton[] listeBoutons = null;

            for (JButton bouton : listeBoutons) {

                bouton.setEnabled(false);
            }*/
            
            System.out.println("partie finie");
            this.setVisible(false);
            new FenetreVictoire().setVisible(true);
        }
    }

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JButton C7;
    private javax.swing.JButton C8;
    private javax.swing.JButton DiagDes;
    private javax.swing.JButton DiagMont;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
