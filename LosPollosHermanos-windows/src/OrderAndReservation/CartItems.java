/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OrderAndReservation;

import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Statement;
import javax.swing.ImageIcon;

/**
 *
 * @author zubaeyr
 */
public class CartItems extends javax.swing.JPanel {

    /**
     * Creates new form CartItems
     */
    CartPanel cartpan;
    String ItemName, IconName, Quantity, Price, SubTotal;
    Statement statement;
    ImageIcon icon=null;
    public CartItems(Statement statement, String ItemName, String IconName,String Quantity,String Price, String SubTotal,CartPanel cartpan) {
      this.statement=statement;
      this.ItemName=ItemName;
      this.IconName=IconName;
      this.Quantity=Quantity;
      this.Price=Price;
      this.SubTotal=SubTotal;
      this.cartpan=cartpan;
       if(IconName.equals("black.png")){
                 icon=new ImageIcon(new ImageIcon(getClass().getResource("/OrderAndReservation/black.png")).getImage().getScaledInstance(85, 86, Image.SCALE_SMOOTH));
            
        }
        if(IconName.equals("Empty.png")){
                    icon=new ImageIcon(new ImageIcon(getClass().getResource("/OrderAndReservation/Empty.png")).getImage().getScaledInstance(85, 86, Image.SCALE_SMOOTH));
        }else{
          try {
              String u=new String("C:/Program Files/RMS/images/Meals/"+IconName);
                icon=new ImageIcon(new ImageIcon(u).getImage().getScaledInstance(88, 88, Image.SCALE_SMOOTH));
            } catch (Exception ex) {
              System.out.println("Breaking point 1: item2");
            }
           }
      initComponents();
      
        if(IconName.equals("black.png")){
            ImageLabel.setVisible(false);
            PriceLabel.setVisible(false);
            QuantityLabel.setVisible(false);
            NameLabel.setVisible(false);
            SubTotalLabel.setVisible(false);
            this.setOpaque(false);
        }
        else{
            NameLabel.setText("Name         : "+ItemName);
            QuantityLabel.setText("Quantity    : "+Quantity);
            PriceLabel.setText("Price ($)     : "+Price);
            SubTotalLabel.setText("Subtotal    : "+SubTotal);
        }
        
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
        ImageLabel = new javax.swing.JLabel();
        SubTotalLabel = new javax.swing.JLabel();
        PriceLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        QuantityLabel = new javax.swing.JLabel();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(326, 89));

        ImageLabel.setIcon(icon);
        ImageLabel.setBackground(new java.awt.Color(17, 13, 13));
        ImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageLabel.setOpaque(true);

        SubTotalLabel.setBackground(new java.awt.Color(87, 78, 78));
        SubTotalLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        SubTotalLabel.setForeground(new java.awt.Color(3, 3, 3));
        SubTotalLabel.setText("Subtotal    :");
        SubTotalLabel.setMaximumSize(new java.awt.Dimension(50, 20));
        SubTotalLabel.setMinimumSize(new java.awt.Dimension(50, 20));
        NameLabel.setText(ItemName);

        PriceLabel.setBackground(new java.awt.Color(87, 78, 78));
        PriceLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        PriceLabel.setForeground(new java.awt.Color(3, 3, 3));
        PriceLabel.setText("Price ($)     :");
        PriceLabel.setMaximumSize(new java.awt.Dimension(50, 20));
        PriceLabel.setMinimumSize(new java.awt.Dimension(50, 20));
        NameLabel.setText(ItemName);

        NameLabel.setBackground(new java.awt.Color(87, 78, 78));
        NameLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(3, 3, 3));
        NameLabel.setText("Name         : ");
        NameLabel.setMaximumSize(new java.awt.Dimension(50, 20));
        NameLabel.setMinimumSize(new java.awt.Dimension(50, 20));
        NameLabel.setText(ItemName);

        QuantityLabel.setBackground(new java.awt.Color(87, 78, 78));
        QuantityLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        QuantityLabel.setForeground(new java.awt.Color(3, 3, 3));
        QuantityLabel.setText("Quantity    : ");
        QuantityLabel.setMaximumSize(new java.awt.Dimension(50, 20));
        QuantityLabel.setMinimumSize(new java.awt.Dimension(50, 20));
        NameLabel.setText(ItemName);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(SubTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    int click=0;
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
         if(click==0 &&!IconName.equals("black.png")){
            setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(244, 236, 236)));
            setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
            
            click=1;
        }
        else if(click==1){
             this.setBackground(new java.awt.Color(232, 232, 232));
             click=0;
        }
    }//GEN-LAST:event_formMouseClicked

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        if(!IconName.equals("black.png")){
            setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(244, 236, 236)));
            setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
            
        }
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
        if(!IconName.equals("black.png")&&click==0){
        setBorder(null);
        this.setBackground(new java.awt.Color(232, 232, 232));

        }
    }//GEN-LAST:event_formMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JLabel QuantityLabel;
    private javax.swing.JLabel SubTotalLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
