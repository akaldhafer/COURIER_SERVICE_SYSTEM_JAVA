
package CusromerPkg;

import java.util.ArrayList;

public class CustomerRecord {
    private String name , username, password, email, id, phonNo;
    private static ArrayList <CustomerRecord> Customerlist = new  ArrayList <>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhonNO() {
        return phonNo;
    }

    public void setPhonNO(String phonNo) {
        this.phonNo = phonNo;
    }
    //store the details into the staff list
    public static ArrayList<CustomerRecord> getCustomerlist() {
        return Customerlist;
    }
    //Customer login function 
    public int  Customerlogin (String username, String password ){
        for (int i =0; i<CustomerRecord.getCustomerlist().size(); i++){
            if (CustomerRecord.getCustomerlist().get(i).getUsername().equals(username)&&
                    CustomerRecord.getCustomerlist().get(i).getPassword().equals(password)){
                return i;
            }      
        }
       return -1;       
    }
     public boolean search(String id) {
        for (int i = 0; i <CustomerRecord.getCustomerlist().size(); i++) {
            if (CustomerRecord.getCustomerlist().get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
      public boolean search2(String username) {
        for (int i = 0; i <CustomerRecord.getCustomerlist().size(); i++) {
            if (CustomerRecord.getCustomerlist().get(i).getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}
