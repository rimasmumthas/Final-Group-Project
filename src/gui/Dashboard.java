package gui;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();

        MainPanel.removeAll();
        DashboardPanel dp = new DashboardPanel();
        MainPanel.add(dp, BorderLayout.CENTER);
        SwingUtilities.updateComponentTreeUI(jPanel3);
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

    private void changePanel(JPanel panel) {
        MainPanel.removeAll();
        MainPanel.add(panel, BorderLayout.CENTER);
        SwingUtilities.updateComponentTreeUI(jPanel3);
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
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton13 = new javax.swing.JToggleButton();
        MainPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("D&T Inventory Control System");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(204, 204, 204)));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 820));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/dashboard_image.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(27, 49, 77));
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
        jToggleButton2.setToolTipText("Dashboard");
        jToggleButton2.setContentAreaFilled(false);
        jToggleButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton2.setIconTextGap(15);
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
        jToggleButton3.setToolTipText("User Management");
        jToggleButton3.setContentAreaFilled(false);
        jToggleButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton3.setIconTextGap(15);
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
        jToggleButton4.setToolTipText("Supplier Management");
        jToggleButton4.setContentAreaFilled(false);
        jToggleButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton4.setIconTextGap(15);
        jToggleButton4.setPreferredSize(new java.awt.Dimension(119, 35));
        jToggleButton4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jToggleButton4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jToggleButton4FocusLost(evt);
            }
        });
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/customer-service (1).png"))); // NOI18N
        jToggleButton5.setText("Customer Management");
        jToggleButton5.setToolTipText("Customer Management");
        jToggleButton5.setContentAreaFilled(false);
        jToggleButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton5.setIconTextGap(15);
        jToggleButton5.setPreferredSize(new java.awt.Dimension(119, 35));
        jToggleButton5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jToggleButton5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jToggleButton5FocusLost(evt);
            }
        });
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/box (2).png"))); // NOI18N
        jToggleButton6.setText("Product Management");
        jToggleButton6.setToolTipText("Product Management");
        jToggleButton6.setContentAreaFilled(false);
        jToggleButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton6.setIconTextGap(15);
        jToggleButton6.setPreferredSize(new java.awt.Dimension(119, 35));
        jToggleButton6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jToggleButton6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jToggleButton6FocusLost(evt);
            }
        });
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/in-stock.png"))); // NOI18N
        jToggleButton7.setText("Stock Management");
        jToggleButton7.setToolTipText("Stock Management");
        jToggleButton7.setContentAreaFilled(false);
        jToggleButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton7.setIconTextGap(15);
        jToggleButton7.setPreferredSize(new java.awt.Dimension(119, 35));
        jToggleButton7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jToggleButton7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jToggleButton7FocusLost(evt);
            }
        });
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exchange.png"))); // NOI18N
        jToggleButton8.setText("Return Management");
        jToggleButton8.setToolTipText("Return Management");
        jToggleButton8.setContentAreaFilled(false);
        jToggleButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton8.setIconTextGap(15);
        jToggleButton8.setPreferredSize(new java.awt.Dimension(119, 35));
        jToggleButton8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jToggleButton8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jToggleButton8FocusLost(evt);
            }
        });
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tools.png"))); // NOI18N
        jToggleButton9.setText("Repair Management");
        jToggleButton9.setToolTipText("Repair Management");
        jToggleButton9.setContentAreaFilled(false);
        jToggleButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton9.setIconTextGap(15);
        jToggleButton9.setPreferredSize(new java.awt.Dimension(119, 35));
        jToggleButton9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jToggleButton9FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jToggleButton9FocusLost(evt);
            }
        });
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        jToggleButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/custom.png"))); // NOI18N
        jToggleButton10.setText("Custom Management");
        jToggleButton10.setToolTipText("Custom Management");
        jToggleButton10.setContentAreaFilled(false);
        jToggleButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton10.setIconTextGap(15);
        jToggleButton10.setPreferredSize(new java.awt.Dimension(119, 35));
        jToggleButton10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jToggleButton10FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jToggleButton10FocusLost(evt);
            }
        });
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });

        jToggleButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/money (2).png"))); // NOI18N
        jToggleButton11.setText("Drawer Management");
        jToggleButton11.setToolTipText("Drawer Balance");
        jToggleButton11.setContentAreaFilled(false);
        jToggleButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton11.setIconTextGap(15);
        jToggleButton11.setPreferredSize(new java.awt.Dimension(119, 35));
        jToggleButton11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jToggleButton11FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jToggleButton11FocusLost(evt);
            }
        });
        jToggleButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton11ActionPerformed(evt);
            }
        });

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/menu.png"))); // NOI18N
        jToggleButton1.setToolTipText("Menu");
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bill (4).png"))); // NOI18N
        jToggleButton12.setText("Invoice Management");
        jToggleButton12.setToolTipText("Drawer Balance");
        jToggleButton12.setContentAreaFilled(false);
        jToggleButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton12.setIconTextGap(15);
        jToggleButton12.setPreferredSize(new java.awt.Dimension(119, 35));
        jToggleButton12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jToggleButton12FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jToggleButton12FocusLost(evt);
            }
        });
        jToggleButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton12ActionPerformed(evt);
            }
        });

        jToggleButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/notes.png"))); // NOI18N
        jToggleButton13.setText("GRN Management");
        jToggleButton13.setToolTipText("Drawer Balance");
        jToggleButton13.setContentAreaFilled(false);
        jToggleButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton13.setIconTextGap(15);
        jToggleButton13.setPreferredSize(new java.awt.Dimension(119, 35));
        jToggleButton13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jToggleButton13FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jToggleButton13FocusLost(evt);
            }
        });
        jToggleButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton13ActionPerformed(evt);
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
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jToggleButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                    .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
        changePanel(new DashboardPanel());
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        changePanel(new UserManagementPanel());
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        if (jToggleButton1.isSelected()) {

            Thread t = new Thread(
                    () -> {
                        for (int i = jPanel2.getWidth(); i >= 47; i -= 47) {
                            jPanel2.setPreferredSize(new Dimension(i, jPanel2.getHeight()));
                            SwingUtilities.updateComponentTreeUI(jPanel2);
                            try {
                                Thread.sleep(10);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        jLabel2.setVisible(false);
                        jLabel1.setVisible(false);
                        jLabel3.setVisible(false);
                        jLabel4.setVisible(false);
                    }
            );
            t.start();

        } else {

            Thread t = new Thread(
                    () -> {
                        for (int i = 50; i <= 300; i += 50) {
                            jPanel2.setPreferredSize(new Dimension(i, jPanel2.getHeight()));
                            SwingUtilities.updateComponentTreeUI(jPanel2);
                            try {
                                Thread.sleep(10);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        jLabel2.setVisible(true);
                        jLabel1.setVisible(true);
                        jLabel3.setVisible(true);
                        jLabel4.setVisible(true);
                    }
            );
            t.start();
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton12FocusGained
        setFontBold(jToggleButton12);
    }//GEN-LAST:event_jToggleButton12FocusGained

    private void jToggleButton12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton12FocusLost
        setFontNormal(jToggleButton12);
    }//GEN-LAST:event_jToggleButton12FocusLost

    private void jToggleButton13FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton13FocusGained
        setFontBold(jToggleButton13);
    }//GEN-LAST:event_jToggleButton13FocusGained

    private void jToggleButton13FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jToggleButton13FocusLost
        setFontNormal(jToggleButton13);
    }//GEN-LAST:event_jToggleButton13FocusLost

    private void jToggleButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton13ActionPerformed
        changePanel(new GrnManagement());
    }//GEN-LAST:event_jToggleButton13ActionPerformed

    private void jToggleButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton11ActionPerformed
        changePanel(new DrawerManagement());
    }//GEN-LAST:event_jToggleButton11ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        changePanel(new SupplierManagement());
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        changePanel(new CustomerManagement());
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        changePanel(new ProductManagement());
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        changePanel(new StockManagement());
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        changePanel(new ReturnManagement());
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        changePanel(new RepairManagement());
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
        changePanel(new CustomManagement());
    }//GEN-LAST:event_jToggleButton10ActionPerformed

    private void jToggleButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton12ActionPerformed
        changePanel(new InvoiceManagement());
    }//GEN-LAST:event_jToggleButton12ActionPerformed

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
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton13;
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
