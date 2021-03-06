/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.server.model;

import java.util.Iterator;



/**
 *
 * @author Nisal Jinadasa
 */
public class Client_app extends javax.swing.JFrame {
    
    //public boolean ;
   // 3.55
    //int bankBalance = 100000;
   
    static PayDetails s=new PayDetails();
    static Server server1=new Server();
    

    /**
     * Creates new form Client_app2
     */
    public Client_app() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Tab1 = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        txt_cardnum = new javax.swing.JTextField();
        txt_CVV = new javax.swing.JFormattedTextField();
        lbl_cardnum = new javax.swing.JLabel();
        lbl_cardcvv = new javax.swing.JLabel();
        lbl_amount = new javax.swing.JLabel();
        btn_sendpay = new javax.swing.JButton();
        tgl_idempotency = new javax.swing.JToggleButton();
        btn_newpayment = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        lbl_firstname = new javax.swing.JLabel();
        txt_firstName = new javax.swing.JTextField();
        lbl_lastname = new javax.swing.JLabel();
        txt_lastname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_bankBalance = new javax.swing.JTextField();
        btn_updBank = new javax.swing.JButton();
        txt_payerror = new javax.swing.JTextField();
        txt_amount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Tab2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_keys = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btn_showkeys = new javax.swing.JButton();
        btn_clearkeys = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_cmpPayment = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setBackground(new java.awt.Color(0, 153, 153));
        Header.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Header.setText("Client Server Test");
        Header.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txt_cardnum.setColumns(4);

