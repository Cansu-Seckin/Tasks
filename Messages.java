import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Messages {
//Properties
public int ID;
public String sender;
public String receiver;
public String message;
public String privateMessage;
public int secretKey;
private String userInput = "";

//Constructor
public Messages(int ID,String sender) {
this.ID=ID;
this.sender=sender;
}

//Getting the receiver of the message from the user
public void get_receiver(String receiver) {
    System.out.println(" To              : " + receiver);
}

//Getting the message and private message text
public void get_message(String message, String privatemessage) {
	System.out.println(" Message         : " + message);
	System.out.println(" Private Message : " + privatemessage);	
}

//A random integer from 0-10 is generated and assigned as a secretKey value
public void create_SecretKey(int secretkey) {
	System.out.println(" Key             : " + secretkey);
}

//The message is saved as a text file, a statement to show the success of the process is stated
public void save_message() {
    try {
        FileWriter myWriter = new FileWriter(new File(this.ID+"_"+this.sender+".txt"));
        myWriter.write(this.userInput);
        myWriter.close();
        System.out.println(" \n The document is added to the file successfully. ");
      } catch (IOException e) {
        System.out.println(" \n An error occurred.Please try again ");
        e.printStackTrace();
      }
}

//The messages and properties are printed
public void show_message() {
	String userInput= " ID              : " + this.ID + " \n From            : " + this.sender;
	System.out.println(userInput);
}
}


