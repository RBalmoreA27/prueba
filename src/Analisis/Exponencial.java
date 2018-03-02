/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analisis;

import javax.swing.table.DefaultTableModel;
public class Exponencial extends javax.swing.JFrame {

    /**
     * Creates new form Exponencial
     */
    public Exponencial() {
    Taylorexponencial ej3 = new Taylorexponencial();
    DefaultTableModel model1, model2;
    setTitle("Exponencial");
        initComponents();
         this.setResizable(false);
        this.setLocationRelativeTo(null);
        txtValorReal.setEditable(false);
        vista();
        btnFin.setVisible(false);
        txtaCon.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbla = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        txtMetodo1 = new javax.swing.JTextField();
        txtMetodo2 = new javax.swing.JTextField();
        lblfx = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        btnCalc = new javax.swing.JButton();
        txtValorReal = new javax.swing.JTextField();
        txtCifras = new javax.swing.JTextField();
        btnFin = new javax.swing.JButton();
        lblEa = new javax.swing.JLabel();
        lblEa1 = new javax.swing.JLabel();
        txtEa1 = new javax.swing.JTextField();
        txtEa2 = new javax.swing.JTextField();
        btnConclusion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaCon = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbla.setForeground(new java.awt.Color(255, 255, 255));
        lbla.setText("Ingrese la cantidad de cifras significativas");
        getContentPane().add(lbla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 232, 25));

        lbl2.setText("Segundo Metodo");
        getContentPane().add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        getContentPane().add(txtMetodo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 120, 30));
        getContentPane().add(txtMetodo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 120, 30));

        lblfx.setText("Valor Real de f(x)=e⁻⁵");
        getContentPane().add(lblfx, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 120, 20));

        lbl1.setText("Primer Metodo");
        getContentPane().add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        btnCalc.setForeground(new java.awt.Color(255, 255, 255));
        btnCalc.setText("Calcular con los metodos");
        btnCalc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        btnCalc.setContentAreaFilled(false);
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 210, 30));
        getContentPane().add(txtValorReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 190, -1));

        txtCifras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCifrasKeyTyped(evt);
            }
        });
        getContentPane().add(txtCifras, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 60, 30));

        btnFin.setForeground(new java.awt.Color(255, 255, 255));
        btnFin.setText("finalizar");
        btnFin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        btnFin.setContentAreaFilled(false);
        btnFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinActionPerformed(evt);
            }
        });
        getContentPane().add(btnFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 120, 40));

        lblEa.setText("Ea");
        getContentPane().add(lblEa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        lblEa1.setText("Ea");
        getContentPane().add(lblEa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));
        getContentPane().add(txtEa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 140, -1));
        getContentPane().add(txtEa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 140, -1));

        btnConclusion.setForeground(new java.awt.Color(255, 255, 255));
        btnConclusion.setText("Concluisones");
        btnConclusion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        btnConclusion.setContentAreaFilled(false);
        btnConclusion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConclusionActionPerformed(evt);
            }
        });
        getContentPane().add(btnConclusion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 120, 50));

        txtaCon.setEditable(false);
        txtaCon.setColumns(20);
        txtaCon.setRows(5);
        txtaCon.setBorder(null);
        jScrollPane1.setViewportView(txtaCon);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 390, 210));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/fondo-negro.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 430, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCifrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCifrasKeyTyped
        char c= evt.getKeyChar();
        if(c<'0' || c>'9' ){
            evt.consume();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_txtCifrasKeyTyped

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        if(!txtCifras.getText().equals("")){
            txtMetodo1.setVisible(true);
            txtMetodo2.setVisible(true);
            lbl1.setVisible(true);
            lbl2.setVisible(true);
            btnConclusion.setVisible(true);
            btnCalc.setVisible(false);
            lblEa.setVisible(true);
        lblEa1.setVisible(true);
        txtEa1.setVisible(true);
        txtEa2.setVisible(true);
        }
    }//GEN-LAST:event_btnCalcActionPerformed

    private void btnConclusionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConclusionActionPerformed
     btnFin.setVisible(true);
    vista();
    lbla.setVisible(false);
    lblfx.setVisible(false);
    txtCifras.setVisible(false);
    txtValorReal.setVisible(false);
    txtaCon.setVisible(true);
    txtaCon.setText("hola");
    }//GEN-LAST:event_btnConclusionActionPerformed

    private void btnFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFinActionPerformed
 
    public void vista(){
         lbl1.setVisible(false);
        lbl2.setVisible(false);
        txtMetodo1.setVisible(false);
        txtMetodo2.setVisible(false);
        lblEa.setVisible(false);
        lblEa1.setVisible(false);
        txtEa1.setVisible(false);
        txtEa2.setVisible(false);
     btnConclusion.setVisible(false);
    }
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
            java.util.logging.Logger.getLogger(Exponencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exponencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exponencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exponencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exponencial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnConclusion;
    private javax.swing.JButton btnFin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblEa;
    private javax.swing.JLabel lblEa1;
    private javax.swing.JLabel lbla;
    private javax.swing.JLabel lblfx;
    private javax.swing.JTextField txtCifras;
    private javax.swing.JTextField txtEa1;
    private javax.swing.JTextField txtEa2;
    private javax.swing.JTextField txtMetodo1;
    private javax.swing.JTextField txtMetodo2;
    private javax.swing.JTextField txtValorReal;
    private javax.swing.JTextArea txtaCon;
    // End of variables declaration//GEN-END:variables
}
