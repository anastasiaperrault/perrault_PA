import java.util.Scanner;

// create application class
public class Application 
{
	// create main method
	public static void main(String[] args)
	{
		// prompt user to input 4 digits
		System.out.print("Enter four digit integer: ");
		
		// scanner object to get user input
		Scanner scan = new Scanner(System.in);
		
		String number = scan.nextLine();
		
		// make sure there is #4 digits 
		if(number.length() != 4)
		{
			System.out.println("Invalid. Number must be 4 digits. Please enter a 4 digit number");
			return;
		}
		
		// create your encrypter object
		Encrypter encryption = new Encrypter();
		// call method
		String encrypt = encryption.encrypt(number);
		
		// display encrypted value
		System.out.println("The Encrypted value:" +encrypt);
		
		// create your decrypter object
		Decrypter decrypt = new Decrypter();
		//call method
		String decryption = decrypt.decrypt(encrypt);
		
		// display decrypted value
		System.out.println("The Decrypted value:"+decryption);
		
		
		
	}
}
