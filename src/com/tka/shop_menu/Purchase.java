package com.tka.shop_menu;

import java.util.Scanner;
import com.tka.shop_product.AllProducts;

public class Purchase {

	public static int bamt;
	public static void purchase_product()
	{
		int ch=1,gtot=0;
		do
		{
			
		AllProducts.getProducts_cost();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter productnm");
		String pnm=sc.next();
		System.out.println("ENter qty");
		int qty=sc.nextInt();
		
		switch(pnm)
		{
		
		case "Book":
		{
			bamt=qty*AllProducts.prod1_cost;
			break;
		}
		case "KeyBoard":
		{
			bamt=qty*AllProducts.prod2_cost;
			break;
		}
		case "Mobile":
		{
			bamt=qty*AllProducts.prod3_cost;
		}
		}
		System.out.println("Bill Amt"+bamt);
	
		System.out.println("Do u want to continue press 1");
		ch=sc.nextInt();
		gtot=gtot+bamt;
		
	}while(ch==1);
		System.out.println("Grand Total="+gtot);
	}
}
