
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
public class FenetrePrincipale extends javax.swing.JFrame {

    GrilleDeCellules grille = null;
    int nbCoups=0;
    int i;

  
    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale(int taille, int coupsMax) {
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
                PanneauGrille.add(bouton_cellule); 
                initialiserPartie();
            }
        }
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, nbColonnes * 40, nbLignes * 40));
        this.pack();
        this.revalidate();
         // création du panneau de boutons verticaux (pour les lignes) 
        PanneauBoutonsVerticaux.setLayout(new GridLayout(nbLignes, 1));
        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1 * 40, nbLignes * 40));
        this.pack();
        this.revalidate();

       
        for (i = 0; i < nbLignes; i++) {
            JButton bouton_ligne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                     nbCoups++;
                    jLabel1.setText("il vous reste "+ (Coupsmax - nbCoups) + " coups");
                     if (Coupsmax-nbCoups==0){
                        FenetreDefaite f=new FenetreDefaite();
                            f.setVisible(true);
                            FenetrePrincipale.this.dispose();
                    }
                    repaint();
                    verifierFinDePartie();
                }
            };
            bouton_ligne.addActionListener(ecouteurClick);
            PanneauBoutonsVerticaux.add(bouton_ligne);
            
        }
        
        //création du panneau de boutons horizontaux (pour les colonnes)
         PanneauBoutonsHorizontaux.setLayout(new GridLayout(1, nbColonnes));
        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, nbColonnes * 40, 1 * 40));
        this.pack();
        this.revalidate();
        
        
        for (i = 0; i < nbColonnes; i++) {
            JButton bouton_colonne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(j);
                    nbCoups++;
                    jLabel1.setText("Il vous reste "+ (Coupsmax - nbCoups) + " coups");
                     if (Coupsmax-nbCoups==0){
                        FenetreDefaite f=new FenetreDefaite();
                            f.setVisible(true);
                            FenetrePrincipale.this.dispose();
                    }
                    repaint();
                    verifierFinDePartie();
                }
            };
            bouton_colonne.addActionListener(ecouteurClick);
            PanneauBoutonsHorizontaux.add(bouton_colonne);
            
        }
        
DiagMont.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            DiagMontActionPerformed(evt);
            nbCoups++;
           
                grille.activerDiagonaleMontante();
           
            jLabel1.setText("Il vous reste "+(Coupsmax-nbCoups)+" coups");
            repaint();
           
                    if (Coupsmax-nbCoups==0){
                        FenetreDefaite f=new FenetreDefaite();
                            f.setVisible(true);
                            FenetrePrincipale.this.dispose();
                    }
           
        }
    });
DiagDes.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            DiagDesActionPerformed(evt);
            nbCoups++;
           
                grille.activerDiagonaleDescendante();
           
            jLabel1.setText("Il vous reste "+(Coupsmax-nbCoups)+" coups");
            repaint();
           
                    if (Coupsmax-nbCoups==0){
                        FenetreDefaite f=new FenetreDefaite();
                            f.setVisible(true);
                            FenetrePrincipale.this.dispose();
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
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsHorizontaux = new javax.swing.JPanel();
        DiagDes = new javax.swing.JButton();
        DiagMont = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 200, 210));

        javax.swing.GroupLayout PanneauBoutonsVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonsVerticaux);
        PanneauBoutonsVerticaux.setLayout(PanneauBoutonsVerticauxLayout);
        PanneauBoutonsVerticauxLayout.setHorizontalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        PanneauBoutonsVerticauxLayout.setVerticalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 40, 60, 360));

        javax.swing.GroupLayout PanneauBoutonsHorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonsHorizontaux);
        PanneauBoutonsHorizontaux.setLayout(PanneauBoutonsHorizontauxLayout);
        PanneauBoutonsHorizontauxLayout.setHorizontalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        PanneauBoutonsHorizontauxLayout.setVerticalGroup(
            PanneauBoutonsHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 80, -1));

        DiagDes.setText("Diag");
        DiagDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagDesActionPerformed(evt);
            }
        });
        getContentPane().add(DiagDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        DiagMont.setText("Diag");
        DiagMont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagMontActionPerformed(evt);
            }
        });
        getContentPane().add(DiagMont, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

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

    private void verifierFinDePartie() {
        if (grille.cellulesToutesEteintes()) {
         
            
            System.out.println("partie finie");
            this.setVisible(false);
            new FenetreVictoire().setVisible(true);
        }
    }

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DiagDes;
    private javax.swing.JButton DiagMont;
    private javax.swing.JPanel PanneauBoutonsHorizontaux;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
