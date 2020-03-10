package metodosnumericos;

import metodosnumericos.VentanaPuntoFIjo;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.*;

public class Principal extends javax.swing.JFrame {
    Errores tema1 = new Errores();
    WinBiseccion Unidad2Bi = new WinBiseccion();
    VentanaPuntoFIjo Unidad2PuntoFijo = new VentanaPuntoFIjo();
    VentanaNewton VNewton = new VentanaNewton();
    VentanaSecante Unidad2Sec = new VentanaSecante(); 
 

    public Principal() {
        initComponents();
       this.setSize(730, 600);
      this.setResizable(true);  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        Errores = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(375, 690));
        setPreferredSize(new java.awt.Dimension(343, 654));
        getContentPane().setLayout(null);

        desktopPane.setBackground(new java.awt.Color(51, 51, 255));
        desktopPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodosnumericos/iconos/OnePlusX.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        desktopPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPaneLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(desktopPane);
        desktopPane.setBounds(0, 0, 729, 669);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodosnumericos/iconos/Point.png"))); // NOI18N
        jMenu1.setText("MetodosNumericos");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenu3.setText("Tema1");

        Errores.setText("Errores");
        Errores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ErroresActionPerformed(evt);
            }
        });
        jMenu3.add(Errores);

        jMenu1.add(jMenu3);

        jMenu2.setText("Tema2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Biseccion");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Punto Fijo");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem2);

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("Newton");
        jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem3);

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("Secante");
        jCheckBoxMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem4);

        jMenu1.add(jMenu2);

        jMenu4.setText("Tema3");
        jMenu1.add(jMenu4);

        jMenu5.setText("Tema4");
        jMenu1.add(jMenu5);

        jMenu6.setText("Tema5");
        jMenu1.add(jMenu6);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ErroresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ErroresActionPerformed
        //Error absoluto y error relativo
            if (!desktopPane.isAncestorOf(tema1)) {
            int x = (desktopPane.getWidth() / 2) - (tema1.getWidth() / 2);
            int y = (desktopPane.getHeight() / 2) - (tema1.getHeight() / 2);
            desktopPane.add(tema1);
            tema1.toFront();
            tema1.setLocation(x , y + 50);
            tema1.setVisible(true);
        } else {
            desktopPane.setSelectedFrame(tema1);
        }
    }//GEN-LAST:event_ErroresActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
        if (!desktopPane.isAncestorOf(Unidad2Bi)) {
            int x = (desktopPane.getWidth() / 2) - (Unidad2Bi.getWidth() / 2);
            int y = (desktopPane.getHeight() / 2) - (Unidad2Bi.getHeight() / 2);
            desktopPane.add(Unidad2Bi);
            Unidad2Bi.toFront();
            Unidad2Bi.setLocation(x, y + 50);
            Unidad2Bi.setVisible(true);
        }
        else {
            desktopPane.setSelectedFrame(Unidad2Bi);
        }
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jCheckBoxMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem4ActionPerformed
        // TODO add your handling code here:
                 if (!desktopPane.isAncestorOf(Unidad2Sec)) {
            int x = (desktopPane.getWidth() / 2) - (Unidad2Sec.getWidth() / 2);
            int y = (desktopPane.getHeight() / 2) - (Unidad2Sec.getHeight() / 2);
            desktopPane.add(Unidad2Sec);
            Unidad2Sec.toFront();
            Unidad2Sec.setLocation(x, y + 50);
            Unidad2Sec.setVisible(true);
        } else {
            desktopPane.setSelectedFrame(Unidad2Sec);
        }
    }//GEN-LAST:event_jCheckBoxMenuItem4ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        // TODO add your handling code here:
         if (!desktopPane.isAncestorOf(Unidad2PuntoFijo)) {
            int x = (desktopPane.getWidth() / 2) - (Unidad2PuntoFijo.getWidth() / 2);
            int y = (desktopPane.getHeight() / 2) - (Unidad2PuntoFijo.getHeight() / 2);
            desktopPane.add(Unidad2PuntoFijo);
            Unidad2PuntoFijo.toFront();
            Unidad2PuntoFijo.setLocation(x, y + 50);
            Unidad2PuntoFijo.setVisible(true);
        } else {
            desktopPane.setSelectedFrame(Unidad2PuntoFijo);
        }
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem3ActionPerformed
        // TODO add your handling code here:
        if (!desktopPane.isAncestorOf(VNewton)) {
            int x = (desktopPane.getWidth() / 2) - (VNewton.getWidth() / 2);
            int y = (desktopPane.getHeight() / 2) - (VNewton.getHeight() / 2);
            desktopPane.add(VNewton);
            VNewton.toFront();
            VNewton.setLocation(x, y + 50);
            VNewton.setVisible(true);
        } else {
            desktopPane.setSelectedFrame(VNewton);
        }
    }//GEN-LAST:event_jCheckBoxMenuItem3ActionPerformed

    public static void main(String args[]) {
try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Errores;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
   }
