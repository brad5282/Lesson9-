/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeProject;

import BreezySwing.*;
import TurtleGraphics.*;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import javax.swing.JOptionPane;

public class ShapeGUI extends javax.swing.JFrame {

    StandardPen p;
    Shape s;
    int shape = 0;// circle = 1, wheel = 2, rectangle = 3, triangle = 4;

    public ShapeGUI() {
        initComponents();
        SketchPadWindow w = new SketchPadWindow(400, 400);
        w.setLocation(20, 275);
        p = new StandardPen(w);
        s = new Circle(0, 0, 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        circlebtn = new javax.swing.JButton();
        wheelbtn = new javax.swing.JButton();
        rectbtn = new javax.swing.JButton();
        tribtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        mbtn = new javax.swing.JButton();
        rsbtn = new javax.swing.JButton();
        qbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtinfo = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shape Maker 2.0");
        setBackground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        circlebtn.setText("Circle");
        circlebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circlebtnActionPerformed(evt);
            }
        });

        wheelbtn.setText("Wheel");
        wheelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wheelbtnActionPerformed(evt);
            }
        });

        rectbtn.setText("Rectangle");
        rectbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectbtnActionPerformed(evt);
            }
        });

        tribtn.setText("Triangle");
        tribtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tribtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(circlebtn)
                .addGap(18, 18, 18)
                .addComponent(wheelbtn)
                .addGap(18, 18, 18)
                .addComponent(rectbtn)
                .addGap(18, 18, 18)
                .addComponent(tribtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {circlebtn, rectbtn, tribtn, wheelbtn});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(circlebtn)
                    .addComponent(wheelbtn)
                    .addComponent(rectbtn)
                    .addComponent(tribtn))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Select A Shape");

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mbtn.setText("Move");
        mbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbtnActionPerformed(evt);
            }
        });

        rsbtn.setText("Resize");
        rsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsbtnActionPerformed(evt);
            }
        });

        qbtn.setText("Quit");
        qbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mbtn)
                    .addComponent(rsbtn)
                    .addComponent(qbtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {mbtn, qbtn, rsbtn});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rsbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(qbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {mbtn, qbtn, rsbtn});

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("Shape Options");

        txtinfo.setColumns(20);
        txtinfo.setRows(5);
        jScrollPane1.setViewportView(txtinfo);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Shape Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void qbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qbtnActionPerformed
        System.exit(0);// shuts down program
    }//GEN-LAST:event_qbtnActionPerformed

    private void rsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsbtnActionPerformed
        double factor = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter the factor to increase/decrease by.", "0"));
        erase();
        s.stretchBy(factor);
        p.setColor(Color.blue);
        s.draw(p);
        txtinfo.setText(s.toString());
    }//GEN-LAST:event_rsbtnActionPerformed

    private void mbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbtnActionPerformed
        
            double x = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter new x", "0"));
            double y = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter new y", "0"));
            erase();
            s.move(x, y);
            p.setColor(Color.blue);
            s.draw(p);
            txtinfo.setText(s.toString());
        


    }//GEN-LAST:event_mbtnActionPerformed

    private void circlebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circlebtnActionPerformed
        erase();
        s = new Circle(0, 0, 50);
        s.draw(p);
        txtinfo.setText(s.toString());
    }//GEN-LAST:event_circlebtnActionPerformed

    private void wheelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wheelbtnActionPerformed
        erase();
        s = new Wheel(0, 0, 50, 50);
        s.draw(p);
        txtinfo.setText(s.toString());
    }//GEN-LAST:event_wheelbtnActionPerformed

    private void rectbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectbtnActionPerformed
        erase();
        s = new Rectangle(0, 0, 50, 50);
        s.draw(p);
        txtinfo.setText(s.toString());
    }//GEN-LAST:event_rectbtnActionPerformed

    private void tribtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tribtnActionPerformed
        erase();
        s = new Triangle();
        shape = 4;
        s.draw(p);
        txtinfo.setText(s.toString());
    }//GEN-LAST:event_tribtnActionPerformed

    public void erase() {
        p.setColor(Color.white);
        s.draw(p);
        p.setColor(Color.blue);
    }

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
            java.util.logging.Logger.getLogger(ShapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShapeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton circlebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mbtn;
    private javax.swing.JButton qbtn;
    private javax.swing.JButton rectbtn;
    private javax.swing.JButton rsbtn;
    private javax.swing.JButton tribtn;
    private javax.swing.JTextArea txtinfo;
    private javax.swing.JButton wheelbtn;
    // End of variables declaration//GEN-END:variables
}
