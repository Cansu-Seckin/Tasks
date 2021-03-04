import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Properties
class Customer {
  
  private String name;
  private String surname;
  private String TCKN;

  private int ID;
  private int birthyear;
  private int balance;
  private int borrowedMoney;

  private String customerContent = "";

  public static Scanner information= new Scanner (System.in);

 //Constructor    
  public Customer(int ID,String name,String surname, int birthyear, String TCKN, int balance) {
      this.ID=ID;
      this.name=name;
      this.surname=surname;
      this.birthyear=birthyear;
      this.TCKN=TCKN;
      this.balance=balance;
      this.borrowedMoney = 0;
  } 
  
  //Behaviours
  //If the customer has choose to upload money to the bank
  public void upload_money(int depositamount) {

      System.out.println(" a -> customer can upload money to his/her balance ");
      this.balance += depositamount;
      System.out.println(" New balance: " + this.balance + " TL " );

  }

  //If the customer has choose to withdraw money from the bank
  public void withdraw_money(int withdrawnamount) {

      System.out.println(" b -> customer can withdraw money but he or she cannot withdraw greater than their account ");

      if(balance>=withdrawnamount) {
          this.balance -= withdrawnamount;
          System.out.println(" New balance: " + this.balance + " TL ");
      }else {
          System.out.println(this.name + " "+ this.surname + " does not have enough money!");
      }    
  }
  
  //If the customer has choose to take credit from the bank
  public void take_credit(int creditamount) {
      double creditLimit = this.balance * 2;
      System.out.println("Your credit limit is " + creditLimit);
      if(  creditLimit > creditamount ){
          System.out.println(" You took " + creditamount + " credit !!");
          this.balance += creditamount;
          this.borrowedMoney += creditamount;
      }else {
          System.out.println("You have "+ this.balance + " TL. You cannot take " 
          + creditamount +" TL !!");
      }

  }
  
  //Customer's bank details
  public void show_customer() {

      String customerContent = "\nName       : " + this.name 
      +"\nSurname    : " + this.surname 
      +"\nBirth Year : " + this.birthyear 
      +"\nTCKN       : " + this.TCKN 
      +"\nBalance    : " + this.balance;

      this.customerContent = customerContent;
      System.out.println(customerContent);
  }
  
  //Bank details are saved as a text file to be used later one
  public void save_customer_as_txt (){

      try {
          FileWriter myWriter = new FileWriter(new File(this.name+"_"+this.ID+".txt"));
          myWriter.write(this.customerContent);
          myWriter.close();
          System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }

  }
}