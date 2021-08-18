
package OrderPkg;

import java.util.ArrayList;

public class OrderDetails {
    private String OrderID, CustomerName , ReceiverName, CustomerID, 
            ReceiverAddress, StaffID, ReceiverPhone, Feedback, Status;   
    private int payment, Rate;
    private static ArrayList <OrderDetails> Orderlist = new  ArrayList <>();

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getReceiverName() {
        return ReceiverName;
    }

    public void setReceiverName(String ReceiverName) {
        this.ReceiverName = ReceiverName;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getReceiverAddress() {
        return ReceiverAddress;
    }

    public void setReceiverAddress(String ReceiverAddress) {
        this.ReceiverAddress = ReceiverAddress;
    }

    public String getStaffID() {
        return StaffID;
    }

    public void setStaffID(String StaffID) {
        this.StaffID = StaffID;
    }

    public String getReceiverPhone() {
        return ReceiverPhone;
    }

    public void setReceiverPhone(String ReceiverPhone) {
        this.ReceiverPhone = ReceiverPhone;
    }
    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String Feedback) {
        this.Feedback = Feedback;
    }
    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }
    public int getRate() {
        return Rate;
    }

    public void setRate(int Rate) {
        this.Rate = Rate;
    }
    //store the details into the staff list
    public static ArrayList<OrderDetails> getOrderlist() {
        return Orderlist;
    }
    public boolean search(String id) {
        
        for (int i = 0; i <OrderDetails.getOrderlist().size(); i++) {
            if (OrderDetails.getOrderlist().get(i).getOrderID().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
