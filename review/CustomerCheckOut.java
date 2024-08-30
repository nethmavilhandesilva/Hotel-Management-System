import java.sql.*;
import Project.*;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class CustomerCheckOut extends javax.swing.JFrame {

   
    public CustomerCheckOut() {
        initComponents();
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextField8.setEditable(false);
        jTextField9.setEditable(false);
    }
    int id=0;
    String Query;
    String roomType;
    String bed;
    String roomNo;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Customer Check Out.png"))); // NOI18N
        jLabel1.setText("Customer CheckOut");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 6, 194, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1229, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Room Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 87, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 84, 159, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 84, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "MobileNumber", "Nationality", "Gender", "Email", "ID Proof", "Address", "CheckInDate", "RoomNumber", "Bed", "Room Type", "PricePerDay"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 350, 1250, 230));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Customer Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 129, -1, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 167, 284, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Check In Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 129, -1, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 167, 250, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Check Out Date(Today)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 129, -1, -1));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 167, 252, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Customer Mobile Number");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(965, 129, -1, -1));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(944, 167, 251, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Price Per Day");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 211, -1, -1));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 250, 284, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Number of Days Stayed");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 211, -1, -1));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 250, 250, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Total Amount to Collect From Customer");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 211, -1, -1));

        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 252, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Email");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(944, 211, -1, -1));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(944, 250, 251, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("CheckOut");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 313, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 313, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/all pages background.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    setVisible(false);    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
    ResultSet rs=Project.Select.getData("select*from customer where checkOut is NULL");
    DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
    try{
        while(rs.next())
        {
            model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(12)});
        }
        rs.close();
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_formComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String roomNo=jTextField1.getText();
    try{
        ResultSet rs=Project.Select.getData("select*from customer where roomNo='"+roomNo+"'and checkout is NULL");
        if(rs.next())
        {
            jTextField1.setEditable(false);
            id=rs.getInt(1);
            jTextField2.setText(rs.getString(2));
            jTextField3.setText(rs.getString(9));
            jTextField5.setText(rs.getString(3));
            jTextField6.setText(rs.getString(13));
            
            SimpleDateFormat myFormat=new SimpleDateFormat("yyyy/MM/dd");
            Calendar cal=Calendar.getInstance();
            jTextField4.setText(myFormat.format(cal.getTime()));
            String dateBeforeString=rs.getString(9);
            java.util.Date dateBefore=myFormat.parse(dateBeforeString);
            String dateAfterStrig=myFormat.format(cal.getTime());
            java.util.Date dateAfter=myFormat.parse(dateAfterStrig);
            long difference=dateAfter.getTime()-dateBefore.getTime();
            int noOfDayStay=(int)(difference/(1000*60*60*24));
            if(noOfDayStay==0)
                noOfDayStay=1;
                
            jTextField7.setText(String.valueOf(noOfDayStay));
            float price=Float.parseFloat( jTextField6.getText());
             jTextField8.setText(String.valueOf(noOfDayStay*price));
             jTextField9.setText(rs.getString(6));
             roomType=rs.getString(12);
             bed=rs.getString(11);
                
            
        }
        else
            JOptionPane.showMessageDialog(null,"Room Number Is Not Booked Or Room Number Doesnot Exist");
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    setVisible(false);
    new CustomerCheckOut().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String name= jTextField2.getText();
    String mobileNumber= jTextField5.getText();
    String email= jTextField9.getText();
    
    String checkOut= jTextField4.getText();
    String numberOfDaysStay= jTextField7.getText();
    String totalAmount= jTextField8.getText();
    roomNo= jTextField1.getText();
    Query="update customer set numberOfDaysStay='"+numberOfDaysStay+"',totalAmount='"+totalAmount+"',checkout='"+checkOut+"'where id='"+id+"'";
    Project.InsertUpdateDelete.setData(Query,"");
    Query="update room set Status='Not Booked'where roomNo='"+roomNo+"'";
    Project.InsertUpdateDelete.setData(Query,"");
    String path="C:\\Users\\Sadini Kavindya\\Desktop\\NVDS CODING";
    com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
    try{
        PdfWriter .getInstance(doc,new FileOutputStream(path+""+id+".pdf"));
        doc.open();
        Paragraph paragraph1=new  Paragraph("                                                   NVDS HOTEL MANAGEMENT SYSTEM\n");
        doc.add(paragraph1);
        Paragraph paragraph2=new  Paragraph("*********************************************************************************************************");
        doc.add(paragraph2);
        Paragraph paragraph3=new  Paragraph("\tBill ID: "+id+"\nCustomer Details:\nName: "+name+"\nMobile Number:"+mobileNumber+"\nEmail: "+email+"\n");
        doc.add(paragraph3);
        doc.add(paragraph2);
        Paragraph paragraph4=new  Paragraph("\tRoom Details:\nNumber: "+jTextField1.getText()+"\nRoom Type:"+roomType+"\nBed: "+bed+"\nPrice Per Day:"+jTextField6.getText()+"");
        doc.add(paragraph4);
        doc.add(paragraph2);
        PdfPTable tb1=new PdfPTable(4);
        tb1.addCell("Check In Date:"+jTextField3.getText());
        tb1.addCell("Check Out Date:"+checkOut);
        tb1.addCell("No Of Days Stay:"+numberOfDaysStay);
        tb1.addCell("Total Amount Paid:"+totalAmount);
        doc.add(tb1);
        doc.add(paragraph2);
        Paragraph paragraph5=new  Paragraph("Thank You Plrase Visit Again(NVDS)");
        doc.add(paragraph5);
         
        
        
        
        
        
        
        
        
     doc.close();    
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }finally {
    
    int a=JOptionPane.showConfirmDialog(null,"Do You Want To Print Bill","Select",JOptionPane.YES_NO_OPTION);
    if(a==0){
        try{
            if((new File("C:\\Users\\Sadini Kavindya\\Desktop\\NVDS CODING"+id+".pdf")).exists()){
                Process p=Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler C:\\Users\\Sadini Kavindya\\Desktop\\NVDS CODING"+id+".pdf ");
            }
            else
                System.out.println("File Doesnot Exists");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    setVisible(false);
    new CustomerCheckOut().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
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
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerCheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
