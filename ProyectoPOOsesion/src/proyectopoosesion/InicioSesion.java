 
package proyectopoosesion;

import javax.swing.JOptionPane;

 
public class InicioSesion extends javax.swing.JFrame {

    
    public InicioSesion() {
        initComponents();
        
        
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel1 = new javax.swing.JPanel();
        jltitulo = new javax.swing.JLabel();
        jlusuario = new javax.swing.JLabel();
        jlclave = new javax.swing.JLabel();
        jtfusuario = new javax.swing.JTextField();
        jtfclave = new javax.swing.JTextField();
        jlolvidar = new javax.swing.JLabel();
        jbiniciar = new javax.swing.JButton();
        jlerror = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanel1.setBackground(new java.awt.Color(204, 255, 255));

        jltitulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 14)); // NOI18N
        jltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jltitulo.setText("Inicio sesión");

        jlusuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlusuario.setText("Usuario:");

        jlclave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlclave.setText("Contraseña:");

        jtfusuario.setText(" ");

        jtfclave.setText(" ");

        jlolvidar.setFont(new java.awt.Font("Trebuchet MS", 2, 11)); // NOI18N
        jlolvidar.setText("olvido contraseña?");
        jlolvidar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlolvidarMouseClicked(evt);
            }
        });

        jbiniciar.setText("Iniciar");
        jbiniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbiniciarActionPerformed(evt);
            }
        });

        jlerror.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlerror.setText(" ...");

        javax.swing.GroupLayout jpanel1Layout = new javax.swing.GroupLayout(jpanel1);
        jpanel1.setLayout(jpanel1Layout);
        jpanel1Layout.setHorizontalGroup(
            jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlolvidar)
                .addGap(56, 56, 56))
            .addGroup(jpanel1Layout.createSequentialGroup()
                .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jltitulo))
                    .addGroup(jpanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlusuario)
                            .addComponent(jlclave))
                        .addGap(4, 4, 4)
                        .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfclave, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbiniciar)))
                    .addGroup(jpanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jlerror, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jpanel1Layout.setVerticalGroup(
            jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jltitulo)
                .addGap(18, 18, 18)
                .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlusuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlclave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlolvidar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbiniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jlerror, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbiniciarActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==jbiniciar) {
               
            if(jtfusuario.getText().equals("uno") && jtfclave.getText().equals("123")) {  
              
               JOptionPane.showMessageDialog(null,"Bienvenid@ administrador");
               VentanaBienvenida vb = new VentanaBienvenida();
               vb.setVisible(true);
               this.dispose();
            }else if(jtfusuario.getText().equals("dos") && jtfclave.getText().equals("456")) {       
                JOptionPane.showMessageDialog(null,"Bienvenid@ usuario");
                VentanaUsuario vu = new VentanaUsuario();
                vu.setVisible(true);
                this.dispose();
            }else if(jtfusuario.getText().equals("tres") && jtfclave.getText().equals("789")) {  
                JOptionPane.showMessageDialog(null,"Bienvenid@ secretario");
                VentanaSecretario vs = new VentanaSecretario();
                vs.setVisible(true);
               this.dispose();
               }else{ jlerror.setText("no exixte la cuenta"); }
                  
            
        }
        
        
        
        
        
        
    }//GEN-LAST:event_jbiniciarActionPerformed

    private void jlolvidarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlolvidarMouseClicked
        // TODO add your handling code here:
        RecuperarClave rc = new RecuperarClave();
        rc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jlolvidarMouseClicked

     
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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbiniciar;
    private javax.swing.JLabel jlclave;
    private javax.swing.JLabel jlerror;
    private javax.swing.JLabel jlolvidar;
    private javax.swing.JLabel jltitulo;
    private javax.swing.JLabel jlusuario;
    private javax.swing.JPanel jpanel1;
    private javax.swing.JTextField jtfclave;
    private javax.swing.JTextField jtfusuario;
    // End of variables declaration//GEN-END:variables
}
