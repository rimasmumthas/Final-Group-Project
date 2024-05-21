package gui;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
    }

    private void setFontBold(JToggleButton jToggleButton) {
        Font currentFont = jToggleButton.getFont();
        Font boldFont = currentFont.deriveFont(Font.BOLD);
        jToggleButton.setFont(boldFont);
    }

    private void setFontNormal(JToggleButton jToggleButton) {
        Font currentFont = jToggleButton.getFont();
        Font normalFont = currentFont.deriveFont(Font.PLAIN);
        jToggleButton.setFont(normalFont);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        MainPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.setPreferredSize(new java.awt.Dimension(275, 820));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/dashboard_image.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(21, 52, 72));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("D&T Shoe Store");
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(136, 28));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Wed 23 Jan, 2024 ");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("04: 51: 23 PM");

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/house.png"))); // NOI18N
        jToggleButton2.setText("Dashboard");
        jToggleButton2.setContentAreaFilled(false);
        jToggleButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton2.setIconTextGap(8);
        jToggleButton2.setPreferredSize(new java.awt.Dimension(119, 35));
        jToggleButton2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jToggleButton2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jToggleButton2FocusLost(evt);
            }
        });
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/office-man.png"))); // NOI18N
        jToggleButton3.setText("User Management");
        jToggleButton3.setContentAreaFilled(false);
        jToggleButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton3.setIconTextGap(8);
        jToggleButton3.setPreferredSize(new java.awt.Dimension(119, 35));
        jToggleButton3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jToggleButton3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jToggleButton3FocusLost(evt);
            }
        });
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/man.png"))); // NOI18N
        jToggleButton4.setText("Supplier Management");
        jToggleButton4.setContentAreaFilled(false);
        jToggleButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton4.setIconTextGap(8);
        jToggleButton4.setPreferredSize(new java.awt.Dimension(119, 35));
        jToggleButton4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jToggleButton4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jToggleButton4FocusLost(evt);
            }
        });

        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/customer-service (1).png"))); // NOI18N
        jToggleButton5.setText("Customer Management");
        jToggleButton5.setContentAreaFilled(false);
        jToggleButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton5.setIconTextGap(8);
        jToggleButton5.setPreferredSize(new java.awt.Dimension(119, 35));
        jToggleButton5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jToggleButton5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jToggleButton5FocusLost(evt);
            }
        });

        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/box (2).png"))); // NOI18N
        jToggleButton6.setText("Product Management");
        jToggleButton6.setContentAreaFilled(false);
        jToggleButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton6.setIconTextGap(8);
        jToggleButton6.setPreferredSize(new java.awt.Dimension(119, 35));
        jToggleButton6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jToggleButton6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jToggleButton6FocusLost(evt);
            }
        });

        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/in-stock.png"))); // NOI18N
        jToggleButton7.setText("Stock Management");
        jToggleButton7.setContentAreaFilled(false);
        jToggleButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton7.setIconTextGap(8);
        jToggleButton7.setPreferredSize(new java.awt.Dimension(119, 35));
        jToggleButton7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jToggleButton7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jToggleButton7FocusLost(evt);
            }
        });

        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exchange.png"))); // NOI18N
        jToggleButton8.setText("Return Management");
        jToggleButton8.setContentAreaFilled(false);
        jToggleButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton8.setIconTextGap(8);
        jToggleButton8.setPreferredSize(new java.awt.Dimension(119, 35));
        jToggleButton8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jToggleButton8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jToggleButton8FocusLost(evt);
            }
        });

        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tools.png"))); // NOI18N
        jToggleButton9.setText("Repair Management");
        jToggleButton9.setContentAreaFilled(false);
        jToggleButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton9.setIconTextGap(8);
        jToggleButton9.setPreferredSize(new java.awt.Dimension(119, 35));
        jToggleButton9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jToggleButton9FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jToggleButton9FocusLost(evt);
            }
        });

        jToggleButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/custom.png"))); // NOI18N
        jToggleButton10.setText("Custom Management");
        jToggleButton10.setContentAreaFilled(false);
        jToggleButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton10.setIconTextGap(8);
        jToggleButton10.setPreferredSize(new java.awt.Dimension(119, 35));
        jToggleButton10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jToggleButton10FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jToggleButton10FocusLost(evt);
            }
        });

        jToggleButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/money (2).png"))); // NOI18N
        jToggleButton11.setText("Drawer Balance");
        jToggleButton11.setContentAreaFilled(false);
        jToggleButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton11.setIconTextGap(8);
        jToggleButton11.setPreferredSize(new java.awt.Dimension(119, 35));
        jToggleButton11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jToggleButton11FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jToggleButton11FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        MainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton2FocusGained
        setFontBold(jToggleButton2);
    }//GEN-LAST:event_jToggleButton2FocusGained

    private void jToggleButton2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton2FocusLost
        setFontNormal(jToggleButton2);
    }//GEN-LAST:event_jToggleButton2FocusLost

    private void jToggleButton3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton3FocusGained
        setFontBold(jToggleButton3);
    }//GEN-LAST:event_jToggleButton3FocusGained

    private void jToggleButton3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton3FocusLost
        setFontNormal(jToggleButton3);
    }//GEN-LAST:event_jToggleButton3FocusLost

    private void jToggleButton4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton4FocusGained
        setFontBold(jToggleButton4);
    }//GEN-LAST:event_jToggleButton4FocusGained

    private void jToggleButton4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton4FocusLost
        setFontNormal(jToggleButton4);
    }//GEN-LAST:event_jToggleButton4FocusLost

    private void jToggleButton5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton5FocusGained
        setFontBold(jToggleButton5);
    }//GEN-LAST:event_jToggleButton5FocusGained

    private void jToggleButton5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton5FocusLost
        setFontNormal(jToggleButton5);
    }//GEN-LAST:event_jToggleButton5FocusLost

    private void jToggleButton6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton6FocusGained
        setFontBold(jToggleButton6);
    }//GEN-LAST:event_jToggleButton6FocusGained

    private void jToggleButton6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton6FocusLost
        setFontNormal(jToggleButton6);
    }//GEN-LAST:event_jToggleButton6FocusLost

    private void jToggleButton7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton7FocusGained
        setFontBold(jToggleButton7);
    }//GEN-LAST:event_jToggleButton7FocusGained

    private void jToggleButton7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton7FocusLost
        setFontNormal(jToggleButton7);
    }//GEN-LAST:event_jToggleButton7FocusLost

    private void jToggleButton8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton8FocusGained
        setFontBold(jToggleButton8);
    }//GEN-LAST:event_jToggleButton8FocusGained

    private void jToggleButton8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton8FocusLost
        setFontNormal(jToggleButton8);
    }//GEN-LAST:event_jToggleButton8FocusLost

    private void jToggleButton9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton9FocusGained
        setFontBold(jToggleButton9);
    }//GEN-LAST:event_jToggleButton9FocusGained

    private void jToggleButton9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton9FocusLost
        setFontNormal(jToggleButton9);
    }//GEN-LAST:event_jToggleButton9FocusLost

    private void jToggleButton10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton10FocusGained
        setFontBold(jToggleButton10);
    }//GEN-LAST:event_jToggleButton10FocusGained

    private void jToggleButton10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton10FocusLost
        setFontNormal(jToggleButton10);
    }//GEN-LAST:event_jToggleButton10FocusLost

    private void jToggleButton11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton11FocusGained
        setFontBold(jToggleButton11);
    }//GEN-LAST:event_jToggleButton11FocusGained

    private void jToggleButton11FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton11FocusLost
        setFontNormal(jToggleButton11);
    }//GEN-LAST:event_jToggleButton11FocusLost

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        MainPanel.removeAll();
        DashboardPanel dp = new DashboardPanel();
        MainPanel.add(dp, BorderLayout.CENTER);
        SwingUtilities.updateComponentTreeUI(jPanel3);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        MainPanel.removeAll();
        UserManagementPanel ump = new UserManagementPanel();
        MainPanel.add(ump, BorderLayout.CENTER);
        SwingUtilities.updateComponentTreeUI(jPanel3);
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    public static void main(String args[]) {

        FlatLightLaf.registerCustomDefaultsSource("style");
        FlatLightLaf.setup();
        UIManager.put("TextComponent.arc", 10);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables
}
