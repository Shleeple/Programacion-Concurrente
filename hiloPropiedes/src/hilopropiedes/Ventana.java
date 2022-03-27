/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilopropiedes;
import javax.swing.JOptionPane;

/**
 *
 * @author juanj
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    private Hilo obj[] = new Hilo[15];
    private int cnt, selectedThread;
    
    public Ventana() {
        this.cnt = 0;
        initComponents();
            System.out.println("Prioridad de Ventana: "+Thread.currentThread().getPriority()
                    +"\nNombre del hio Ventana: " + Thread.currentThread().getName());
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
        txtNombre = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtPrioridad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnNombre = new javax.swing.JButton();
        btnId = new javax.swing.JButton();
        btnPrioridad = new javax.swing.JButton();
        btnHilo = new javax.swing.JButton();
        cboBoxHilo = new javax.swing.JComboBox<>();
        cboBoxPrioridad = new javax.swing.JComboBox<>();
        btnCambiarNombre = new javax.swing.JButton();
        labelHilo = new javax.swing.JLabel();
        btnInterrupt = new javax.swing.JButton();
        btnState = new javax.swing.JButton();
        labelState = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtPrioridad.setEditable(false);
        txtPrioridad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Id");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Prioridad");

        btnNombre.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnNombre.setText("Mostrar Nombre");
        btnNombre.setEnabled(false);
        btnNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNombreActionPerformed(evt);
            }
        });

        btnId.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnId.setText("Mostrar ID");
        btnId.setEnabled(false);
        btnId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdActionPerformed(evt);
            }
        });

        btnPrioridad.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnPrioridad.setText("Mostrar Prioridad");
        btnPrioridad.setEnabled(false);
        btnPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrioridadActionPerformed(evt);
            }
        });

        btnHilo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnHilo.setText("Crear e Iniciar Nuevo Hilo");
        btnHilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHiloActionPerformed(evt);
            }
        });

        cboBoxHilo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cboBoxHilo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir Hilo" }));
        cboBoxHilo.setEnabled(false);
        cboBoxHilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBoxHiloActionPerformed(evt);
            }
        });

        cboBoxPrioridad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cboBoxPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cambiar Prioridad", "Prioridad Mínima", "Prioridad Normal", "Prioridad Máxima" }));
        cboBoxPrioridad.setEnabled(false);
        cboBoxPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBoxPrioridadActionPerformed(evt);
            }
        });

        btnCambiarNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCambiarNombre.setText("Cambiar Nombre");
        btnCambiarNombre.setEnabled(false);
        btnCambiarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarNombreActionPerformed(evt);
            }
        });

        labelHilo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelHilo.setForeground(new java.awt.Color(0, 0, 0));
        labelHilo.setText("Texto del Hilo");

        btnInterrupt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnInterrupt.setText("Interrupt");
        btnInterrupt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterruptActionPerformed(evt);
            }
        });

        btnState.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnState.setText("State");
        btnState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStateActionPerformed(evt);
            }
        });

        labelState.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelState.setForeground(new java.awt.Color(0, 0, 0));
        labelState.setText("State del Hilo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPrioridad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNombre)
                            .addComponent(btnPrioridad)
                            .addComponent(btnId)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelState)
                            .addComponent(labelHilo))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnState)
                            .addComponent(btnInterrupt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHilo)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboBoxPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCambiarNombre)
                    .addComponent(cboBoxHilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnNombre)
                    .addComponent(btnCambiarNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnPrioridad)
                    .addComponent(cboBoxPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHilo)
                        .addComponent(cboBoxHilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnInterrupt)
                        .addComponent(labelHilo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnState)
                    .addComponent(labelState))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHiloActionPerformed
        // TODO add your handling code here:
        btnCambiarNombre.setEnabled(true);
        btnNombre.setEnabled(true);
        btnId.setEnabled(true);
        btnPrioridad.setEnabled(true);
        cboBoxHilo.setEnabled(true);
        cboBoxPrioridad.setEnabled(true);
        //obj[cnt] = new Hilo();
        //obj[cnt].start();
        if(cnt<=15){
            obj[cnt] = new Hilo();
            obj[cnt].setLabel(labelHilo);
            obj[cnt].start();  
            cnt++;
        }
        cboBoxHilo.addItem("Hilo " + (cnt+1));
    }//GEN-LAST:event_btnHiloActionPerformed

    private void btnPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrioridadActionPerformed
        // TODO add your handling code here:
        String prioridad;
        switch(obj[selectedThread].getPriority()){
            case Thread.MAX_PRIORITY:
                prioridad = "Máxima";
                break;
            case Thread.MIN_PRIORITY:
                prioridad = "Mínima";
                break;
            case Thread.NORM_PRIORITY:
                prioridad = "Normal";
                break;
            default:
                prioridad = obj[selectedThread].getPriority()+"";
        }
        txtPrioridad.setText(prioridad);
    }//GEN-LAST:event_btnPrioridadActionPerformed

    private void btnIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIdActionPerformed
        // TODO add your handling code here:
        txtId.setText(obj[selectedThread].getId()+"");
    }//GEN-LAST:event_btnIdActionPerformed

    private void btnNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNombreActionPerformed
        // TODO add your handling code here:
        txtNombre.setText(obj[selectedThread].getName()+"");
    }//GEN-LAST:event_btnNombreActionPerformed

    private void cboBoxHiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBoxHiloActionPerformed
        // TODO add your handling code here:
        selectedThread = cboBoxHilo.getSelectedIndex()-1;
    }//GEN-LAST:event_cboBoxHiloActionPerformed

    private void btnCambiarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarNombreActionPerformed
        // TODO add your handling code here:
        String newName = JOptionPane.showInputDialog("Select a name: ");
        txtNombre.setText(newName);
        obj[selectedThread].setName(newName);
    }//GEN-LAST:event_btnCambiarNombreActionPerformed

    private void cboBoxPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBoxPrioridadActionPerformed
        // TODO add your handling code here:
        switch(cboBoxPrioridad.getSelectedIndex()){
            case 1: // 1 es mínimo
                obj[selectedThread].setPriority(Thread.MIN_PRIORITY);
                txtPrioridad.setText("Mínima");
                break;
            case 2: // 2 es normal
                obj[selectedThread].setPriority(Thread.NORM_PRIORITY);
                txtPrioridad.setText("Normal");
                break;
            case 3: // 3 es máxima
                obj[selectedThread].setPriority(Thread.MAX_PRIORITY);
                txtPrioridad.setText("Máxima");
                break;
            // como si se selecciona la opcion 0 no se cambia la prioridad ni nada
            // no es necesario agregar un default
        }
        
    }//GEN-LAST:event_cboBoxPrioridadActionPerformed

    private void btnInterruptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterruptActionPerformed
        // TODO add your handling code here:
        obj[selectedThread].interrupt();
    }//GEN-LAST:event_btnInterruptActionPerformed

    private void btnStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStateActionPerformed
        // TODO add your handling code here:
        labelState.setText(obj[selectedThread].getState().toString());
    }//GEN-LAST:event_btnStateActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        System.out.println("Prioridad de Main: "+Thread.currentThread().getPriority()
                +"\nNombre del hio Ventana: " + Thread.currentThread().getName());
        //java.awt.EventQueue.invokeLater(new Runnable() {
        //    public void run() {
                new Ventana().setVisible(true);
        //    }
        //});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarNombre;
    private javax.swing.JButton btnHilo;
    private javax.swing.JButton btnId;
    private javax.swing.JButton btnInterrupt;
    private javax.swing.JButton btnNombre;
    private javax.swing.JButton btnPrioridad;
    private javax.swing.JButton btnState;
    private javax.swing.JComboBox<String> cboBoxHilo;
    private javax.swing.JComboBox<String> cboBoxPrioridad;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelHilo;
    private javax.swing.JLabel labelState;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrioridad;
    // End of variables declaration//GEN-END:variables
}
