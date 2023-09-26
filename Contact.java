package projectCSC212;

import java.util.Scanner;


public class Contact implements Comparable<String> {
 private String contactName;
 private String PhoneNum;
 private String email;
 private String address;
 private String  birthday;
 private String notes;
 
     public Contact(){
     }
    public Contact(String contactName, String PhoneNum, String email, String address, String birthday, String notes) {
        this.contactName = contactName;
        this.PhoneNum = PhoneNum;
        this.email = email;
        this.address = address;
        this.birthday = birthday;
        this.notes = notes;
    }
    public Contact (Contact c){
        this.contactName = c.contactName;
        this.PhoneNum = c.PhoneNum;
        this.email =c.email;
        this.address = c.address;
        this.birthday = c.birthday;
        this.notes = c.notes;
    
    
    }
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getContactName() {
        return contactName;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getNotes() {
        return notes;
    }  

    @Override
    public int compareTo(String o) {
       
     return contactName.compareTo(o);
        
    }
 
    public int compareTo(Contact c) {
       
     return contactName.compareTo(c.contactName);
    }
        
 public void contactInfo(){
  Scanner input = new Scanner(System.in) ;
     System.out.print("Enter the contact's name:");   
     contactName=input.nextLine();
     System.out.print("Enter the contact's phone number:");
     PhoneNum=input.nextLine();
     System.out.print("Enter the contact's email address:");
     email=input.nextLine();
     System.out.print("Enter the contact's address:");
     address=input.nextLine();
     System.out.print("Enter the contact's birthday:");
     birthday=input.nextLine();
     System.out.print("Enter any notes for the contact:");
     notes=input.nextLine();
      
 }
 public String toString() {
        return "Contact{" + "contactName=" + contactName + ", PhoneNum=" + PhoneNum + ", email=" + email +
                ", address=" + address + ", birthday=" + birthday + ", notes=" + notes + '}';
    }
 
}

