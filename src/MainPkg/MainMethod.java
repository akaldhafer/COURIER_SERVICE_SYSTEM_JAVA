
package MainPkg;

import CusromerPkg.CustomerRecord;
import DeliveryStaffPkg.DeliveryStaffDetails;
import OrderPkg.OrderDetails;
import SignPkg.AccessMenu;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainMethod {

    public static void main(String[] args) {
        // TODO code application logic here
        //reading the database of the application
        RefreshOrderRecords();
        RefreshDeliveryStaffRecords();
        RefreshCustomerRecords();
        AccessMenu l = new AccessMenu();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
    }
    public void run(){
        RefreshOrderRecords();
        RefreshDeliveryStaffRecords();
        RefreshCustomerRecords();
    }
    public static void RefreshOrderRecords(){
        //read the order data
        OrderDetails.getOrderlist().clear();
        try {
                try (BufferedReader reads = new BufferedReader(new FileReader("OrderRecords.txt"))) {
                    String line;
                    while ((line = reads.readLine()) != null) {

                        String[] colum = line.split(":");
                        String orderID = colum[0];
                        String StaffID = colum[1];
                        String CustomerID = colum[2];
                        String Customername = colum[3];
                        String Receivername = colum[4];
                        String ReceiverAddress = colum[5];
                        String Receiverphone = colum[6];
                        String Feedback = colum[7];
                        String Status = colum[8];
                        String payment = colum[9];
                        String rate = colum[10];
                        int Rate = Integer.parseInt(rate);
                        int Orderpayment = Integer.parseInt(payment);
                        
                        //store the data from the selected file to the order array 
                        OrderDetails or = new OrderDetails();
                        or.setOrderID(orderID);
                        or.setStaffID(StaffID);
                        or.setCustomerID(CustomerID);
                        or.setCustomerName(Customername);
                        or.setReceiverName(Receivername);
                        or.setReceiverAddress(ReceiverAddress);
                        or.setReceiverPhone(Receiverphone);
                        or.setFeedback(Feedback);
                        or.setStatus(Status);
                        or.setPayment(Orderpayment);
                        or.setRate(Rate);
                        OrderDetails.getOrderlist().add(or);
                    }
                }
            } catch (IOException a) {                
            }
    }
    public static void RefreshDeliveryStaffRecords(){
        //read the staff data
        DeliveryStaffDetails.getStafflist().clear();
        try {
            
                try (BufferedReader reads = new BufferedReader(new FileReader("DeliveryStaffRecords.txt"))) {
                    String line;
                    while ((line = reads.readLine()) != null) {

                        String[] colum = line.split(":");
                        String name = colum[0];
                        String id = colum[1];
                        String username = colum[2];
                        String password = colum[3];
                        String email = colum[4];
                        String phone = colum[5];
                        //store the data from the selected file to the staff array 
                        DeliveryStaffDetails sf = new DeliveryStaffDetails();
                        sf.setName(name);
                        sf.setId(id);
                        sf.setUsername(username);
                        sf.setPassword(password);
                        sf.setEmail(email);
                        sf.setPhonNO(phone);
                        DeliveryStaffDetails.getStafflist().add(sf);
                    }
                }
            } catch (IOException a) {                
            }
    }
    public static void RefreshCustomerRecords(){
        CustomerRecord.getCustomerlist().clear();
        //read the customer data
        try {
                try (BufferedReader reads = new BufferedReader(new FileReader("CustomerRecords.txt"))) {
                    String line;
                    while ((line = reads.readLine()) != null) {

                        String[] colum = line.split(":");
                        String name = colum[0];
                        String id = colum[1];
                        String username = colum[2];
                        String password = colum[3];
                        String email = colum[4];
                        String phone = colum[5];
                        //store the data from the selected file to the customer array 
                        CustomerRecord cs = new CustomerRecord();
                        cs.setName(name);
                        cs.setId(id);
                        cs.setUsername(username);
                        cs.setPassword(password);
                        cs.setEmail(email);
                        cs.setPhonNO(phone);
                        CustomerRecord.getCustomerlist().add(cs);
                    }
                }
            } catch (IOException a) {                
            }
    }
   
    
}
