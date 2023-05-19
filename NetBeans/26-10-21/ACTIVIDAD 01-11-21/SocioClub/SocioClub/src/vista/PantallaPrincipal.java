/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.ActionEvent;
import paquete.Controlador;

/**
 *
 * @author 
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuGestion = new javax.swing.JMenu();
        itmSocio = new javax.swing.JMenuItem();
        itmEmpleado = new javax.swing.JMenuItem();
        itmPelicula = new javax.swing.JMenuItem();
        itmAlquiler = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccione alguna opción...");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        mnuGestion.setText("Gestion");

        itmSocio.setText("Gestionar Socio");
        itmSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSocioActionPerformed(evt);
            }
        });
        mnuGestion.add(itmSocio);

       
        mnuGestion.add(itmAlquiler);

        jMenuBar1.add(mnuGestion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(259, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSocioActionPerformed
        GestionarSocio edicion = new GestionarSocio();
        Controlador.actualizarModeloSocio(edicion);
        edicion.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_itmSocioActionPerformed
/*
    private void itmPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmPeliculaActionPerformed
        GestionarPelicula edicion = new GestionarPelicula();
        Controlador.actualizarModeloPelicula(edicion);
        edicion.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_itmPeliculaActionPerformed

    private void itmEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEmpleadoActionPerformed
        GestionarEmpleado edicion = new GestionarEmpleado();
        Controlador.actualizarModeloEmpleado(edicion);
        edicion.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_itmEmpleadoActionPerformed

    private void itmAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlquilerActionPerformed
        GestionarAlquiler edicion  = new GestionarAlquiler();
        Controlador.actualizarModeloAlquiler(edicion);
        edicion.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_itmAlquilerActionPerformed
*/
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAlquiler;
    private javax.swing.JMenuItem itmEmpleado;
    private javax.swing.JMenuItem itmPelicula;
    private javax.swing.JMenuItem itmSocio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuGestion;
    // End of variables declaration//GEN-END:variables
}
