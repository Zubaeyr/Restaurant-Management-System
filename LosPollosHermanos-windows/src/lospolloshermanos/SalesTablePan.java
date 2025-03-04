/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lospolloshermanos;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JLabel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jfree.chart.demo.BarChartDemo1;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author zubaeyr
 */
public class SalesTablePan extends javax.swing.JPanel {

    /**
     * Creates new form SalesTablePan
     */
    Statement stmt,stmt1;
    SalesReports salesrep;
    ResultSet items;
    ResultSet categories,tot;
    int no_of_items=0,no_of_cats=0;
    String GrandTot="0.00";
    String Date1,Date2;
    public SalesTablePan(Statement stmt,Statement stmt1,SalesReports salesrep) {
        initComponents();
        this.salesrep=salesrep;
        this.stmt=stmt;
        this.stmt1=stmt1;
    
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setOpaque(false);

        jPanel1.setOpaque(false);

        jLabel2.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.caretForeground"));
        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(241, 234, 234));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Category Name");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setMaximumSize(new java.awt.Dimension(50, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(50, 20));
        jLabel2.setOpaque(true);

        jLabel3.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.caretForeground"));
        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(241, 234, 234));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("No. of Items Sold");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.setMaximumSize(new java.awt.Dimension(50, 20));
        jLabel3.setMinimumSize(new java.awt.Dimension(50, 20));
        jLabel3.setOpaque(true);

        jLabel4.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.caretForeground"));
        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(241, 234, 234));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Subtotal");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel4.setMaximumSize(new java.awt.Dimension(50, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(50, 20));
        jLabel4.setOpaque(true);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel3.setBackground(new java.awt.Color(13, 13, 13));
        jPanel3.setBorder(null);
        jPanel3.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(30, 30, 30));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));

        jLabel5.setBackground(new java.awt.Color(30, 30, 30));
        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(241, 234, 234));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Grand Total  $  0.000");
        jLabel5.setBorder(null);
        jLabel5.setMaximumSize(new java.awt.Dimension(50, 20));
        jLabel5.setMinimumSize(new java.awt.Dimension(50, 20));

        jLabel6.setBackground(new java.awt.Color(97, 97, 97));
        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(250, 243, 243));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("View Categorywise");
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(97, 97, 97));
        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(250, 243, 243));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("View Itemwise");
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(97, 97, 97));
        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(250, 243, 243));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Close");
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(97, 97, 97));
        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(250, 243, 243));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Print Sales");
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 236, 236));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("From  :");

        jLabel12.setFont(new java.awt.Font("DejaVu Sans", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(236, 236, 236));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("To   :");

        jLabel13.setFont(new java.awt.Font("DejaVu Sans", 1, 9)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(236, 236, 236));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("(DD-MM-YYYY)");

        jLabel11.setFont(new java.awt.Font("DejaVu Sans", 1, 9)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(236, 236, 236));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("(DD-MM-YYYY)");

        jLabel14.setBackground(new java.awt.Color(97, 97, 97));
        jLabel14.setFont(new java.awt.Font("Ubuntu", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(250, 243, 243));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Category Sales Graph");
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(97, 97, 97));
        jLabel16.setFont(new java.awt.Font("Ubuntu", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(250, 243, 243));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Top 5 Items Sales Graph");
        jLabel16.setOpaque(true);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        RefreshTable(2);
        jPanel3.revalidate();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        jLabel6.setBackground(new java.awt.Color(235, 228, 228));
        jLabel6.setForeground(new java.awt.Color(13, 9, 9));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
      jLabel6.setBackground(new java.awt.Color(97,97,97));

jLabel6.setForeground(new java.awt.Color(250, 243, 243));

    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        RefreshTable(1);
        jPanel3.revalidate();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
        jLabel7.setBackground(new java.awt.Color(235, 228, 228));
        jLabel7.setForeground(new java.awt.Color(13, 9, 9));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
         jLabel7.setBackground(new java.awt.Color(97,97,97));

jLabel7.setForeground(new java.awt.Color(250, 243, 243));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
       this.show(false);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
        jLabel9.setBackground(new java.awt.Color(235, 228, 228));
        jLabel9.setForeground(new java.awt.Color(13, 9, 9));
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
       jLabel9.setBackground(new java.awt.Color(97,97,97));

jLabel9.setForeground(new java.awt.Color(250, 243, 243));

    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        PrintSales();
       
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // TODO add your handling code here:
         jLabel10.setBackground(new java.awt.Color(235, 228, 228));
        jLabel10.setForeground(new java.awt.Color(13, 9, 9));
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        // TODO add your handling code here:
           jLabel10.setBackground(new java.awt.Color(97,97,97));
        jLabel10.setForeground(new java.awt.Color(250, 243, 243));
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        BarChart demo = new BarChart("Categories",no_of_cats,categories);
      JFrame f=new JFrame();
      
        f.setLayout(new GridLayout(1,1));
        f.add(demo);
        f.setUndecorated(true);
        f.pack();
        f.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        RefineryUtilities.centerFrameOnScreen(f);
        f.setVisible(true);  
        
    
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        // TODO add your handling code here:
        jLabel14.setBackground(new java.awt.Color(235, 228, 228));
        jLabel14.setForeground(new java.awt.Color(13, 9, 9));
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        // TODO add your handling code here:
         jLabel14.setBackground(new java.awt.Color(97,97,97));
        jLabel14.setForeground(new java.awt.Color(250, 243, 243));
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        JFrame f=new JFrame();
              BarChart demo1 = new BarChart("Items",no_of_items,items);
        f.setLayout(new GridLayout(1,1));
        f.add(demo1);
        f.setUndecorated(true);
        f.pack();
        f.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        RefineryUtilities.centerFrameOnScreen(f);
        f.setVisible(true);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        // TODO add your handling code here:
         jLabel16.setBackground(new java.awt.Color(235, 228, 228));
        jLabel16.setForeground(new java.awt.Color(13, 9, 9));
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        // TODO add your handling code here:
        jLabel16.setBackground(new java.awt.Color(97,97,97));
        jLabel16.setForeground(new java.awt.Color(250, 243, 243));
    }//GEN-LAST:event_jLabel16MouseExited
    
    JLabel j=new JLabel("");
    
    public void Update(String Date1, String Date2){
        this.Date1=Date1;
        this.Date2=Date2;
        salesrep.jPanel2.add(this);
        salesrep.jPanel2.revalidate();
        jLabel13.setText(Date1);
        jLabel11.setText(Date2);
        this.show();
        String GrandTotal="select sum(SubTot) as GrandTot from MealCategory left join (select MealCategory.CName,sum(Quantity) as QtyTot,sum(SubTotal) as SubTot from Orders,OrderDetails,Meals,MealCategory where Orders.OrderNo=OrderDetails.OrderNo and Meals.CName=MealCategory.CName and Meals.MName=OrderDetails.MName and Orders.ODate between '"+Date1+"' and '"+Date2+"' group by MealCategory.CName) As Temp on MealCategory.CName=Temp.CName;";
        String sqlitems="select Meals.MName,Meals.CName, Temp1.QtyTot, Temp1.SubTot from Meals left join (select Meals.MName,sum(Quantity) as QtyTot,sum(SubTotal) as SubTot from Orders,OrderDetails,Meals,MealCategory where Orders.OrderNo=OrderDetails.OrderNo and Meals.CName=MealCategory.CName and Meals.MName=OrderDetails.MName and Orders.ODate between '"+Date1+"' and '"+Date2+"' group by OrderDetails.MName) As Temp1 on Temp1.MName=Meals.MName Order by Temp1.QtyTot;";
        String sqlcat="select MealCategory.CName, Temp.QtyTot, Temp.SubTot from MealCategory left join (select MealCategory.CName,sum(Quantity) as QtyTot,sum(SubTotal) as SubTot from Orders,OrderDetails,Meals,MealCategory where Orders.OrderNo=OrderDetails.OrderNo and Meals.CName=MealCategory.CName and Meals.MName=OrderDetails.MName and Orders.ODate between '"+Date1+"' and '"+Date2+"' group by MealCategory.CName) As Temp on MealCategory.CName=Temp.CName order by  Temp.QtyTot;";
        
        try{
            tot=stmt.executeQuery(GrandTotal);
            tot.next();
            GrandTot=String.valueOf(tot.getFloat("GrandTot"));
            if(GrandTot!=null){
                jLabel5.setText("Grand Total : $ "+GrandTot);
            }

            items=stmt.executeQuery(sqlitems);
            categories=stmt1.executeQuery(sqlcat);
            items.last();
            categories.last();
            no_of_items=items.getRow();
            no_of_cats=categories.getRow();
            items.first();
            categories.first();
            
            RefreshTable(1);
            
        }catch(Exception e){
            e.printStackTrace();
        } 
        jPanel3.revalidate();
    }
    public void RefreshTable(int i){
        if(items!=null && categories!=null){
            if(i==1){
               jPanel3.removeAll();
               if(no_of_items<18){
                   jPanel3.setLayout(new GridLayout(18,1));
               }
               else{
                   jPanel3.setLayout(new GridLayout(no_of_items,1));
               }

               for(i=0;i<no_of_items;i++){
                    try {
                        jPanel3.add(new SalesLabel(items.getString("MName"),items.getString("QtyTot"),items.getFloat("SubTot")));
                        items.next();
                    } catch (SQLException ex) {
                        Logger.getLogger(SalesTablePan.class.getName()).log(Level.SEVERE, null, ex);
                    }
               }
               jLabel2.setText("Meal Name");
               jLabel3.setText("Quantity");
               jLabel4.setText("Sub Total");
               
            }
            else if(i==2){
              jPanel3.removeAll();
               if(no_of_cats<18){
                   jPanel3.setLayout(new GridLayout(18,1));
               }
               else{
                   jPanel3.setLayout(new GridLayout(no_of_cats,1));
               }

               for(i=0;i<no_of_cats;i++){
                    try {
                        jPanel3.add(new SalesLabel(categories.getString("CName"),categories.getString("QtyTot"),categories.getFloat("SubTot")));
                        categories.next();
                    } catch (SQLException ex) {
                        Logger.getLogger(SalesTablePan.class.getName()).log(Level.SEVERE, null, ex);
                    }
               }

               jLabel2.setText("Category Name");
               jLabel3.setText("No Of Items sold");
               jLabel4.setText("Sub Total");
                
            }
            try{
                items.first();
                categories.first();
            }catch(Exception e){
            }
            jPanel3.revalidate();
            jPanel3.repaint();
        }
    }
    public void PrintSales(){
        
        if(items!=null && categories!=null){
               XSSFWorkbook workbook = new XSSFWorkbook();
      //Create a blank sheet
      XSSFSheet itemssheet = workbook.createSheet( "Item-wise");
      XSSFSheet categorysheet = workbook.createSheet( "Cateogry-wise");
      XSSFRow row;
      XSSFFont font = workbook.createFont();
      font.setBold(true);
      XSSFCellStyle style = workbook.createCellStyle();
      style.setFont(font);
      style.setAlignment(HorizontalAlignment.CENTER);
      Cell cell; 
                row=itemssheet.createRow(0);
                cell=row.createCell(0);
                cell.setCellStyle(style);
                cell.setCellValue("Meal Name");
                cell=row.createCell(1);
                cell.setCellStyle(style);
                cell.setCellValue("Quantity");
                cell=row.createCell(2);
                cell.setCellStyle(style);
                cell.setCellValue("Sub Total");
                font.setBold(false);
                style.setFont(font);
                style.setAlignment(HorizontalAlignment.CENTER);
               for(int i=2;i<=no_of_items+1;i++){
                    try {
                        row = itemssheet.createRow(i);
                       String QtyTot=items.getString("QtyTot");
                       String SubTot=items.getString("SubTot");           
                        cell = row.createCell(0);
                        cell.setCellValue(items.getString("MName"));
                        cell=row.createCell(1);
                        if(QtyTot!=null)
                            cell.setCellValue(QtyTot);
                        else cell.setCellValue("0");
                        cell=row.createCell(2);
                        if(SubTot!=null)
                            cell.setCellValue(SubTot);
                        else    
                            cell.setCellValue("0.00");
                        items.next();
                    } catch (SQLException ex) {
                        Logger.getLogger(SalesTablePan.class.getName()).log(Level.SEVERE, null, ex);
                    }
               }
               row=itemssheet.createRow(no_of_items+3);
                font.setBold(true);
                style.setFont(font);    
                style.setAlignment(HorizontalAlignment.CENTER);
                cell=row.createCell(1);
                cell.setCellStyle(style);
                cell.setCellValue("Grand Total");
                cell=row.createCell(2);
                cell.setCellStyle(style);
                cell.setCellValue(GrandTot+"");
               
               
                row=categorysheet.createRow(0);
                cell=row.createCell(0);
                cell.setCellStyle(style);
                cell.setCellValue("Category Name");
                cell=row.createCell(1);
                cell.setCellStyle(style);
                cell.setCellValue("No of items sold");
                cell=row.createCell(2);
                cell.setCellStyle(style);
                cell.setCellValue("Sub Total");
                font.setBold(false);
               for(int i=2;i<=no_of_cats+1;i++){
                    try {
                        row = categorysheet.createRow(i);
                        
                        cell = row.createCell(0);
                        cell.setCellValue(categories.getString("CName"));
                        cell=row.createCell(1);
                        String QtyTot=categories.getString("QtyTot");
                        String SubTot=categories.getString("SubTot"); 
                        if(QtyTot!=null)
                            cell.setCellValue(QtyTot);
                        else cell.setCellValue("0");
                        cell=row.createCell(2);
                        if(SubTot!=null)
                            cell.setCellValue(SubTot);
                        else    
                            cell.setCellValue("0.00");
                        categories.next();
                    } catch (SQLException ex) {
                        Logger.getLogger(SalesTablePan.class.getName()).log(Level.SEVERE, null, ex);
                    }
               }
               row=categorysheet.createRow(no_of_cats+3);
               font.setBold(true);
               cell=row.createCell(0);
               cell=row.createCell(1);
               cell.setCellStyle(style);
               cell.setCellValue("Grand Total");
               cell=row.createCell(2);
               cell.setCellStyle(style);
               cell.setCellValue(GrandTot+"");
               font.setBold(false);
               
               
      itemssheet.autoSizeColumn(0);
      itemssheet.autoSizeColumn(1);
      itemssheet.autoSizeColumn(2);
      categorysheet.autoSizeColumn(0);
      categorysheet.autoSizeColumn(1);
      categorysheet.autoSizeColumn(2);
            try{
                items.first();
                categories.first();
                FileOutputStream out = new FileOutputStream(new File("C:/Program Files/RMS/Sales_from_"+Date1+"_to_"+Date2+".xlsx"));
                workbook.write(out);
                out.close();
            }catch(Exception e){}
        }
    }
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
