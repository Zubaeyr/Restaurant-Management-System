/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OrderAndReservation;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author zubaeyr
 */
public class ShowMealDetails extends javax.swing.JPanel {
    OrderingSystem orderingpan;
    String ItemName,sql,ImageName;
    Statement statement;
    ResultSet result;
    int items;
    JPanel DisplayPanel;
    EmptyView empty;
    CartPanel cart;
    String categories[];
    String Price;
    /**
     * Creates new form ShowDetails
     */
    

    public ShowMealDetails(String ItemName, Statement statement, JPanel DisplayPanel, EmptyView empty,CartPanel cart) {
        this.cart=cart;
        this.ItemName=ItemName;
        this.DisplayPanel=DisplayPanel;
        this.empty=empty;
        this.statement=statement;
        initComponents(); 
        sql="Select * from Meals where MName='"+ItemName+"';";
        try {
            result=statement.executeQuery(sql);
            result.next();
            ImageName=result.getString("MImage");
            if(!ImageName.equals("Empty.png")){
                            try{
                                String u=new String("/home/zubaeyr/Pictures/images/Meals/"+ImageName);
            ImageIcon icon=new ImageIcon(new ImageIcon(u).getImage().getScaledInstance(165, 180, Image.SCALE_SMOOTH));
            ImageLabel.setIcon(icon);                
            }catch(Exception e){}
            }
            else{
             ImageIcon icon=new ImageIcon(new ImageIcon(getClass().getResource("/orderingpanel/Empty.png")).getImage().getScaledInstance(165, 180, Image.SCALE_SMOOTH));
             ImageLabel.setIcon(icon);
            }

            NameLabel.setText(ItemName);
            PriceLabel.setText("Price : $"+result.getFloat("Price"));
            CategoryNameLabel.setText("Category : "+ result.getString("CName"));
            DescriptionLabel.setText(result.getString("Description"));
            this.Price=result.getString("Price");
            
        } catch (SQLException ex) {
            System.out.println("Breakpoint-1: Show Meal Details");
        }
       this.revalidate();
        this.show(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ImageLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        CloseButton = new javax.swing.JLabel();
        PriceLabel = new javax.swing.JLabel();
        CategoryNameLabel = new javax.swing.JLabel();
        DescriptionLabel = new javax.swing.JLabel();
        QuantityLabel = new javax.swing.JLabel();
        QuantityField = new javax.swing.JTextField();
        AddToCartButton = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setText("Delete Category");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 247, 247), 2, true));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setText("Delete Category");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 247, 247), 2, true));

        setBackground(new java.awt.Color(44, 44, 44));

        ImageLabel.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        ImageLabel.setForeground(new java.awt.Color(253, 251, 251));
        ImageLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(253, 248, 248), 1, true));
        ImageLabel.setDisabledIcon(new javax.swing.ImageIcon("/home/zubaeyr/Desktop/LosPollosHermanos/src/lospolloshermanos/Empty.png")); // NOI18N

        NameLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(250, 243, 243));
        NameLabel.setText("XXXXXXXXXXX");

        CloseButton.setBackground(new java.awt.Color(119, 119, 119));
        CloseButton.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        CloseButton.setForeground(new java.awt.Color(246, 238, 238));
        CloseButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CloseButton.setText("Close");
        CloseButton.setBorder(null);
        CloseButton.setOpaque(true);
        CloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseButtonMouseExited(evt);
            }
        });

        PriceLabel.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        PriceLabel.setForeground(new java.awt.Color(250, 243, 243));
        PriceLabel.setText("Price : $XX");

        CategoryNameLabel.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        CategoryNameLabel.setForeground(new java.awt.Color(250, 243, 243));
        CategoryNameLabel.setText("Category : XXXXXXXXX");

        DescriptionLabel.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        DescriptionLabel.setForeground(new java.awt.Color(250, 243, 243));
        DescriptionLabel.setText("Spicy and Tasty!!");

        QuantityLabel.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        QuantityLabel.setForeground(new java.awt.Color(244, 240, 240));
        QuantityLabel.setText("Quantity");

        QuantityField.setBackground(new java.awt.Color(201, 201, 201));
        QuantityField.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        QuantityField.setForeground(new java.awt.Color(1, 1, 1));
        QuantityField.setBorder(null);
        QuantityField.setCaretColor(new java.awt.Color(16, 2, 2));

        AddToCartButton.setBackground(new java.awt.Color(119, 119, 119));
        AddToCartButton.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        AddToCartButton.setForeground(new java.awt.Color(246, 238, 238));
        AddToCartButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddToCartButton.setText("Add To Cart");
        AddToCartButton.setBorder(null);
        AddToCartButton.setOpaque(true);
        AddToCartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(DescriptionLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CategoryNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(QuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(QuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AddToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CategoryNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(DescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddToCartButton, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(90, 90, 90)
                .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CloseButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseEntered
        // TODO add your handling code here:
          CloseButton.setBackground(new java.awt.Color(235, 228, 228));
          CloseButton.setForeground(new java.awt.Color(13, 9, 9));
    }//GEN-LAST:event_CloseButtonMouseEntered

    private void CloseButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseExited
        // TODO add your handling code here:
         CloseButton.setBackground(new java.awt.Color(117, 117, 117));
        CloseButton.setForeground(new java.awt.Color(248, 244, 244));
    }//GEN-LAST:event_CloseButtonMouseExited

    private void CloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseClicked
        // TODO add your handling code here:
          DisplayPanel.removeAll();
          DisplayPanel.setLayout(new BorderLayout());
            this.show(false);  
            DisplayPanel.add(empty);
            empty.show(true);
            DisplayPanel.revalidate();
            orderingpan.revalidate();
    }//GEN-LAST:event_CloseButtonMouseClicked

    private void AddToCartButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartButtonMouseClicked
        // TODO add your handling code here:
        cart.UpdateCart(ItemName, QuantityField.getText().trim(),Price,ImageName);
        QuantityField.setText("");
    }//GEN-LAST:event_AddToCartButtonMouseClicked

    private void AddToCartButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartButtonMouseEntered
        // TODO add your handling code here:
        AddToCartButton.setBackground(new java.awt.Color(235, 228, 228));
        AddToCartButton.setForeground(new java.awt.Color(13, 9, 9));
    }//GEN-LAST:event_AddToCartButtonMouseEntered

    private void AddToCartButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartButtonMouseExited
        // TODO add your handling code here:
        AddToCartButton.setBackground(new java.awt.Color(117, 117, 117));
        AddToCartButton.setForeground(new java.awt.Color(248, 244, 244));
    }//GEN-LAST:event_AddToCartButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddToCartButton;
    private javax.swing.JLabel CategoryNameLabel;
    private javax.swing.JLabel CloseButton;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JTextField QuantityField;
    private javax.swing.JLabel QuantityLabel;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
