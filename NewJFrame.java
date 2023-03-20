package javaapplication1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    boolean a;
    public NewJFrame() {
        initComponents();
        Question();
        getContentPane().setBackground(new java.awt.Color(255,255,0));
        jLabel2.setText("Prize Money = "+First.Money[First.count+1]+" Rs");
    }
        public void Question(){
        switch (First.number) {
            case 1:
                jLabel1.setText("Q1 -  By which of these nicknames is Nagpur also known as?");
                jCheckBox1.setText("DIAMOND CITY");
                jCheckBox2.setText("ORANGE CITY");
                jCheckBox3.setText("PINK CITY");
                jCheckBox4.setText("CITY OF LAKES");
                break;
            case 2:
                jLabel1.setText("Q2 -  What Is The Capital Of Uttar Pradesh ?");
                jCheckBox1.setText("LUCKNOW");
                jCheckBox2.setText("KANPUR");
                jCheckBox3.setText("AGRA");
                jCheckBox4.setText("GORAKHPUR");
                break;
            case 3:
                jLabel1.setText("Q3- Which pieces are maximum in number at the start of a chess game?");
                jCheckBox1.setText("ROOK");
                jCheckBox2.setText("KNIGHT");
                jCheckBox3.setText("PAWN");
                jCheckBox4.setText("BISHOP");
                break;
            case 4:
                jLabel1.setText("Q4 -  What does 'S' stand for in a 'SIM' card used in mobile phones?");
                jCheckBox1.setText("SERVICE");
                jCheckBox2.setText("SMART");
                jCheckBox3.setText("SCIENCE");
                jCheckBox4.setText("SUBSCRIBER");
                break;
            case 5:
                jLabel1.setText("Q5 - What was the name of India's first unmanned lunar spacecraft ?");
                jCheckBox1.setText("CHANDRAVAAHAN 1");
                jCheckBox2.setText("CHANDRAVIMAAN 1");
                jCheckBox3.setText("CHANDRAYAAN 1");
                jCheckBox4.setText("CHANDRAKHOJ 1");
                break;
            case 6:
                jLabel1.setText("Q6 -  The scheme for rural employment NREGA has been named after which leader?");
                jCheckBox1.setText("MAHATMA GANDHI");
                jCheckBox2.setText("RAJEEV GANDHI");
                jCheckBox3.setText("JAWAHAR LAL NEHRU");
                jCheckBox4.setText("INDIRA GANDHI");
                break;
            case 7:
                jLabel1.setText("Q7 -  What kind of animal is Shera, the mascot of the 2010 Delhi Commonwealth Games?");
                jCheckBox1.setText("BEAR");
                jCheckBox2.setText("LION");
                jCheckBox3.setText("LEOPARD");
                jCheckBox4.setText("TIGER");
                break;
            case 8:
                jLabel1.setText("Q8 -  Which of these fims has the tag line 'Every Child is Special'?");
                jCheckBox1.setText("PAA");
                jCheckBox2.setText("KOI... MIL GAYA");
                jCheckBox3.setText("TAARE ZAMEEN PAR");
                jCheckBox4.setText("PAATHSHALA");
                break;
            case 9:
                jLabel1.setText("Q9 - What can you hear when a bell rings in a vaccum?");
                jCheckBox1.setText("LOUD SOUND");
                jCheckBox2.setText("USUAL SOUND");
                jCheckBox3.setText("NO SOUND");
                jCheckBox4.setText("VIBRATING SOUND");
                break;
            case 10:
                jLabel1.setText("Q10 - How many stripes are there on the US flag?");
                jCheckBox1.setText("12");
                jCheckBox2.setText("13");
                jCheckBox3.setText("14");
                jCheckBox4.setText("15");
                break;
            case 11:
                jLabel1.setText("Q11 -  How many keys does a classic piano have?");
                jCheckBox1.setText("82");
                jCheckBox2.setText("84");
                jCheckBox3.setText("86");
                jCheckBox4.setText("88");
                break;
            case 12:
                jLabel1.setText("Q12 -  Name Pixar’s first feature - length movie?");
                jCheckBox1.setText("INCREDIBLES 2");
                jCheckBox2.setText("TOY STORY");
                jCheckBox3.setText("RATATOUILLE");
                jCheckBox4.setText("WALL-E");
                break;
            case 13:
                jLabel1.setText("Q13 -  Name the longest river in the world?");
                jCheckBox1.setText("THE NILE");
                jCheckBox2.setText("AMAZON RIVER");
                jCheckBox3.setText("YANGTZE RIVER");
                jCheckBox4.setText("THE GREAT CONGO RIVER");
                break;
            case 14:
                jLabel1.setText("Q14 - First Indian Movie Submitted For Oscar ? ");
                jCheckBox1.setText("THE GUIDE");
                jCheckBox2.setText("MADHUMATI");
                jCheckBox3.setText("AMRAPALI");
                jCheckBox4.setText("MOTHER INDIA");
                break;
            default:
                break;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        setIconImages(null);

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 51, 255));
        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Q1 -  By which of these nicknames is Nagpur also known as?");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 153)));
        jLabel1.setOpaque(true);

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 0));
        buttonGroup1.add(jCheckBox1);
        jCheckBox1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jCheckBox1.setText("Diamond City");
        jCheckBox1.setToolTipText("");
        jCheckBox1.setBorder(null);
        jCheckBox1.setBorderPainted(true);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 0));
        buttonGroup1.add(jCheckBox2);
        jCheckBox2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jCheckBox2.setText("Orange City");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 0));
        buttonGroup1.add(jCheckBox3);
        jCheckBox3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jCheckBox3.setText("Pink City");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 0));
        buttonGroup1.add(jCheckBox4);
        jCheckBox4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jCheckBox4.setText("City Of lakes");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if(First.number==1)
      {if(jCheckBox2.isSelected())
          a=true;
       else
          a=false;
      }
      else if(First.number==2)
      {if(jCheckBox1.isSelected())
          a=true;
       else
          a=false;         
      } 
      else if(First.number==3)
      {if(jCheckBox3.isSelected())
          a=true;
       else
          a=false;         
      }   
      else if(First.number==4)
      { if(jCheckBox4.isSelected())
          a=true;
       else
          a=false;        
      }   
      else if(First.number==5)
      { if(jCheckBox3.isSelected())
          a=true;
       else
          a=false;        
      }   
      else if(First.number==6)
      {if(jCheckBox1.isSelected())
          a=true;
       else
          a=false;         
      }   
      else if(First.number==7)
      {if(jCheckBox4.isSelected())
          a=true;
       else
          a=false;         
      }   
      else if(First.number==8)
      {if(jCheckBox3.isSelected())
          a=true;
       else
          a=false;         
      }   
      else if(First.number==9)
      {if(jCheckBox3.isSelected())
          a=true;
       else
          a=false;         
      }   
      else if(First.number==10)
      {if(jCheckBox2.isSelected())
          a=true;
       else
          a=false;         
      }   
      else if(First.number==11)
      {if(jCheckBox4.isSelected())
          a=true;
       else
          a=false;         
      }   
      else if(First.number==12)
      {if(jCheckBox2.isSelected())
          a=true;
       else
          a=false;         
      }   
      else if(First.number==13)
      {if(jCheckBox1.isSelected())
          a=true;
       else
          a=false;         
      }
      else if(First.number==14)
      {if(jCheckBox4.isSelected())
          a=true;
       else
          a=false;         
      }   
      check();
      // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jCheckBox4ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }  
        });
        
        
    }
     public void check()
     {if(a==true)
         correct();
      else
         incorrect();
        
     }    
     
         public void correct()
         {
         First.count++;
         First.number++;
         setVisible(false);
         dispose();
         NewJFrame frame = new NewJFrame();
         frame.setVisible(true);
         }  
         public void incorrect()
         {
          setVisible(false);
          dispose();
          Last frame = new Last();
          frame.setVisible(true); 
         }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    
}
