
/**
 * Write a description of class emailBreak here.
 * LAB03 
 * ALIYU MUHAMMAD AMINU
 * U15/FNS/CSC/038
 */
import java.util.Scanner;
public class EmailBreak
{
    public static void main(String[] args){
        Scanner userInput= new Scanner(System.in);
        String testString,emailAddress;
		boolean check;
		do {
			System.out.println("Please enter your email e.g: example@mail.com");
			emailAddress=userInput.nextLine();
			//String email_regex="[A-Z]+[a-zA-Z_]+@\b([a-zA-Z]+.) {2}\b?.[a-zA-Z]+";
			String email_regex="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
			testString=emailAddress;
			check=testString.matches(email_regex);
			if(!check) {
				System.out.println("The email : \""+emailAddress+ "\" is Invalid\n");
				//return;
			}
			
		}while(!check);
			int index=emailAddress.indexOf('@');
			String[] parts= emailAddress.split("@");
			System.out.println("\nFor the email address: "+emailAddress);
			System.out.println("The user name is   : "+emailAddress.substring(0,index)+"\nThe domain name is : "+emailAddress.substring(index+1));
			
	
    }
}
