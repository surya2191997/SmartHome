/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.home;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;
import java.util.ArrayList;
import javax.swing.JOptionPane;




/**
 *
 * @author suryasdwivedi
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    static int UserId=0;
    static int AdminId=0;
    public Signup() {
        initComponents();
       /*UtilDateModel model = new UtilDateModel();
       JDatePanelImpl datePanel = new JDatePanelImpl(model);
       JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
       this.add(datePicker);*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField1.setText("Last");
        jTextField1.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Name");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "June", "July ", "August ", "September ", "October", "Novomber", "December" }));

        jTextField4.setText("Day");

        jTextField5.setText("Year");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel2.setText("Address");

        jLabel4.setText("Contact No.");

        jLabel5.setText("Email Id");

        jButton1.setBackground(new java.awt.Color(0, 51, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 51, 204));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("HanziPen TC", 0, 24)); // NOI18N
        jLabel6.setText("Create Your AutoHome Account ");

        jLabel7.setFont(new java.awt.Font("HanziPen SC", 0, 13)); // NOI18N
        jLabel7.setText("Register as :");

        jTextField3.setText("First");
        jTextField3.setSelectedTextColor(new java.awt.Color(204, 204, 204));

        jTextField6.setSelectedTextColor(new java.awt.Color(204, 204, 204));

        jTextField7.setSelectedTextColor(new java.awt.Color(204, 204, 204));

        jLabel9.setText("Birthday");

        jLabel10.setBackground(new java.awt.Color(128, 238, 238));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smart/home/image.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(130, 130, 130)
                                    .addComponent(jLabel7)
                                    .addGap(126, 126, 126)))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                    .addGap(1, 1, 1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel10)))
                .addGap(0, 32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(36, 36, 36)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(296, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public boolean validate_no(String no){
        int k=0;
        if(no.length()!=10)
            return false;
        else{
            for(int i=0;i<no.length();i++)
                if(Character.isDigit(no.charAt(i))) k++;
            if(k==10)
                return true;
            else
                return false;
        } 
            
        
        
    }
    
    public boolean validate_mail(String email) {
           String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(email);
           return m.matches();
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NewJFrame f=new NewJFrame();
        f.setVisible(true);
        this.setVisible(false);
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
      String userfile="file1";
      String adminfile="file2";
       
      if(jComboBox1.getSelectedItem().toString().equals("User"))
        {
        String contact_no= jTextField6.getText();
        String mail_id=jTextField7.getText();
        
        if(validate_no(contact_no)&&validate_mail(mail_id))
        {
        
        
        //UserId=Integer.parseInt(FileUtils.readFileToString(new File(UserIds)).trim());
       
       
        
        String bday=jComboBox3.getName()+jTextField4.getText()+jTextField5.getText();
        
        
        //User(String first_name,String last_name,String birthday,String address,String contact_no,String email_id)
        ArrayList<User> list=new ArrayList<User>();
        
        
       try{
        
       File f=new File(userfile);
       
       
        if(f.length()==0)
        {
           FileOutputStream fs1=new FileOutputStream(userfile);
           ObjectOutputStream os1=new ObjectOutputStream(fs1);
           UserId=1;
           User u=u=new User(jTextField3.getText(),jTextField1.getText(),bday,jTextField2.getText(),jTextField6.getText(),jTextField7.getText(),0,UserId);
           list.add(u);
           os1.writeObject(list);
           os1.close();
           
       }
       
       else{
           FileInputStream fs=new FileInputStream(userfile);
           ObjectInputStream os=new ObjectInputStream(fs);
           list=(ArrayList<User>)os.readObject();
           UserId=list.size()+1;
           User u=u=new User(jTextField3.getText(),jTextField1.getText(),bday,jTextField2.getText(),jTextField6.getText(),jTextField7.getText(),0,UserId);
           list.add(u);
           os.close();
           FileOutputStream fs1=new FileOutputStream(userfile);
           ObjectOutputStream os1=new ObjectOutputStream(fs1);
           os1.writeObject(list);
           os1.close();
        }
       
        
        }
        
        catch(Exception ex){
        JOptionPane.showMessageDialog(this,"File not found !");
        ex.printStackTrace();
        }
        
        
       
        
        
        
        
        
        String password;
        password=jTextField6.getText();
        JOptionPane.showMessageDialog(this,
        "You have been successfully registered."+"\nUsername: "+UserId+"\nPassword: "+password+"\nYou will be redirected to Log In page...");
        this.setVisible(false);
        NewJFrame n=new NewJFrame();
        n.setVisible(true);
        }
        
        else{
            if(validate_no(contact_no)&&!validate_mail(mail_id))
            JOptionPane.showMessageDialog(this,"Please enter valid mail id !");
            
            else if(!validate_no(contact_no)&&validate_mail(mail_id))
            JOptionPane.showMessageDialog(this,"Please enter valid contact number !");
            
            else if(!validate_no(contact_no)&&!validate_mail(mail_id))
            JOptionPane.showMessageDialog(this,"Please enter valid contact number and mail id !");
        } 
        
        }
        
        else
        {
        String contact_no= jTextField6.getText();
        String mail_id=jTextField7.getText();
        
        if(validate_no(contact_no)&&validate_mail(mail_id))
        {
     
        //UserId=Integer.parseInt(FileUtils.readFileToString(new File(UserIds)).trim());
        
       
        
        String bday=jComboBox3.getName()+jTextField4.getText()+jTextField5.getText();
        //Admin a=new Admin(jTextField3.getText(),jTextField1.getText(),bday,jTextField2.getText(),jTextField6.getText(),jTextField7.getText(),0,AdminId);
        //User(String first_name,String last_name,String birthday,String address,String contact_no,String email_id)
        ArrayList<Admin> list=new ArrayList<Admin>();
        
        
        try{
        
       File f=new File(adminfile);
       
       
       if(f.length()==0)
       {
           FileOutputStream fs1=new FileOutputStream(adminfile);
           ObjectOutputStream os1=new ObjectOutputStream(fs1);
           AdminId=1;
           Admin a=new Admin(jTextField3.getText(),jTextField1.getText(),bday,jTextField2.getText(),jTextField6.getText(),jTextField7.getText(),0,AdminId);
           list.add(a);
           os1.writeObject(list);
           os1.close();
           
       }
       
       else{
           FileInputStream fs=new FileInputStream(adminfile);
           ObjectInputStream os=new ObjectInputStream(fs);
           
           list=(ArrayList<Admin>)os.readObject();
           AdminId=list.size();
           Admin a=new Admin(jTextField3.getText(),jTextField1.getText(),bday,jTextField2.getText(),jTextField6.getText(),jTextField7.getText(),0,AdminId);
           list.add(a);
           os.close();
           FileOutputStream fs1=new FileOutputStream(adminfile);
           ObjectOutputStream os1=new ObjectOutputStream(fs1);
           os1.writeObject(list);
           os1.close();
        }
       
        
        }
        
        catch(Exception ex){
        JOptionPane.showMessageDialog(this,"File not found !");
        ex.printStackTrace();
        }
        
        
       
        
        
        
        
        
        String password;
        password=jTextField6.getText();
        JOptionPane.showMessageDialog(this,
        "You have been successfully registered."+"\nUsername: "+AdminId+"\nPassword: "+password+"\nYou will be redirected to Log In page...");
        this.setVisible(false);
        NewJFrame n=new NewJFrame();
        n.setVisible(true);
        }
        
        else{
            if(validate_no(contact_no)&&!validate_mail(mail_id))
            JOptionPane.showMessageDialog(this,"Please enter valid mail id !");
            
            else if(!validate_no(contact_no)&&validate_mail(mail_id))
            JOptionPane.showMessageDialog(this,"Please enter valid contact number !");
            
            else if(!validate_no(contact_no)&&!validate_mail(mail_id))
            JOptionPane.showMessageDialog(this,"Please enter valid contact number and mail id !");
        }   
        
        }
            
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
