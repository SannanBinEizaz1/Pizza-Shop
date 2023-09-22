/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concept;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author sannan bin eizaz
 */
public class Concept {

	public static void main(String[] args) {
		
		
		SplashScreen();
		
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		userLogin userlog= new userLogin();
		userlog.Login();
		

	}
	
	
	
	
	
	
	public static void SplashScreen()
	{
		System.out.println("**************************************************************************");
		System.out.println("*                                                                        *");
		System.out.println("*              WELCOME                                                   *");
		System.out.println("*                        TO                                              *");
		System.out.println("*                                                                        *");
		System.out.println("*                             PIZZA                                      *");
		System.out.println("*                                                                        *");
		System.out.println("*                                      SHOP                              *");
		System.out.println("*                                                                        *");
		System.out.println("*                                                                        *");
		System.out.println("*                                                                        *");
		System.out.println("**************************************************************************");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}

}
