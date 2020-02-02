// create "decrypter" class
public class Decrypter
{
	// create method to decrypt encrypted number
	public String decrypt(String number)
	{
		String subtractString = "";
		
		// for loop to lop through the string 
		for(int i = 0; i< number.length(); i++)
		{
			// subtract each digit by 7 to decrypt
			int n = ((Integer.parseInt(number.charAt(i)+""))-7);
			
			// if n is less than 10 add 10
			if(n<0)
			{	
				n+=10;
			}
			
			// convert to a string
			subtractString = subtractString + n;
		}
		
		// swap the 1st with 3rd and 2nd with 4th digit
		String decrypt = subtractString.charAt(2) +""+subtractString.charAt(3)+""+subtractString.charAt(0)+""+subtractString.charAt(1)+"";
		
		
		//return message
		return decrypt;
	
	}
}