//Author: Gulce Cansu Seckin
//Date: 12/02/2021
//Github: Cansu-Seckin

import java.util.Scanner;
public class BankAccount {

public static void main(String [] args) {
    System.out.println(" !! Bank Account Program !! ");

    //Create a customer object
    //Customer's ID, name and surname, year of birth,TCKN and balance
    Customer c1 =new Customer(786668,"Cansu","Seckin", 2001, "123123123123", 97);
    c1.show_customer();
    c1.upload_money(150);
    c1.show_customer();
    c1.take_credit(320);
    c1.withdraw_money(200);
    
    //Customer's information is saved
    c1.save_customer_as_txt();

}
}