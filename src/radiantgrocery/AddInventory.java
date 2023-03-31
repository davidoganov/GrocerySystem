/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package radiantgrocery;

import javax.swing.JFrame;

/**
 *
 * @author sonic
 */
public class AddInventory extends javax.swing.JFrame {

    /**
     * Creates new form AddInventory
     */
    public AddInventory() {
        initComponents();
    }
    
    AddPromotion promotion = new AddPromotion();
    
    //GroceryGUI grocerygui = new GroceryGUI();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NameLabel = new javax.swing.JLabel();
        AIT2 = new javax.swing.JTextField();
        AIT3 = new javax.swing.JTextField();
        DescriptionLabel = new javax.swing.JLabel();
        WeightLabel = new javax.swing.JLabel();
        CostLabel = new javax.swing.JLabel();
        AIT4 = new javax.swing.JTextField();
        AIT1 = new javax.swing.JTextField();
        AmountLabel = new javax.swing.JLabel();
        AIT5 = new javax.swing.JTextField();
        Confirm = new javax.swing.JButton();
        QueryLabel = new javax.swing.JLabel();
        NewItem = new javax.swing.JLabel();
        Stock = new javax.swing.JLabel();
        Promotion = new javax.swing.JLabel();
        VP = new javax.swing.JLabel();
        Amount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NameLabel.setText("Item Name");

        AIT2.setEditable(false);
        AIT2.setText("jTextField1");

        AIT3.setEditable(false);
        AIT3.setText("jTextField1");
        AIT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AIT3ActionPerformed(evt);
            }
        });

        DescriptionLabel.setText("Item Description");

        WeightLabel.setText("Item Weight");

        CostLabel.setText("Item Cost");

        AIT4.setText("0");
        AIT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AIT4ActionPerformed(evt);
            }
        });

        AIT1.setEditable(false);
        AIT1.setText("jTextField1");

        AmountLabel.setText("Order Amount");

        AIT5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AIT5ActionPerformed(evt);
            }
        });

        Confirm.setText("Confirm");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });

        Stock.setText("Stock:");

        Promotion.setText("Promotion:");

        VP.setText("Vendor Price:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CostLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(WeightLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DescriptionLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AmountLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NewItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AIT5)
                                    .addComponent(AIT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 35, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Promotion, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                        .addGap(12, 12, 12))
                                    .addComponent(VP)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(QueryLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(Stock)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(AIT3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AIT1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AIT2, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(127, 127, 127)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(AIT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AIT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescriptionLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AIT3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WeightLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CostLabel)
                                    .addComponent(AIT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(AIT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AmountLabel)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(VP)
                                .addGap(18, 18, 18)
                                .addComponent(Promotion)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Stock)
                                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Confirm))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QueryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewItem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AIT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AIT3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AIT3ActionPerformed

    private void AIT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AIT4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AIT4ActionPerformed

    private void AIT5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AIT5ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_AIT5ActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        // TODO add your handling code here:
        String stringCost = AIT4.getText();
        String stringAmount = AIT5.getText();
        if(stringCost.equals("") || stringAmount.equals(""))
            return;
        double cost = Double.parseDouble(stringCost);
        int invAmount = Integer.parseInt(stringAmount);
        
        String stringMax = Amount.getText();
        int max = Integer.parseInt(stringMax);
        
        if(invAmount < 1){
            QueryLabel.setVisible((true));
            QueryLabel.setText("Amount cannot be zero or negative");
            return;
        } else if (invAmount > max){
            QueryLabel.setVisible((true));
            QueryLabel.setText("Amount cannot be greater than stock count");
            return;
        }
        else
            QueryLabel.setVisible(false);
        int ret = GroceryGUI.confirmPressed(AIT1.getText(), cost, invAmount);
        if(ret == 0)
            this.dispose();
        else
            NewItem.setText("It seems that you would like to add a new item");
    }//GEN-LAST:event_ConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(AddInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddInventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField AIT1;
    public javax.swing.JTextField AIT2;
    public javax.swing.JTextField AIT3;
    public javax.swing.JTextField AIT4;
    public javax.swing.JTextField AIT5;
    public javax.swing.JLabel Amount;
    private javax.swing.JLabel AmountLabel;
    public javax.swing.JButton Confirm;
    private javax.swing.JLabel CostLabel;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel NewItem;
    public javax.swing.JLabel Promotion;
    private javax.swing.JLabel QueryLabel;
    public javax.swing.JLabel Stock;
    public javax.swing.JLabel VP;
    private javax.swing.JLabel WeightLabel;
    // End of variables declaration//GEN-END:variables
}