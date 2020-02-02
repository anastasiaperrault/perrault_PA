import java.util.Scanner;

//  create public class BMICalculator
public class BMICalculator 
{
	private double setWeight;
	private double setHeight;
	public double getBmi;
	private int choice;
	public String getBmiCategory;

	public void readUserData()
	{
		// Scanner object to get inputs from user
		Scanner sc = new Scanner(System.in);
	
	
		while(true)
		{
			//getting input from user
			System.out.println("1. Weight/pounds and height/inches");
			System.out.println("2. Weight/Kilograms and height/meters\n\n Enter what you would like to find out(1 or 2):");
		
			choice = sc.nextInt();
		
			//if user chooses 1 get input for pounds & inches
			if(choice == 1)
			{
				System.out.print("Enter weight in pounds:");
				
				setWeight = sc.nextDouble();
				
				// if user chooses negative value exit program
				if(setWeight < 0)
				{
					System.out.print("Invalid. No negatives allowed. EXITING");
					System.exit(0);
				}
				
				// prompt user to enter height in inches
				System.out.print("Enter height in inches");
			
				setHeight = sc.nextDouble();
				
				// if user chooses negative value exit program
				if(setHeight < 0)
				{
					System.out.print("Invalid. No negatives. EXIT");
					System.exit(0);
				}
			
				break;
			}			
			//if user chooses option 2 enter weight in kg and height in meters
			else if(choice == 2)
			{
				System.out.print("Enter Weight in kilograms:");
				
				setWeight = sc.nextDouble();
				
				// exit program if negative number is given
				if(setWeight < 0)
				{
					System.out.print("Invalid. No negatives. EXIT");
					System.exit(0);
				}
			 
				System.out.print("Enter the height in meters:");
				
				setHeight = sc.nextDouble();
				
				// exit program if negative number is given
				if(setHeight < 0)
				{
					System.out.print("Invalid. No negatives. EXIT");
					System.exit(0);
				}
			 
				break;
			}
			// if any other number chosen besides 1 or 2 print invalid
			else
			{
				System.out.println("***Invalid Choice***");
				continue;
			}
			
		}

	}

	// create method to calculate BMI
	public void calculateBmi()
	{
		if(choice == 1)
		{
			getBmi = (setWeight * 703) / (setHeight * setHeight);
		}
		else
		{
			getBmi = setWeight/(setHeight*setHeight);
		}
	}
	
	// create method to display BMI
	public void displayBmi()
	{
		 String getBmiCategory = "";
		
		if(getBmi < 18.5)
		{
			getBmiCategory = "underWeight";
		}
		else if(getBmi >= 18.5 && getBmi <= 24.9)
		{
			getBmiCategory = "Normal";
		}
		else if(getBmi >= 25 && getBmi <=29.9)
		{
			getBmiCategory = "OverWeight";
		}
		else if(getBmi >= 30)
		{
			getBmiCategory = "Obese";
		}
		
		// print their BMI and state which category 
		System.out.println("Your BMI: " + getBmi);
		System.out.println("You are " + getBmiCategory);
		
	}

	// get and set instance variables
	public double getBmi() {
		return getBmi;
	}

	public void setBmi(double getBmi) {
		this.getBmi = getBmi;
	}

	public double getHeight() {
		return setHeight;
	}

	public void setHeight(double setHeight) {
		this.setHeight = setHeight;
	}

	public double getWeight() {
		return setWeight;
	}

	public void setWeight(double setweight) {
		this.setWeight = setweight;
	}

}