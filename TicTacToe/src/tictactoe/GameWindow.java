/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author Taiwo
 */
public class GameWindow extends javax.swing.JFrame {
private boolean player1,playerDraw;
private int xScore,oScore;
    /**
     * Creates new form GameWindow
     */
    public GameWindow() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle(" TicTacToe");
        player1 = true;
        playerDraw=true;
        xScore = 0;
        oScore = 0;
        jButton10.setEnabled(false);
    }
    private void DisableButtons(){
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
    }
     private void EnableButtons(){
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
    }
    private void CheckWin(){
     String button1 =   jButton1.getText();
     String button2 =   jButton2.getText();
     String button3 =   jButton3.getText();
     String button4 =   jButton4.getText();
     String button5 =   jButton5.getText();
     String button6 =   jButton6.getText();
     String button7 =   jButton7.getText();
     String button8 =   jButton8.getText();
     String button9 =   jButton9.getText();
     
       
      // <editor-fold defaultstate="collapsed" desc=" If Statements ">     
     if(button1.equals(button2)&&button2.equals(button3)){
            if(button1.equals("X")){
                System.out.println("Player 1 Wins");
              DisableButtons();
              jButton10.setEnabled(true);
              xScore++;
             jLabel1.setText("Player X: " + xScore);
             playerDraw=false;
             JOptionPane.showMessageDialog(this, " Player X Wins ", "Winner", 1);
            }
            else if(button1.equals("O")){
                System.out.println("Player 2 Wins");
                DisableButtons();
              jButton10.setEnabled(true);
                oScore++;
                  jLabel2.setText("Player O: " + oScore);
                  playerDraw=false;
                JOptionPane.showMessageDialog(this, " Player O Wins ", "Winner", 1);
            }
          
        }
     
     if(button1.equals(button4)&&button4.equals(button7)){
            if(button1.equals("X")){
                System.out.println("Player 1 Wins");
                DisableButtons();
              jButton10.setEnabled(true);
                xScore++;
                jLabel1.setText("Player X: " + xScore);
                playerDraw=false;
                JOptionPane.showMessageDialog(this, " Player X Wins ", "Winner", 1);
            }
            else if(button1.equals("O")){
                System.out.println("Player 2 Wins");
                DisableButtons();
              jButton10.setEnabled(true);
                oScore++;
                 jLabel2.setText("Player O: " + oScore);
                 playerDraw=false;
                JOptionPane.showMessageDialog(this, " Player O Wins ", "Winner", 1);
            }
          
        }
   
   if(button1.equals(button5)&&button5.equals(button9)){
            if(button1.equals("X")){
                System.out.println("Player 1 Wins");
                DisableButtons();
              jButton10.setEnabled(true);
                xScore++;
                jLabel1.setText("Player X: " + xScore);
                playerDraw=false;
                JOptionPane.showMessageDialog(this, " Player X Wins ", "Winner", 1);
            }
            else if(button1.equals("O")){
                System.out.println("Player 2 Wins");
                DisableButtons();
              jButton10.setEnabled(true);
                oScore++;
                 jLabel2.setText("Player O: " + oScore);
                 playerDraw=false;
                JOptionPane.showMessageDialog(this, " Player O Wins ", "Winner", 1);
            }
        }
   
   if(button2.equals(button5)&&button5.equals(button8)){
            if(button2.equals("X")){
                System.out.println("Player 1 Wins");
                DisableButtons();
              jButton10.setEnabled(true);
                xScore++;
                jLabel1.setText("Player X: " + xScore);
                playerDraw=false;
                JOptionPane.showMessageDialog(this, " Player X Wins ", "Winner", 1);
            }
            else if(button2.equals("O")){
                System.out.println("Player 2 Wins");
                DisableButtons();
              jButton10.setEnabled(true);
                oScore++;
                 jLabel2.setText("Player O: " + oScore);
                 playerDraw=false;
                JOptionPane.showMessageDialog(this, " Player O Wins ", "Winner", 1);
            }
        }
    
    if(button3.equals(button6)&&button6.equals(button9)){
            if(button3.equals("X")){
                System.out.println("Player 1 Wins");
                DisableButtons();
              jButton10.setEnabled(true);
                xScore++;
                jLabel1.setText("Player X: " + xScore);
                playerDraw=false;
                JOptionPane.showMessageDialog(this, " Player X Wins ", "Winner", 1);
            }
            else if(button3.equals("O")){
                System.out.println("Player 2 Wins");
                DisableButtons();
              jButton10.setEnabled(true);
                oScore++;
                 jLabel2.setText("Player O: " + oScore);
                 playerDraw=false;
                JOptionPane.showMessageDialog(this, " Player O Wins ", "Winner", 1);
            }
        }
   
    if(button4.equals(button5)&&button5.equals(button6)){
            if(button4.equals("X")){
                System.out.println("Player 1 Wins");
                DisableButtons();
              jButton10.setEnabled(true);
                xScore++;
                jLabel1.setText("Player X: " + xScore);
                playerDraw=false;
                JOptionPane.showMessageDialog(this, " Player X Wins ", "Winner", 1);
            }
            else if(button4.equals("O")){
                System.out.println("Player 2 Wins");
                DisableButtons();
              jButton10.setEnabled(true);
                oScore++;
                 jLabel2.setText("Player O: " + oScore);
                 playerDraw=false;
                JOptionPane.showMessageDialog(this, " Player O Wins ", "Winner", 1);
            }
        }
   
    if(button3.equals(button5)&&button5.equals(button7)){
            if(button3.equals("X")){
                System.out.println("Player 1 Wins");
                DisableButtons();
              jButton10.setEnabled(true);
                xScore++;
                jLabel1.setText("Player X: " + xScore);
                playerDraw=false;
                JOptionPane.showMessageDialog(this, " Player X Wins ", "Winner", 1);
            }
            else if(button3.equals("O")){
                System.out.println("Player 2 Wins");
                DisableButtons();
              jButton10.setEnabled(true);
                oScore++;
                 jLabel2.setText("Player O: " + oScore);
                 playerDraw=false;
                JOptionPane.showMessageDialog(this, " Player O Wins ", "Winner", 1);
            }
        }
   
    if(button7.equals(button8)&&button8.equals(button9)){
            if(button7.equals("X")){
                System.out.println("Player 1 Wins");
                DisableButtons();
              jButton10.setEnabled(true);
                xScore++;
                jLabel1.setText("Player X: " + xScore);
                playerDraw=false;
                JOptionPane.showMessageDialog(this, " Player X Wins ", "Winner", 1);
            }
            else if(button7.equals("O")){
                System.out.println("Player 2 Wins");
                DisableButtons();
              jButton10.setEnabled(true);
                oScore++;
                 jLabel2.setText("Player O: " + oScore);
                 playerDraw=false;
                JOptionPane.showMessageDialog(this, " Player O Wins ", "Winner", 1);
            }
        }
   if((button1.equals("X")||button1.equals("O"))&&(button2.equals("X")||button2.equals("O"))&&(button3.equals("X")||button3.equals("O"))&&(button4.equals("X")||button4.equals("O"))&&(button5.equals("X")||button5.equals("O"))&&(button6.equals("X")||button6.equals("O"))&&(button7.equals("X")||button7.equals("O"))&&(button8.equals("X")||button8.equals("O"))&&(button9.equals("X")||button9.equals("O"))&&playerDraw){
       JOptionPane.showMessageDialog(this, "It's A Tie", "Tie", 1);
        DisableButtons();
              jButton10.setEnabled(true);
   }
    // </editor-fold> 
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("-");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("-");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("-");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("-");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("-");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setText("-");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("-");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.setText("-");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setText("-");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButton11.setText("Restart");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel1.setText("Player X: " + xScore);

        jLabel2.setText("Player O: " + oScore);

        jButton10.setText("Next Round");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jButton1.setFont(new java.awt.Font("Euphemia", Font.PLAIN, 25));
        jButton2.setFont(new java.awt.Font("Euphemia", Font.PLAIN, 25));
        jButton3.setFont(new java.awt.Font("Euphemia", Font.PLAIN, 25));
        jButton4.setFont(new java.awt.Font("Euphemia", Font.PLAIN, 25));
        jButton5.setFont(new java.awt.Font("Euphemia", Font.PLAIN, 25));
        jButton6.setFont(new java.awt.Font("Euphemia", Font.PLAIN, 25));
        jButton7.setFont(new java.awt.Font("Euphemia", Font.PLAIN, 25));
        jButton8.setFont(new java.awt.Font("Euphemia", Font.PLAIN, 25));
        jButton9.setFont(new java.awt.Font("Euphemia", Font.PLAIN, 25));
        jButton11.setBackground(Color.RED);
        jLabel1.setFont(new java.awt.Font("Euphemia", Font.PLAIN, 18));
        jLabel2.setFont(new java.awt.Font("Euphemia", Font.PLAIN, 18));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
 
        if(jButton1.getText().equals("-")){
                if(player1){
        jButton1.setText("X");
        player1=false;
   }
   else{
       jButton1.setText("O");
        player1=true;
            }
        }
         if(!jButton1.getText().equals("-")){
             CheckWin();
         }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
          if(jButton2.getText().equals("-")){ 
        if(player1){
        jButton2.setText("X");
   player1=false;
   }
   else{
       jButton2.setText("O");
       player1=true;
                 }
          }
         if(!jButton2.getText().equals("-")){
             CheckWin();
         }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
          if(jButton3.getText().equals("-")){
        if(player1){
        jButton3.setText("X");
   player1=false;
   }
   else{
       jButton3.setText("O");
       player1=true;
                }
          }
         if(!jButton3.getText().equals("-")){
             CheckWin();
         }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
          if(jButton4.getText().equals("-")){
        if(player1){
        jButton4.setText("X");
  player1=false;
   }
   else{
       jButton4.setText("O");
       player1=true;
                }
          }
         if(!jButton4.getText().equals("-")){
             CheckWin();
         }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
         if(jButton5.getText().equals("-")){
        if(player1){
        jButton5.setText("X");
  player1=false;
   }
   else{
       jButton5.setText("O");
       player1=true;
              }
         }
         if(!jButton5.getText().equals("-")){
             CheckWin();
         }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
       if(jButton6.getText().equals("-")){
        if(player1){
        jButton6.setText("X");
   player1=false;
   }
   else{
       jButton6.setText("O");
       player1=true;
            }
       }
         if(!jButton6.getText().equals("-")){
             CheckWin();
         }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
          if(jButton7.getText().equals("-")){
        if(player1){
        jButton7.setText("X");
   player1=false;
   }
   else{
       jButton7.setText("O");
       player1=true;
                 }
          }
         if(!jButton7.getText().equals("-")){
             CheckWin();
         }
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        if(jButton8.getText().equals("-")){
        if(player1){
        jButton8.setText("X");
  player1=false;
   }
   else{
       jButton8.setText("O");
       player1=true;
              }
        }
         if(!jButton8.getText().equals("-")){
             CheckWin();
         }
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
         if(jButton9.getText().equals("-")){
        if(player1){
        jButton9.setText("X");
  player1=false;
   }
   else{
       jButton9.setText("O");
       player1=true;
                }
         }
         if(!jButton9.getText().equals("-")){
             CheckWin();
         }
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
 int n = JOptionPane.showConfirmDialog(this, " Are You Sure You Want To Restart? " , "Restart Game", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);  
  if(n==JOptionPane.YES_OPTION){
      jButton1.setText("-");
      jButton2.setText("-");
      jButton3.setText("-");
      jButton4.setText("-");
      jButton5.setText("-");
      jButton6.setText("-");
      jButton7.setText("-");
      jButton8.setText("-");
      jButton9.setText("-");
            EnableButtons();
      player1=true;
      xScore=0;
      oScore=0;
       jLabel1.setText("Player X: " + xScore);
        jLabel2.setText("Player O: " + oScore);
        playerDraw=true;
      }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
           jButton10.setEnabled(false);    
        jButton1.setText("-");
      jButton2.setText("-");
      jButton3.setText("-");
      jButton4.setText("-");
      jButton5.setText("-");
      jButton6.setText("-");
      jButton7.setText("-");
      jButton8.setText("-");
      jButton9.setText("-");
      EnableButtons();
      if(!player1){
      player1=false;
      }
      else{player1=true;}
      playerDraw=true;
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
