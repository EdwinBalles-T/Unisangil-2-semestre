/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana;
import carrovirtual.Carro1;
import javax.swing.JOptionPane;
/**
 *
 * @author Edwin ballesteros
 */
public class conducirCarro extends javax.swing.JFrame {
    Carro1 car;
    Carro1 carros[];
    int contador=0;
   
    
    public void actualizar() {
	 
	jltitulo2.setText("Estado Carro: "+car.getPlaca());
		
	if(car.getEstadoMotor()) {
		    jlmotor.setText("Motor: ENCENDIDO");
	    }else {
			jlmotor.setText("Motor: APAGADO");
	   }
	jlnivel.setText("Nivel de Batería: "+String.valueOf(car.getNivelBateria())+" %");
    jlvelocidad.setText("Velocidad: "+String.valueOf(car.getVelocidad())+" Kl/h");
         
		}
	
	public void limpiar() {
		jtplaca.setText("");
		jtcolor.setText("");
		jtmodelo.setText("0");
		jtmarca.setText("");
		jtplaca.requestFocus();
                
	}
    /**
     * Creates new form conducirCarro
     */
    public conducirCarro() {
        this.setLocationRelativeTo(null);
        carros = new Carro1[3];
        initComponents();
        jbprender.setEnabled(false);
        jbacelerar.setEnabled(false);
        jbapagar.setEnabled(false);
        jbfrenar.setEnabled(false);
        jclista.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtplaca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtcolor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtmodelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtmarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbcrear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jltitulo2 = new javax.swing.JLabel();
        jlmotor = new javax.swing.JLabel();
        jlnivel = new javax.swing.JLabel();
        jlvelocidad = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jclista = new javax.swing.JComboBox<>();
        jbprender = new javax.swing.JButton();
        jbacelerar = new javax.swing.JButton();
        jbapagar = new javax.swing.JButton();
        jbfrenar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Placa:");

        jtplaca.setText(" ");
        jtplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtplacaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Color:");

        jtcolor.setText(" ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Modelo:");

        jtmodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtmodeloActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Marca:");

        jtmarca.setText(" ");

        jLabel5.setBackground(new java.awt.Color(51, 51, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Datos Conducir");

        jbcrear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbcrear.setText("Crear");
        jbcrear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtcolor)
                                .addComponent(jtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbcrear)
                            .addComponent(jtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbcrear)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 210));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jltitulo2.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jltitulo2.setText("Estado Carro");

        jlmotor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlmotor.setText("Motor:  ____________________");

        jlnivel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlnivel.setText("Nivel Bateria:  _____________");

        jlvelocidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlvelocidad.setText("Velocidad:  ____________Kl/h");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jltitulo2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlnivel)
                            .addComponent(jlmotor)
                            .addComponent(jlvelocidad))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jltitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlmotor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlnivel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlvelocidad)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 300, 140));

        jPanel5.setBackground(new java.awt.Color(255, 102, 102));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel10.setText("Conducir Carro");

        jclista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione carro", "Carro 1", "Carro 2", "Carro 3" }));
        jclista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jclistaActionPerformed(evt);
            }
        });

        jbprender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbprender.setText("Prender");
        jbprender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbprenderActionPerformed(evt);
            }
        });

        jbacelerar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbacelerar.setText("Acelerar");
        jbacelerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbacelerarActionPerformed(evt);
            }
        });

        jbapagar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbapagar.setText("Apagar");
        jbapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbapagarActionPerformed(evt);
            }
        });

        jbfrenar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbfrenar.setText("Frenar");
        jbfrenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbfrenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbprender)
                    .addComponent(jbacelerar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbapagar)
                    .addComponent(jbfrenar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jclista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jclista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbapagar)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jbprender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbacelerar)
                            .addComponent(jbfrenar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 300, 140));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventana/virtual-reality.gif"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbfrenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbfrenarActionPerformed
        // TODO add your handling code here:
        car.frenar();
        actualizar();
    }//GEN-LAST:event_jbfrenarActionPerformed

    private void jbapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbapagarActionPerformed
        // TODO add your handling code here:
        car.apagar();
        actualizar();
        jbprender.setEnabled(true);
        jbapagar.setEnabled(false);
    }//GEN-LAST:event_jbapagarActionPerformed

    private void jbacelerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbacelerarActionPerformed
        // TODO add your handling code here:
        car.acelerar();
        actualizar();
    }//GEN-LAST:event_jbacelerarActionPerformed

    private void jbprenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbprenderActionPerformed
        // TODO add your handling code here:
        car.encender();
        actualizar();
        jbprender.setEnabled(false);
        jbapagar.setEnabled(true);
    }//GEN-LAST:event_jbprenderActionPerformed

    private void jclistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jclistaActionPerformed
        // TODO add your handling code here:
        if(jclista.getSelectedItem()=="Seleccione carro") {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un carro",null,3);

            System.out.println("Debe seleccionar un carro");

        }else {
            car=carros[jclista.getSelectedIndex()-1];
            actualizar();
        }

    }//GEN-LAST:event_jclistaActionPerformed

    private void jbcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcrearActionPerformed
        // TODO add your handling code here:

        String pl, cl, marc;
        int mod;
        pl=jtplaca.getText();
        cl=jtcolor.getText();
        marc=jtmarca.getText();
        mod=Integer.parseInt(jtmodelo.getText());

        car = new Carro1(pl,cl,mod,marc);
        carros[contador]=car;
        contador++;
        jbcrear.setText("Crear carro "+(contador+1));
        if(contador>=3){

            //jpdatos.setVisible(false);
            jbcrear.setEnabled(false);
            jbcrear.setText("Crear carro ");
        }
        jbprender.setEnabled(true);
        jbacelerar.setEnabled(true);
        jbapagar.setEnabled(true);
        jbfrenar.setEnabled(true);
        jclista.setEnabled(true);

        limpiar();

        //actualizar();
    }//GEN-LAST:event_jbcrearActionPerformed

    private void jtmodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtmodeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtmodeloActionPerformed

    private void jtplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtplacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtplacaActionPerformed
       
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
            java.util.logging.Logger.getLogger(conducirCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(conducirCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(conducirCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(conducirCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new conducirCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jbacelerar;
    private javax.swing.JButton jbapagar;
    private javax.swing.JButton jbcrear;
    private javax.swing.JButton jbfrenar;
    private javax.swing.JButton jbprender;
    private javax.swing.JComboBox<String> jclista;
    private javax.swing.JLabel jlmotor;
    private javax.swing.JLabel jlnivel;
    private javax.swing.JLabel jltitulo2;
    private javax.swing.JLabel jlvelocidad;
    private javax.swing.JTextField jtcolor;
    private javax.swing.JTextField jtmarca;
    private javax.swing.JTextField jtmodelo;
    private javax.swing.JTextField jtplaca;
    // End of variables declaration//GEN-END:variables
}
