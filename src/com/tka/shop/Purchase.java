package com.tka.shop;

import java.util.Scanner;

import com.tka.shop_product.AllProducts;

public class Purchase {

	public static int bamt;
	public static int purchase_product()
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
		return bamt;
	}
	
}
