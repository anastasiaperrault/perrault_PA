// create an Encrypter class
public class Encrypter 
{
	// create a method "encrypt" to encrypt given number
	public String encrypt(String number)
	{
		String subtractString = "";
		
		// for loop to loop through string
		for(int i = 0; i< number.length(); i++)
		{
			// add 7 to EACH digit get their remainder w/ divided by 10
			int n = ((Integer.parseInt(number.charAt(i)+""))+7)%10;
			
			// convert digit to string
			subtractString = subtractString + n;
		}
		
		// swap 1st with 3rd and 2nd digit with 4th
		String encryptedmessage = subtractString.charAt(2) +""+subtractString.charAt(3)+""+subtractString.charAt(0)+""+subtractString.charAt(1)+"";
		
		// return message
		return encryptedmessage;
		
	}
}