        try {
            txt_CVV.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbl_cardnum.setText("Enter Card Number: -");

        lbl_cardcvv.setText("CVV: -");

        lbl_amount.setText("Amount:-");

        btn_sendpay.setText("Send Payment");
        btn_sendpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendpayActionPerformed(evt);
            }
        });

        tgl_idempotency.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tgl_idempotency.setText("Turn Off Idempotency");
        tgl_idempotency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgl_idempotencyActionPerformed(evt);
            }
        });

        btn_newpayment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_newpayment.setText("New Payment");
        btn_newpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newpaymentActionPerformed(evt);
            }
        });

        btn_reset.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        lbl_firstname.setText("Enter your First Name: -");

        txt_firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstNameActionPerformed(evt);
            }
        });

        lbl_lastname.setText("Enter your Last Name: -");

        jLabel3.setText("Bank Balance: -");

        txt_bankBalance.setToolTipText("");
        txt_bankBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bankBalanceActionPerformed(evt);
            }
        });

        btn_updBank.setText("Update Balance");
        btn_updBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updBankActionPerformed(evt);
            }
        });

        jLabel4.setText("( Changes the Key)");

        jLabel5.setText("(Turns Off Keys)");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("(Resets Client)");

        jLabel10.setText("Status: -");

        jLabel11.setText("*Delete previous spaces of CVV if only 1 digit is being allowed*");

        javax.swing.GroupLayout Tab1Layout = new javax.swing.GroupLayout(Tab1);
        Tab1.setLayout(Tab1Layout);
        Tab1Layout.setHorizontalGroup(
            Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Tab1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_newpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Tab1Layout.createSequentialGroup()
                                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(Tab1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tgl_idempotency)
                                    .addGroup(Tab1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(59, 59, 59))))
                    .addGroup(Tab1Layout.createSequentialGroup()
                        .addGroup(Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Tab1Layout.createSequentialGroup()
                                .addComponent(lbl_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(Tab1Layout.createSequentialGroup()
                                .addComponent(lbl_cardnum, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_cardnum, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Tab1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbl_cardcvv)
                                .addGap(18, 18, 18)
                                .addComponent(txt_CVV, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_amount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Tab1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(lbl_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tab1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(181, 181, 181)))
                .addGap(30, 30, 30))
            .addGroup(Tab1Layout.createSequentialGroup()
                .addGroup(Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Tab1Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_payerror, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Tab1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_bankBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(Tab1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(btn_updBank))
                    .addGroup(Tab1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(btn_sendpay, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Tab1Layout.setVerticalGroup(
            Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Header)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tgl_idempotency)
                    .addComponent(btn_newpayment)
                    .addComponent(btn_reset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addGap(24, 24, 24)
                .addGroup(Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_firstname)
                    .addComponent(txt_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_lastname)
                    .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cardnum)
                    .addComponent(lbl_cardcvv)
                    .addComponent(lbl_amount)
                    .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cardnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_CVV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btn_sendpay, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_payerror, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(22, 22, 22)
                .addGroup(Tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_bankBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_updBank)
                .addGap(19, 19, 19)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Client", Tab1);

        txt_keys.setColumns(20);
        txt_keys.setRows(5);
        jScrollPane1.setViewportView(txt_keys);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Recieved Payment Requests");

        btn_showkeys.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_showkeys.setText("Show Keys");
        btn_showkeys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showkeysActionPerformed(evt);
            }
        });

        btn_clearkeys.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_clearkeys.setText("Clear Keys");
        btn_clearkeys.setActionCommand("Clear Keys");
        btn_clearkeys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearkeysActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Server");

        btn_cmpPayment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cmpPayment.setText("Complete top payment request");
        btn_cmpPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cmpPaymentActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("(Click to show all keys)");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("(Click to clear all keys)");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("(Click to process first request on queue as completed)");

        javax.swing.GroupLayout Tab2Layout = new javax.swing.GroupLayout(Tab2);
        Tab2.setLayout(Tab2Layout);
        Tab2Layout.setHorizontalGroup(
            Tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab2Layout.createSequentialGroup()
                .addGroup(Tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Tab2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btn_showkeys)
                        .addGap(63, 63, 63)
                        .addComponent(btn_clearkeys))
                    .addGroup(Tab2Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(Tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Tab2Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel1))
                    .addGroup(Tab2Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(Tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Tab2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(Tab2Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btn_cmpPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        Tab2Layout.setVerticalGroup(
            Tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_showkeys)
                    .addComponent(btn_clearkeys))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cmpPayment)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Server", Tab2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sendpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendpayActionPerformed
        // TODO add your handling code here:
        txt_payerror.setText(null);
        String a,b,c,d,e;
        a=txt_cardnum.getText();
        b=txt_CVV.getText();
        c=txt_amount.getText();
        d=txt_firstName.getText();
        e=txt_lastname.getText();
        
        System.out.println(a);
        if("".equals(a)||"".equals(b)||"".equals(c)||"".equals(d)||"".equals(e)){
            txt_payerror.setText("Please fill all the details");
        }
      
        else{
            s.setAmount(Integer.valueOf(c));
            s.setCardNum(Long.valueOf(a));
            s.setCvv(Integer.valueOf(b));
            s.setFname(d);
            s.setLname(e);
            
            s.printAll();
              
        }
        
        if(server1.keylist.contains(s.getKey())==true){
            txt_payerror.setText("Payment Request Already Queued");
        }
        else{
            if(s.getKey()!=null&&server1.cmpl_keylist.contains(s.getKey())==false){
            txt_payerror.setText("Payment Request Sent");
            server1.keylist.add(s.getKey());
            //server1.payment(s.getAmount());
            }
            else if(s.getKey()==null){
            txt_payerror.setText("Payment Request Sent");
            server1.payment(s.getAmount());
            }
            else if(server1.cmpl_keylist.contains(s.getKey())==true){
                txt_payerror.setText("Payment Has been completed");
            }
            
        }
    }//GEN-LAST:event_btn_sendpayActionPerformed

    private void tgl_idempotencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgl_idempotencyActionPerformed
        // TODO add your handling code here:
        System.out.println(tgl_idempotency.isSelected());
        s.setKeystate(!tgl_idempotency.isSelected());
        if(s.getKeystate()==false){
            s.setKey(null);
        }
        else{
             try{
            s.keyGen();
        }catch(Exception Ae){}
        }
    }//GEN-LAST:event_tgl_idempotencyActionPerformed

    private void txt_firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstNameActionPerformed

    private void txt_bankBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bankBalanceActionPerformed
        // TODO add your handling code here:
        //txt_bankBalance.setText(String.valueOf(bankBalance));
    }//GEN-LAST:event_txt_bankBalanceActionPerformed

    private void btn_updBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updBankActionPerformed
        // TODO add your handling code here:
        txt_bankBalance.setText(Integer.toString(server1.bankBalance));
    }//GEN-LAST:event_btn_updBankActionPerformed

    private void btn_showkeysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showkeysActionPerformed
        // TODO add your handling code here:
        txt_keys.setText(null);
        Iterator<String> itr = server1.keylist.iterator();
        while(itr.hasNext()){
            txt_keys.append(itr.next()+"\n\r");
        }
    }//GEN-LAST:event_btn_showkeysActionPerformed

    private void btn_newpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newpaymentActionPerformed
        // TODO add your handling code here:
        try{
            s.keyGen();
        }catch(Exception Ae){}
    }//GEN-LAST:event_btn_newpaymentActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        s.clrAll();
        server1.rstBalance();
        txt_firstName.setText(null);
        txt_lastname.setText(null);
        txt_cardnum.setText(null);
        txt_CVV.setText(null);
        txt_amount.setText(null);
        txt_payerror.setText(null);
        txt_bankBalance.setText(null);
         try{
            s.keyGen();
        }catch(Exception Ae){}
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_clearkeysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearkeysActionPerformed
        // TODO add your handling code here:
        server1.clearQueue();
        txt_keys.setText(null);
    }//GEN-LAST:event_btn_clearkeysActionPerformed

    private void btn_cmpPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cmpPaymentActionPerformed
        // TODO add your handling code here:
        server1.cmpl_payment();
        server1.payment(s.getAmount());
    }//GEN-LAST:event_btn_cmpPaymentActionPerformed
   
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
            java.util.logging.Logger.getLogger(Client_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client_app().setVisible(true);
            }
        });
        try{
            s.keyGen();
        }catch(Exception Ae){}
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Header;
    private javax.swing.JPanel Tab1;
    private javax.swing.JPanel Tab2;
    private javax.swing.JButton btn_clearkeys;
    private javax.swing.JButton btn_cmpPayment;
    private javax.swing.JButton btn_newpayment;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_sendpay;
    private javax.swing.JButton btn_showkeys;
    private javax.swing.JButton btn_updBank;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_amount;
    private javax.swing.JLabel lbl_cardcvv;
    private javax.swing.JLabel lbl_cardnum;
    private javax.swing.JLabel lbl_firstname;
    private javax.swing.JLabel lbl_lastname;
    private javax.swing.JToggleButton tgl_idempotency;
    private javax.swing.JFormattedTextField txt_CVV;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextField txt_bankBalance;
    private javax.swing.JTextField txt_cardnum;
    private javax.swing.JTextField txt_firstName;
    private javax.swing.JTextArea txt_keys;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_payerror;
    // End of variables declaration//GEN-END:variables
}
