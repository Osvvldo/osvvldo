
package vistas;

import javax.swing.JOptionPane;


public class Panel extends javax.swing.JFrame {

    
    public Panel() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jmSistema = new javax.swing.JMenu();
        jmiCerrarSesion = new javax.swing.JMenuItem();
        jmiSalir = new javax.swing.JMenuItem();
        jmClientes = new javax.swing.JMenu();
        jmiNuevo = new javax.swing.JMenuItem();
        jmiAdministrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jmSistema.setText("Sistema");

        jmiCerrarSesion.setText("Cerrar Sesion");
        jmiCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCerrarSesionActionPerformed(evt);
            }
        });
        jmSistema.add(jmiCerrarSesion);

        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jmSistema.add(jmiSalir);

        jMenuBar1.add(jmSistema);

        jmClientes.setText("Clientes");

        jmiNuevo.setText("Nuevo");
        jmiNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNuevoActionPerformed(evt);
            }
        });
        jmClientes.add(jmiNuevo);

        jmiAdministrar.setText("Administrar");
        jmiAdministrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAdministrarActionPerformed(evt);
            }
        });
        jmClientes.add(jmiAdministrar);

        jMenuBar1.add(jmClientes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 852, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        
        int sel = JOptionPane.showConfirmDialog(null, 
                "¿Desea cerrar la aplicacion?", "ALERTA", JOptionPane.YES_NO_OPTION);
        
        if (sel==JOptionPane.YES_OPTION)
        {System.exit(0);
        }
        
        
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void jmiCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCerrarSesionActionPerformed
        int sel = JOptionPane.showConfirmDialog(null, 
                "¿Desea cerrar sesion?", "ALERTA", JOptionPane.YES_NO_OPTION);
        if (sel==JOptionPane.YES_OPTION){
        Login uno= new Login();
            uno.setVisible(true);
            this.dispose();}
    }//GEN-LAST:event_jmiCerrarSesionActionPerformed

    private void jmiNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNuevoActionPerformed
        ClientesAgregar tercero = new ClientesAgregar();
        this.add(tercero);
        tercero.setVisible(true);
        
    }//GEN-LAST:event_jmiNuevoActionPerformed

    private void jmiAdministrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAdministrarActionPerformed
        ClientesAdmin cuarto = new ClientesAdmin();
        this.add(cuarto);
        cuarto.setVisible(true);
        
    }//GEN-LAST:event_jmiAdministrarActionPerformed

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
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmClientes;
    private javax.swing.JMenu jmSistema;
    private javax.swing.JMenuItem jmiAdministrar;
    private javax.swing.JMenuItem jmiCerrarSesion;
    private javax.swing.JMenuItem jmiNuevo;
    private javax.swing.JMenuItem jmiSalir;
    // End of variables declaration//GEN-END:variables
}
