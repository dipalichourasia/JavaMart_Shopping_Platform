package com.tka.shop_menu;

import java.util.Scanner;

import com.tka.shop_menu.Login_Menu;
import com.tka.shop_menu.Purchase;

public class Login_Menu {

	static String unm,password;
	
	public static void check()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter unm");
		unm=sc.next();
		System.out.println("ENter password");
		password=sc.next();
//		conditional statement
		
		if(unm.equals("A")&&password.equals("AA"))
		{
			System.out.println("U r a valid user!! Proceed for purchase");
		Purchase.purchase_product();			
		}
		else
		{
			 System.out.println("U r an invalid user!! cannot purchase");
			 System.out.println("Try Again");
			 check();
		}
			
	}
	
	

}
