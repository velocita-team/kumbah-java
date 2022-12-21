/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.admin;

import controller.LoginController;
import java.awt.CardLayout;
import model.Karyawan;

/**
 *
 * @author ariqn
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    CardLayout cardLayout;
    private Karyawan currentKaryawan;

    public Index() {
        currentKaryawan = new Karyawan(0, "Unknown", "Unknown", "");
        initComponents();
        cardLayout = (CardLayout) mainContent.getLayout();
        this.setLocationRelativeTo(null);
        this.setTitle("Kumbah");
    }

    public Index(Karyawan currentKaryawan) {
        this.currentKaryawan = currentKaryawan;
        initComponents();
        cardLayout = (CardLayout) mainContent.getLayout();
        this.setLocationRelativeTo(null);
        this.setTitle("Kumbah");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        sidebar = new javax.swing.JPanel();
        addOrderBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        serviceBtn = new javax.swing.JButton();
        editOrderBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        mainContent = new javax.swing.JPanel();
        addOrderPnl = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameForm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        weightForm = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        serviceForm = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        editOrderPnl = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        servicePnl = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidebar.setBackground(new java.awt.Color(103, 98, 211));
        sidebar.setPreferredSize(new java.awt.Dimension(150, 540));

        addOrderBtn.setBackground(new java.awt.Color(103, 98, 211));
        addOrderBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        addOrderBtn.setForeground(new java.awt.Color(255, 255, 255));
        addOrderBtn.setText("Add Order");
        addOrderBtn.setBorder(null);
        addOrderBtn.setBorderPainted(false);
        addOrderBtn.setContentAreaFilled(false);
        addOrderBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addOrderBtn.setPreferredSize(new java.awt.Dimension(73, 40));
        addOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KUMBAH");

        serviceBtn.setBackground(new java.awt.Color(178, 173, 245));
        serviceBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        serviceBtn.setForeground(new java.awt.Color(255, 255, 255));
        serviceBtn.setText("Service");
        serviceBtn.setBorder(null);
        serviceBtn.setContentAreaFilled(false);
        serviceBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serviceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceBtnActionPerformed(evt);
            }
        });

        editOrderBtn.setBackground(new java.awt.Color(178, 173, 245));
        editOrderBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        editOrderBtn.setForeground(new java.awt.Color(255, 255, 255));
        editOrderBtn.setText("Orders");
        editOrderBtn.setBorder(null);
        editOrderBtn.setBorderPainted(false);
        editOrderBtn.setContentAreaFilled(false);
        editOrderBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editOrderBtn.setPreferredSize(new java.awt.Dimension(71, 40));
        editOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editOrderBtnActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(255, 255, 255));
        logoutBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(103, 98, 211));
        logoutBtn.setText("Logout");
        logoutBtn.setBorder(null);
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(addOrderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(editOrderBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(serviceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(serviceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jSplitPane1.setLeftComponent(sidebar);

        mainContent.setBackground(new java.awt.Color(249, 249, 249));
        mainContent.setLayout(new java.awt.CardLayout());

        addOrderPnl.setBackground(new java.awt.Color(249, 249, 249));

        jPanel1.setBackground(new java.awt.Color(249, 249, 249));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(103, 98, 211));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Order");
        jPanel1.add(jLabel2, java.awt.BorderLayout.CENTER);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setLabelFor(nameForm);
        jLabel5.setText("Name");

        nameForm.setBackground(new java.awt.Color(248, 250, 252));
        nameForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameForm.setForeground(new java.awt.Color(0, 0, 0));
        nameForm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setLabelFor(serviceForm);
        jLabel6.setText("Service");

        weightForm.setBackground(new java.awt.Color(248, 250, 252));
        weightForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        weightForm.setForeground(new java.awt.Color(0, 0, 0));
        weightForm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setLabelFor(weightForm);
        jLabel7.setText("Laundry Weight");

        serviceForm.setBackground(new java.awt.Color(248, 250, 252));
        serviceForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        serviceForm.setForeground(new java.awt.Color(0, 0, 0));
        serviceForm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setBackground(new java.awt.Color(137, 128, 245));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");

        javax.swing.GroupLayout addOrderPnlLayout = new javax.swing.GroupLayout(addOrderPnl);
        addOrderPnl.setLayout(addOrderPnlLayout);
        addOrderPnlLayout.setHorizontalGroup(
            addOrderPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
            .addGroup(addOrderPnlLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(addOrderPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addOrderPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(nameForm, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(weightForm, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(serviceForm, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addOrderPnlLayout.setVerticalGroup(
            addOrderPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addOrderPnlLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameForm, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weightForm, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serviceForm, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 104, Short.MAX_VALUE))
        );

        mainContent.add(addOrderPnl, "addOrderPnl");

        editOrderPnl.setBackground(new java.awt.Color(249, 249, 249));

        jPanel2.setBackground(new java.awt.Color(249, 249, 249));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(103, 98, 211));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Edit Order");
        jPanel2.add(jLabel3, java.awt.BorderLayout.CENTER);

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Transaction Date", "Finished Date", "Customer", "Employee", "Total Price", "Quantity", "Service"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(248, 250, 252));
        jTable1.setSelectionBackground(new java.awt.Color(226, 232, 240));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Transaction Date");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Finished Date");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Customer");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Employee");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Total Price");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Quantity");
            jTable1.getColumnModel().getColumn(6).setHeaderValue("Service");
        }

        javax.swing.GroupLayout editOrderPnlLayout = new javax.swing.GroupLayout(editOrderPnl);
        editOrderPnl.setLayout(editOrderPnlLayout);
        editOrderPnlLayout.setHorizontalGroup(
            editOrderPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
            .addGroup(editOrderPnlLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editOrderPnlLayout.setVerticalGroup(
            editOrderPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editOrderPnlLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );

        mainContent.add(editOrderPnl, "editOrderPnl");

        servicePnl.setBackground(new java.awt.Color(249, 249, 249));

        jPanel3.setBackground(new java.awt.Color(249, 249, 249));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(103, 98, 211));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Service");
        jPanel3.add(jLabel4, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout servicePnlLayout = new javax.swing.GroupLayout(servicePnl);
        servicePnl.setLayout(servicePnlLayout);
        servicePnlLayout.setHorizontalGroup(
            servicePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        servicePnlLayout.setVerticalGroup(
            servicePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicePnlLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 440, Short.MAX_VALUE))
        );

        mainContent.add(servicePnl, "servicePnl");

        jSplitPane1.setRightComponent(mainContent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderBtnActionPerformed
        cardLayout.show(mainContent, "addOrderPnl");
    }//GEN-LAST:event_addOrderBtnActionPerformed

    private void serviceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceBtnActionPerformed
        cardLayout.show(mainContent, "servicePnl");
    }//GEN-LAST:event_serviceBtnActionPerformed

    private void editOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editOrderBtnActionPerformed
        cardLayout.show(mainContent, "editOrderPnl");
    }//GEN-LAST:event_editOrderBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        LoginController.logout(this, currentKaryawan);
    }//GEN-LAST:event_logoutBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrderBtn;
    private javax.swing.JPanel addOrderPnl;
    private javax.swing.JButton editOrderBtn;
    private javax.swing.JPanel editOrderPnl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel mainContent;
    private javax.swing.JTextField nameForm;
    private javax.swing.JButton serviceBtn;
    private javax.swing.JComboBox<String> serviceForm;
    private javax.swing.JPanel servicePnl;
    private javax.swing.JPanel sidebar;
    private javax.swing.JTextField weightForm;
    // End of variables declaration//GEN-END:variables
}
