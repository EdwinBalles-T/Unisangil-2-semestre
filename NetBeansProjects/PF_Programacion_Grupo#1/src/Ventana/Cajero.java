/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventana;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Cajero extends javax.swing.JFrame{
    Cuentas cue;
    /**
     * Creates new form Cajero
     */
    public Cajero() {
        initComponents();
        setLocationRelativeTo(null);     
    }
    
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtftarjeta1 = new javax.swing.JTextField();
        jbingresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAJERO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 90, 30));

        jLabel2.setText("Ingresar Tarjeta:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 110, 30));

        jtftarjeta1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtftarjeta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtftarjeta1ActionPerformed(evt);
            }
        });
        jPanel1.add(jtftarjeta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 140, 30));

        jbingresar.setText("Ingresar");
        jbingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbingresarActionPerformed(evt);
            }
        });
        jPanel1.add(jbingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("Crear cuenta");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbingresarActionPerformed
        int contra = Integer.parseInt(jtftarjeta1.getText()) ;
       
        cue= new Cuentas(contra);
            if(cue.tarjetaclave()==1){
            
               Usuario us= new Usuario();
               us.setVisible(true);
               dispose();
            }if(cue.tarjetaclave()==2){
                
                JOptionPane.showMessageDialog(null,"cuenta invalida",null,3);

            }
    }//GEN-LAST:event_jbingresarActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
               CuentaUsuario as= new CuentaUsuario();
               as.setVisible(true);
               dispose();
         
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jtftarjeta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtftarjeta1ActionPerformed

    }//GEN-LAST:event_jtftarjeta1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbingresar;
    private javax.swing.JTextField jtftarjeta1;
    // End of variables declaration//GEN-END:variables
}