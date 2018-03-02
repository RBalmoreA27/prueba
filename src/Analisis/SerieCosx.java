/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analisis;

import javax.swing.JOptionPane;
/**
 *
 * @author AREVALO GONZALEZ
 */
public class SerieCosx extends javax.swing.JFrame {
      Operaciones op =new Operaciones();
    /**
     * Creates new form SerieCosx
     */
    public SerieCosx() {
        initComponents();
        setTitle("Coseno");
        this.setLocationRelativeTo(null);
        setResizable(false);
        lblVaCalcu.setVisible(false);
        lblVaReal.setVisible(false);
        txtValorCalculado.setVisible(false);
        btnFin.setVisible(false);
        txtValorReal.setVisible(false);
        lblEa.setVisible(false);
        txtEa.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFx = new javax.swing.JLabel();
        lblVariable = new javax.swing.JLabel();
        txtVariable = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lblCifras = new javax.swing.JLabel();
        txtDecimal = new javax.swing.JTextField();
        txtValorReal = new javax.swing.JTextField();
        lblVaReal = new javax.swing.JLabel();
        lblVaCalcu = new javax.swing.JLabel();
        txtValorCalculado = new javax.swing.JTextField();
        btnFin = new javax.swing.JButton();
        lblEa = new javax.swing.JLabel();
        txtEa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFx.setForeground(new java.awt.Color(255, 255, 255));
        lblFx.setText("Sea f(x) = cos(x) ");
        getContentPane().add(lblFx, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        lblVariable.setForeground(new java.awt.Color(255, 255, 255));
        lblVariable.setText("sabiendo que el valor de x es en grados que valor le darias?");
        getContentPane().add(lblVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        txtVariable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVariableKeyTyped(evt);
            }
        });
        getContentPane().add(txtVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 50, -1));

        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular f(x)");
        btnCalcular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        btnCalcular.setContentAreaFilled(false);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 90, 30));

        lblCifras.setForeground(new java.awt.Color(255, 255, 255));
        lblCifras.setText("Con cuantas cifras significativas?");
        getContentPane().add(lblCifras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        txtDecimal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDecimalKeyTyped(evt);
            }
        });
        getContentPane().add(txtDecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 50, -1));
        getContentPane().add(txtValorReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 90, -1));

        lblVaReal.setForeground(new java.awt.Color(255, 255, 255));
        lblVaReal.setText("Valor Real ");
        getContentPane().add(lblVaReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        lblVaCalcu.setForeground(new java.awt.Color(255, 255, 255));
        lblVaCalcu.setText("Valor Calculado");
        getContentPane().add(lblVaCalcu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 90, -1));
        getContentPane().add(txtValorCalculado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 80, -1));

        btnFin.setForeground(new java.awt.Color(255, 255, 255));
        btnFin.setText("Finalizar");
        btnFin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        btnFin.setContentAreaFilled(false);
        btnFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinActionPerformed(evt);
            }
        });
        getContentPane().add(btnFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 90, 30));

        lblEa.setForeground(new java.awt.Color(255, 255, 255));
        lblEa.setText("Ea =");
        getContentPane().add(lblEa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));
        getContentPane().add(txtEa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/fondo-negro.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtVariableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVariableKeyTyped
        char c =evt.getKeyChar();
        if(c!='-'&&(c<'0' || c>'9') ){
            evt.consume();
        }
    }//GEN-LAST:event_txtVariableKeyTyped

    private void txtDecimalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDecimalKeyTyped
        char c =evt.getKeyChar();
        if(c<'0' || c>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txtDecimalKeyTyped

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if(!txtVariable.getText().equals("")){
            if(!txtDecimal.getText().equals("")){
                System.out.println(txtVariable.getText());
                txtValorReal.setText(""+Math.cos(Math.toRadians(Double.parseDouble(txtVariable.getText()))));                
                txtValorCalculado.setText(""+op.Algoritmo(op.GradoLib(Integer.parseInt(txtDecimal.getText())),Integer.parseInt(txtDecimal.getText()),Math.toRadians(Double.parseDouble(txtVariable.getText())),1));
                txtValorCalculado.setVisible(true);
                txtValorReal.setVisible(true);
                lblVaReal.setVisible(true);
                lblVaCalcu.setVisible(true);
                txtVariable.setVisible(false);
                txtDecimal.setVisible(false);
                lblFx.setVisible(false);
                lblFx.setVisible(false);
                lblCifras.setVisible(false);
                lblVariable.setVisible(false);
                btnCalcular.setVisible(false);
                btnFin.setVisible(true);
                lblEa.setVisible(true);
                txtEa.setVisible(true);
                txtEa.setText(String.format("%1$.2f", op.Algoritmo(op.GradoLib(Integer.parseInt(txtDecimal.getText())),Integer.parseInt(txtDecimal.getText()),Math.toRadians(Double.parseDouble(txtVariable.getText())),2))+"%");
            }else{
              JOptionPane.showMessageDialog(null,"ingresa un valor para las cifras significativas");
              txtDecimal.setRequestFocusEnabled(true);   
            }
        }else{
             JOptionPane.showMessageDialog(null, "ingresa un valor para X");
             txtVariable.setRequestFocusEnabled(true);
        }
        
        
        
        
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFinActionPerformed

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
            java.util.logging.Logger.getLogger(SerieCosx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SerieCosx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SerieCosx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SerieCosx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SerieCosx().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnFin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCifras;
    private javax.swing.JLabel lblEa;
    private javax.swing.JLabel lblFx;
    private javax.swing.JLabel lblVaCalcu;
    private javax.swing.JLabel lblVaReal;
    private javax.swing.JLabel lblVariable;
    private javax.swing.JTextField txtDecimal;
    private javax.swing.JTextField txtEa;
    private javax.swing.JTextField txtValorCalculado;
    private javax.swing.JTextField txtValorReal;
    private javax.swing.JTextField txtVariable;
    // End of variables declaration//GEN-END:variables
}
