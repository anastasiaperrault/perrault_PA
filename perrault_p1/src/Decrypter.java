// create "decrypter" class
public class Decrypter
{
	// create method to decrypt encrypted number
	public String decrypt(String number)
	{
		String sevenString = "";
		
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
			sevenString = sevenString + n;
		}
		
		// swap the 1st with 3rd and 2nd with 4th digit
		String decrypt = sevenString.charAt(2) +""+sevenString.charAt(3)+""+sevenString.charAt(0)+""+sevenString.charAt(1)+"";
		
		
		//return message
		return decrypt;
	
	}
}