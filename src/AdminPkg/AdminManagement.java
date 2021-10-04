
package AdminPkg;

import OrderPkg.OrderDetails;
import CusromerPkg.CustomerRecord;
import DeliveryStaffPkg.DeliveryStaffDetails;
import MainPkg.MainMethod;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class AdminManagement {
   
    // Add a new staff to the file 
    public void AddStaff(String name, String id, String username, String Password, String emailAddress,String phone) throws IOException {
        try (PrintWriter addM = new PrintWriter(new FileWriter("DeliveryStaffRecords.txt", true))) {
            addM.print(name + ":");
            addM.print(id + ":");
            addM.print(username + ":");
            addM.print(Password + ":");
            addM.print(emailAddress + ":");
            addM.println(phone);
            addM.flush();
        }
        {
            JOptionPane.showMessageDialog(null, "Staff Record addeed", "Successful Message", JOptionPane.INFORMATION_MESSAGE);
            DeliveryStaffDetails.getStafflist().clear();
            MainMethod refresh = new MainMethod();
            refresh.run();
        }
    }
    public void editStaff(int in, String name, String id,
            String username, String password, String email, String phone) throws FileNotFoundException {
        DeliveryStaffDetails.getStafflist().get(in).setName(name);
        DeliveryStaffDetails.getStafflist().get(in).setId(id);
        DeliveryStaffDetails.getStafflist().get(in).setUsername(username);
        DeliveryStaffDetails.getStafflist().get(in).setPassword(password);
        DeliveryStaffDetails.getStafflist().get(in).setEmail(email);
        DeliveryStaffDetails.getStafflist().get(in).setPhonNO(phone);
        PrintWriter update = new PrintWriter("DeliveryStaffRecords.txt");
        for (int i = 0; i < DeliveryStaffDetails.getStafflist().size(); i++) {
            update.println(DeliveryStaffDetails.getStafflist().get(i).getName() + ":"
                    + DeliveryStaffDetails.getStafflist().get(i).getId() + ":"
                    + DeliveryStaffDetails.getStafflist().get(i).getUsername() + ":"
                    + DeliveryStaffDetails.getStafflist().get(i).getPassword() + ":"
                    + DeliveryStaffDetails.getStafflist().get(i).getEmail() + ":"
                    + DeliveryStaffDetails.getStafflist().get(i).getPhonNO());
        }
        update.flush();
        update.close();
        DeliveryStaffDetails.getStafflist().clear();
        MainMethod refresh = new MainMethod();
        refresh.run();
        JOptionPane.showMessageDialog(null, "Staff Record updated", "Successful Message", JOptionPane.INFORMATION_MESSAGE);
    }
     public void DeleteStaff(int remove) throws FileNotFoundException {
        DeliveryStaffDetails.getStafflist().remove(remove);
        try (PrintWriter update = new PrintWriter("DeliveryStaffRecords.txt")) {
            for (int i = 0; i < DeliveryStaffDetails.getStafflist().size(); i++) {
                update.println(DeliveryStaffDetails.getStafflist().get(i).getName() + ":"
                        + DeliveryStaffDetails.getStafflist().get(i).getUsername() + ":"
                        + DeliveryStaffDetails.getStafflist().get(i).getPassword() + ":"
                        + DeliveryStaffDetails.getStafflist().get(i).getId() + ":"
                        + DeliveryStaffDetails.getStafflist().get(i).getEmail() + ":"
                        + DeliveryStaffDetails.getStafflist().get(i).getPhonNO());
            }
            update.flush();
            update.close();
        }
        JOptionPane.showMessageDialog(null, "Staff Record Deleted", "Successful Message", JOptionPane.INFORMATION_MESSAGE);
    }
    public int staffsearch(String id) {
        for (int i = 0; i < DeliveryStaffDetails.getStafflist().size(); i++) {
            if (DeliveryStaffDetails.getStafflist().get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
    
    /***************/
     // Add a new Customer to the file 
    public void AddCustomer(String name, String id, String username, String Password, String emailAddress,String phone) throws IOException {
        try (PrintWriter addM = new PrintWriter(new FileWriter("CustomerRecords.txt", true))) {
            addM.print(name + ":");
            addM.print(id + ":");
            addM.print(username + ":");
            addM.print(Password + ":");
            addM.print(emailAddress + ":");
            addM.println(phone);
            addM.flush();
            addM.close();
        }
        {
            JOptionPane.showMessageDialog(null, "Customer Record addeed", "Successful Message", JOptionPane.INFORMATION_MESSAGE);
            CustomerRecord.getCustomerlist().clear();
            MainMethod refresh = new MainMethod();
            refresh.run();
        }
    }
    public void editCustomer(int in, String name, String id,
            String username, String password, String email, String phone) throws FileNotFoundException {
        CustomerRecord.getCustomerlist().get(in).setName(name);
        CustomerRecord.getCustomerlist().get(in).setId(id);
        CustomerRecord.getCustomerlist().get(in).setUsername(username);
        CustomerRecord.getCustomerlist().get(in).setPassword(password);
        CustomerRecord.getCustomerlist().get(in).setEmail(email);
        CustomerRecord.getCustomerlist().get(in).setPhonNO(phone);

        PrintWriter update = new PrintWriter("CustomerRecords.txt");
        for (int i = 0; i < CustomerRecord.getCustomerlist().size(); i++) {
            update.println(CustomerRecord.getCustomerlist().get(i).getName() + ":"
                    + CustomerRecord.getCustomerlist().get(i).getId() + ":"
                    + CustomerRecord.getCustomerlist().get(i).getUsername() + ":"
                    + CustomerRecord.getCustomerlist().get(i).getPassword() + ":"
                    + CustomerRecord.getCustomerlist().get(i).getEmail() + ":"
                    + CustomerRecord.getCustomerlist().get(i).getPhonNO());
          
        }
         update.flush();
         update.close();
        CustomerRecord.getCustomerlist().clear();
        MainMethod refresh = new MainMethod();
        refresh.run();
        JOptionPane.showMessageDialog(null, "Customer Record updated", "Successful Message", JOptionPane.INFORMATION_MESSAGE);
    }
     public void DeleteCustomer(int remove) throws FileNotFoundException {
        CustomerRecord.getCustomerlist().remove(remove);
        try (PrintWriter update = new PrintWriter("CustomerRecords.txt")) {
            for (int i = 0; i < CustomerRecord.getCustomerlist().size(); i++) {
                update.println(CustomerRecord.getCustomerlist().get(i).getName() + ":"
                        + CustomerRecord.getCustomerlist().get(i).getUsername() + ":"
                        + CustomerRecord.getCustomerlist().get(i).getPassword() + ":"
                        + CustomerRecord.getCustomerlist().get(i).getId() + ":"
                        + CustomerRecord.getCustomerlist().get(i).getEmail() + ":"
                        + CustomerRecord.getCustomerlist().get(i).getPhonNO());
            }
            update.flush();
            update.close();
        }
        JOptionPane.showMessageDialog(null, "Customer Record has been Deleted successfully", "Successful Message", JOptionPane.INFORMATION_MESSAGE);
    }
    public int searchCustomer(String id) {
        for (int i = 0; i < CustomerRecord.getCustomerlist().size(); i++) {
            if (CustomerRecord.getCustomerlist().get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
    
    /***************/
     // Add a new Order to the file 
    public void AddOrder(String orderID, String CustomerName, String ReceiverName,
            String SenderID, String StaffID,String ReceiverPhone, 
            String ReceiverAddress, String Feedback,String Status, 
            int Payment, int Rate) throws IOException {
        try (PrintWriter addM = new PrintWriter(new FileWriter("OrderRecords.txt", true))) {
            addM.print(orderID + ":");
            addM.print(StaffID + ":");
            addM.print(SenderID + ":");
            addM.print(CustomerName + ":");
            addM.print(ReceiverName + ":");            
            addM.print(ReceiverAddress + ":");
            addM.print(ReceiverPhone + ":");
            addM.print(Feedback + ":");
            addM.print(Status + ":");
            addM.print(Payment+":");
            addM.println(Rate);
            addM.flush();
            addM.close();
        }
        {
            JOptionPane.showMessageDialog(null, "Order Record addeed", "Successful Message", JOptionPane.INFORMATION_MESSAGE);
            OrderDetails.getOrderlist().clear();
            MainMethod refresh = new MainMethod();
            refresh.run();
        }
    }
    public void editOrder(int in, String orderID, String CustomerName, String ReceiverName,
            String CustomerID, String StaffID,String ReceiverPhone, 
            String ReceiverAddress, String Feedback, 
            String Status, int Payment, int Rate) throws FileNotFoundException {
            OrderDetails.getOrderlist().get(in).setOrderID(orderID);
            OrderDetails.getOrderlist().get(in).setStaffID(StaffID);
            OrderDetails.getOrderlist().get(in).setCustomerID(CustomerID);
            OrderDetails.getOrderlist().get(in).setCustomerName(CustomerName);
            OrderDetails.getOrderlist().get(in).setReceiverName(ReceiverName);
            OrderDetails.getOrderlist().get(in).setReceiverAddress(ReceiverAddress);
            OrderDetails.getOrderlist().get(in).setReceiverPhone(ReceiverPhone);
            OrderDetails.getOrderlist().get(in).setFeedback(Feedback);
            OrderDetails.getOrderlist().get(in).setStatus(Status);
            OrderDetails.getOrderlist().get(in).setPayment(Payment);
            OrderDetails.getOrderlist().get(in).setRate(Rate);
        

        PrintWriter update = new PrintWriter("OrderRecords.txt");
        for (int i = 0; i < OrderDetails.getOrderlist().size(); i++) {
            update.println(OrderDetails.getOrderlist().get(i).getOrderID() + ":"
                    + OrderDetails.getOrderlist().get(i).getStaffID() + ":"
                    + OrderDetails.getOrderlist().get(i).getCustomerID() + ":"
                    + OrderDetails.getOrderlist().get(i).getCustomerName() + ":"
                    + OrderDetails.getOrderlist().get(i).getReceiverName() + ":"
                    + OrderDetails.getOrderlist().get(i).getReceiverAddress() + ":"
                    + OrderDetails.getOrderlist().get(i).getReceiverPhone() + ":"
                    + OrderDetails.getOrderlist().get(i).getFeedback() + ":"
                    + OrderDetails.getOrderlist().get(i).getStatus()+":"
                    + OrderDetails.getOrderlist().get(i).getPayment()+":"
                    + OrderDetails.getOrderlist().get(i).getRate());
           
        }
        update.flush();
        update.close();
        OrderDetails.getOrderlist().clear();
        MainMethod refresh = new MainMethod();
        refresh.run();
        JOptionPane.showMessageDialog(null, "Order Record updated", "Successful Message", JOptionPane.INFORMATION_MESSAGE);
    }
    
     public void DeleteOrder(int remove) throws FileNotFoundException {
       OrderDetails.getOrderlist().remove(remove);
        try (PrintWriter update = new PrintWriter("OrderRecords.txt")) {
            for (int i = 0; i < OrderDetails.getOrderlist().size(); i++) {
                update.println(OrderDetails.getOrderlist().get(i).getOrderID() + ":"
                    + OrderDetails.getOrderlist().get(i).getStaffID() + ":"
                    + OrderDetails.getOrderlist().get(i).getCustomerID() + ":"
                    + OrderDetails.getOrderlist().get(i).getCustomerName() + ":"
                    + OrderDetails.getOrderlist().get(i).getReceiverName() + ":"
                    + OrderDetails.getOrderlist().get(i).getReceiverAddress() + ":"
                    + OrderDetails.getOrderlist().get(i).getReceiverPhone() + ":"
                    + OrderDetails.getOrderlist().get(i).getFeedback() + ":"
                    + OrderDetails.getOrderlist().get(i).getStatus()+":"
                    + OrderDetails.getOrderlist().get(i).getPayment()+":"
                    + OrderDetails.getOrderlist().get(i).getRate());
            }
            update.flush();
            update.close();
        }
        JOptionPane.showMessageDialog(null, "Order Record Deleted", "Successful Message", JOptionPane.INFORMATION_MESSAGE);
    }
    public int searchOrder(String id) {
        for (int i = 0; i < OrderDetails.getOrderlist().size(); i++) {
            if (OrderDetails.getOrderlist().get(i).getOrderID().equals(id)) {
                return i;
            }
        }
        return -1;
    }
    public int searchOrder2(String oid, String sid) {
        for (int i = 0; i < OrderDetails.getOrderlist().size(); i++) {
            if (OrderDetails.getOrderlist().get(i).getOrderID().equals(oid)
                    &&OrderDetails.getOrderlist().get(i).getStaffID().equals(sid)) {
                return i;
            }
        }
        return -1;
    }
}
