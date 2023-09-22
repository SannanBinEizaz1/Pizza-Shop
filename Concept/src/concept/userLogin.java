package concept;

import java.util.Scanner;

public class userLogin  {
	String name;
	String email;
	String password;
	Database database = new Database();
	Scanner input= new Scanner(System.in);
	
	//Verfication of user credentials
	public void Login()
	{
		
		System.out.println("       Welcome to Login Page             ");
		System.out.println("");
		System.out.print("Please enter your user name =   ");
		email = input.nextLine();
		System.out.println("");
		if(database.checkUser(email))
		{
			System.out.println("Please enter your password =   ");
			password= input.nextLine();
			while(!database.validatePass(password))
			{
			if(database.validatePass(password))
			{
				Menu menu = new Menu();
				menu.MainMenu();
			}
			else
			{
				System.out.println("Try Password Again ");
				System.out.println("Please enter your password =   ");
				password= input.nextLine();
				
			}
			}
		}
		else
		{
			System.out.println("Try Again ");
			this.Login();
		}
	
	
			
		
	}
	
}
