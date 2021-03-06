//Author: Gulce Cansu Seckin
//Date: 04/03/2021
//Github: Cansu-Seckin

public class CryptoProgram {
public static void main(String [] args) {
	System.out.println(" -----------Welcome To The Crypto Program----------- ");
	
	//A messages object is created with its inputs inside
	Messages inputs=new Messages(789 ,"Cansu");
	inputs.show_message();
	inputs.get_receiver("Gulce");
	inputs.create_SecretKey(9);
	inputs.get_message("\n\n                 I heard we are taking common courses, if you want we can study together. "
			+ "I am sure we can be a great team.", "\n\n                 fhuih6336$$$bw4472%^&&e62677538*&&^huhdhwhdh5"
					+ "6642172%^%^%^8577575fhggghe426$$$&uwfhfyf462744hfhfu&^**&&g*");
	inputs.save_message();
	
	
	
	
	
	
}
}
