package com.organic;
import java.util.Scanner;
public class Store 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
 int sum_apple;
 int Sum_Apple_2;
 int sum_apple_3;
	
	   System.out.println("=======Welcome To Organic Store======");
	   System.out.println("-------------------------------------");
	   System.out.println("Available products in the store");
	   System.out.println("1. Electronics");
	   System.out.println("2. Fruits");
	   System.out.println("3. Vegetables");
	   System.out.println("4. Cosmetics");
	   System.out.println();
	   System.out.println("please enter your choice ?");
	   System.out.println("-------------------------------------");
       int a=sc.nextInt();
       System.out.println("-------------------------------------");
       switch(a)
       {
          case 1:
    	    System.out.println("101-----Headphones-------- 1 piece is 500");
    	    System.out.println("102-----Speakers-----------1 piece is 1000");
    	    System.out.println("103-----Mobile-------------1 pieceis 5000");
           	System.out.println("104-----Powerbank----------1 piece is 2000");
    	    System.out.println("105-----Laptop-------------1 piece is 30000");
    	    break;
          case 2:
        	     System.out.println("201-----Apple--------1 dozen is 100");
               	  System.out.println("202-----Mango--------1 dozen is 120");
    	          System.out.println("203-----Banana-------1 dozen is 60");
    	          System.out.println("204-----Grapes-------1 kg is 120");
    	          System.out.println("205-----Pineapple----1 kg is 140");
    	          System.out.println("-------------------------------------");
             	  System.out.println("Please Choose Your product code");
             	  int b=sc.nextInt();
             	  switch(b)
             	  	{
             	  		case 201:
             	  			System.out.println("Apple is good choice, How many dozen you want ? ");
    		int a1=sc.nextInt();
    		//int sum_apple;
    		//sum_apple=0;
    		sum_apple=a1*100;
    		double Apple_discount;
    		Apple_discount=sum_apple*0.1;
    		double Apple_final_bill;
    		Apple_final_bill=sum_apple-Apple_discount;
    		System.out.println("If you want to continue with the shopping press 1");
    		System.out.println("If you want to exit press 2");
    		int d=sc.nextInt();
    		switch(d)
    		{
    		case 1:
    			System.out.println("Available products in the store");
    			System.out.println("1. Electronics");
    			System.out.println("2. Fruits");
    			System.out.println("3. Vegetables");
    			System.out.println("4. Cosmetics");
    			System.out.println("-------------------------------------");
    			System.out.println("please enter your choice ?");
    			System.out.println("-------------------------------------");
    			int e_a1=sc.nextInt(); 
    			switch(e_a1)
    			{
    			case 2:
    				new Store().m2();
    				return;
    			}
    			
    		case 2:
    			System.out.println("=========================================");
    			System.out.println("=======Welcome To Organic Store===========");
    			System.out.println("Total bill of your purchased item is:"+sum_apple);
    			System.out.println("You received a discount of 10% : "+Apple_discount);
    			System.out.println("Final bill is :"+Apple_final_bill);
    			System.out.println("=========Thankyou for shopping you saved "+Apple_discount+"rs"+"===========");
    			System.out.println("=======================Java Is Awesome===============================");
    			return;
    		
    		
    		}
    	 case 202:
    		System.out.println("Mango is good choice, How many dozen you want ? ");
    		int m1=sc.nextInt();
    		int sum_mango;
    		sum_mango=m1*120;
    		double mango_discount;
    		mango_discount=sum_mango*0.1;
    		double mango_final_bill;
    		mango_final_bill=sum_mango-mango_discount;
    		System.out.println("If you want to continue with the shopping press 1");
    		System.out.println("If you want to exit press 2");
    		int m_d=sc.nextInt();
    		switch(m_d)
    		{
    		case 1:
    			System.out.println("Available products in the store");
    			System.out.println("1. Electronics");
    			System.out.println("2. Fruits");
    			System.out.println("3. Vegetables");
    			System.out.println("4. Cosmetics");
    			System.out.println("please enter your choice ?");
    			System.out.println("-------------------------------------");
    			int m_e=sc.nextInt(); 
    			
    		case 2:
    			System.out.println("=========================================");
    			System.out.println("=======Welcome To Organic Store===========");
    			System.out.println("Total bill of your purchased item is:"+sum_mango);
    			System.out.println("You received a discount of 10% : "+mango_discount);
    			System.out.println("Final bill is :"+mango_final_bill);
    			System.out.println("=========Thankyou for shopping you saved "+mango_discount+"rs"+"===========");
    			System.out.println("=======================Java Is Awesome===============================");
    			break;
    	}
    	case 203:
    		System.out.println("Banana is good choice, How many dozen you want ? ");
    		int B1=sc.nextInt();
    		int sum_B;
    		sum_B=B1*60;
    		double B_discount;
    		B_discount=sum_B*0.1;
    		double B_final_bill;
    		B_final_bill=sum_B-B_discount;
    		System.out.println("If you want to continue with the shopping press 1");
    		System.out.println("If you want to exit press 2");
    		int B_d=sc.nextInt();
    		switch(B_d)
    		{
    		case 1:
    			System.out.println("Available products in the store");
    			System.out.println("1. Electronics");
    			System.out.println("2. Fruits");
    			System.out.println("3. Vegetables");
    			System.out.println("4. Cosmetics");
    			System.out.println("please enter your choice ?");
    			System.out.println("-------------------------------------");
    			int m_e=sc.nextInt(); 
    			
    		case 2:
    			System.out.println("=========================================");
    			System.out.println("=======Welcome To Organic Store===========");
    			System.out.println("Total bill of your purchased item is:"+sum_B);
    			System.out.println("You received a discount of 10% : "+B_discount);
    			System.out.println("Final bill is :"+B_final_bill);
    			System.out.println("=========Thankyou for shopping you saved "+B_discount+"rs"+"===========");
    			System.out.println("=======================Java Is Awesome===============================");
    			break;
    	}
    	case 204:
    		System.out.println("Grapes is good choice, How many dozen you want ? ");
    		int G1=sc.nextInt();
    		int sum_G;
    		sum_G=G1*120;
    		double G_discount;
    		G_discount=sum_G*0.1;
    		double G_final_bill;
    		G_final_bill=sum_G-G_discount;
    		System.out.println("If you want to continue with the shopping press 1");
    		System.out.println("If you want to exit press 2");
    		int G_d=sc.nextInt();
    		switch(G_d)
    		{
    		case 1:
    			System.out.println("Available products in the store");
    			System.out.println("1. Electronics");
    			System.out.println("2. Fruits");
    			System.out.println("3. Vegetables");
    			System.out.println("4. Cosmetics");
    			System.out.println("please enter your choice ?");
    			System.out.println("-------------------------------------");
    			int m_e=sc.nextInt(); 
    			
    		case 2:
    			System.out.println("=========================================");
    			System.out.println("=======Welcome To Organic Store===========");
    			System.out.println("Total bill of your purchased item is:"+sum_G);
    			System.out.println("You received a discount of 10% : "+G_discount);
    			System.out.println("Final bill is :"+G_final_bill);
    			System.out.println("=========Thankyou for shopping you saved "+G_discount+"rs"+"===========");
    			System.out.println("=======================Java Is Awesome===============================");
    			break;
    	}
    	case 205:
    		System.out.println("Pineapple is good choice, How many dozen you want ? ");
    		int P1=sc.nextInt();
    		int sum_P;
    		sum_P=P1*140;
    		double P_discount;
    		P_discount=sum_P*0.1;
    		double P_final_bill;
    		P_final_bill=sum_P-P_discount;
    		System.out.println("If you want to continue with the shopping press 1");
    		System.out.println("If you want to exit press 2");
    		int P_d=sc.nextInt();
    		switch(P_d)
    		{
    		case 1:
    			System.out.println("Available products in the store");
    			System.out.println("1. Electronics");
    			System.out.println("2. Fruits");
    			System.out.println("3. Vegetables");
    			System.out.println("4. Cosmetics");
    			System.out.println("please enter your choice ?");
    			System.out.println("-------------------------------------");
    			int p_e=sc.nextInt(); 
    			
    		case 2:
    			System.out.println("=========================================");
    			System.out.println("=======Welcome To Organic Store===========");
    			System.out.println("Total bill of your purchased item is:"+sum_P);
    			System.out.println("You received a discount of 10% : "+P_discount);
    			System.out.println("Final bill is :"+P_final_bill);
    			System.out.println("=========Thankyou for shopping you saved "+P_discount+"rs"+"===========");
    			System.out.println("=======================Java Is Awesome===============================");
    			break;
    		
        		
    		}
    	
    	default:
            System.out.println("Invalid input");
    		break;
	}
    	
    
	
    case 3:
     
    	System.out.println("301-----Tomato-----1 kg is 50");
    	System.out.println("302-----Potato-----1 kg is 60");
    	System.out.println("303-----Onion------1 kg is 70");
    	System.out.println("304-----Brinjal----1 kg is 80");
    	System.out.println("305-----Cabbage----1 kg is 90");
    	break;
    case 4:
    	System.out.println("401-----Lotion----1 pack is 100");
    	System.out.println("402-----Lipstick----1 piece is 50");
    	System.out.println("403-----Nail Polishes----1 piece is 30");
    	System.out.println("404-----Deodorants----1 piece is 200");
    	System.out.println("405-----Skin creams----1 pack is 150");
    	break;
    default:
            System.out.println("Invalid input");
    		break;
    
    
    	
	
    }
	
  
       public void m2() 

	{

        System.out.println("201-----Apple--------1 dozen is 100");
     	System.out.println("202-----Mango--------1 dozen is 120");
        System.out.println("203-----Banana-------1 dozen is 60");
        System.out.println("204-----Grapes-------1 kg is 120");
        System.out.println("205-----Pineapple----1 kg is 140");
        System.out.println("-------------------------------------");
   	  System.out.println("Please Choose Your product code");
int b=sc.nextInt();
switch(b)
{
case 201:
	System.out.println("Apple is good choice, How many dozen you want ? ");
	int a2=sc.nextInt();
	//int sum_apple;
	int Sum_Apple_2;
	int sum_apple_3;
	Sum_Apple_2=a2*100;
	System.out.println(Sum_Apple_2);
	System.out.println(new Store().sum_apple);
	sum_apple_3=new Store().sum_apple+Sum_Apple_2;
	System.out.println(sum_apple_3);
	double Apple_discount;
	Apple_discount=sum_apple_3*0.1;
	double Apple_final_bill;
	Apple_final_bill=sum_apple_3-Apple_discount;
	System.out.println("If you want to continue with the shopping press 1");
	System.out.println("If you want to exit press 2");
	int d=sc.nextInt();
	switch(d)
	{
	case 1:
		System.out.println("Available products in the store");
		System.out.println("1. Electronics");
		System.out.println("2. Fruits");
		System.out.println("3. Vegetables");
		System.out.println("4. Cosmetics");
		System.out.println("-------------------------------------");
		System.out.println("please enter your choice ?");
		System.out.println("-------------------------------------");
		int e_a1=sc.nextInt(); 
		switch(e_a1)
		{
		case 2:
			new Store().m2();
			return;
		}
		
	case 2:
		System.out.println("=========================================");
		System.out.println("=======Welcome To Organic Store===========");
		System.out.println("Total bill of your purchased item is:"+sum_apple_3);
		System.out.println("You received a discount of 10% : "+Apple_discount);
		System.out.println("Final bill is :"+Apple_discount);
		System.out.println("=========Thankyou for shopping you saved "+Apple_discount+"rs"+"===========");
		System.out.println("=======================Java Is Awesome===============================");
		return;
	
	
	}
case 202:
	System.out.println("Mango is good choice, How many dozen you want ? ");
	int m1=sc.nextInt();
	int sum_mango;
	sum_mango=m1*120;
	double mango_discount;
	mango_discount=sum_mango*0.1;
	double mango_final_bill;
	mango_final_bill=sum_mango-mango_discount;
	System.out.println("If you want to continue with the shopping press 1");
	System.out.println("If you want to exit press 2");
	int m_d=sc.nextInt();
	switch(m_d)
	{
	case 1:
		System.out.println("Available products in the store");
		System.out.println("1. Electronics");
		System.out.println("2. Fruits");
		System.out.println("3. Vegetables");
		System.out.println("4. Cosmetics");
		System.out.println("please enter your choice ?");
		System.out.println("-------------------------------------");
		int m_e=sc.nextInt(); 
		
	case 2:
		System.out.println("=========================================");
		System.out.println("=======Welcome To Organic Store===========");
		System.out.println("Total bill of your purchased item is:"+sum_mango);
		System.out.println("You received a discount of 10% : "+mango_discount);
		System.out.println("Final bill is :"+mango_final_bill);
		System.out.println("=========Thankyou for shopping you saved "+mango_discount+"rs"+"===========");
		System.out.println("=======================Java Is Awesome===============================");
		break;
}
case 203:
	System.out.println("Banana is good choice, How many dozen you want ? ");
	int B1=sc.nextInt();
	int sum_B;
	sum_B=B1*60;
	double B_discount;
	B_discount=sum_B*0.1;
	double B_final_bill;
	B_final_bill=sum_B-B_discount;
	System.out.println("If you want to continue with the shopping press 1");
	System.out.println("If you want to exit press 2");
	int B_d=sc.nextInt();
	switch(B_d)
	{
	case 1:
		System.out.println("Available products in the store");
		System.out.println("1. Electronics");
		System.out.println("2. Fruits");
		System.out.println("3. Vegetables");
		System.out.println("4. Cosmetics");
		System.out.println("please enter your choice ?");
		System.out.println("-------------------------------------");
		int m_e=sc.nextInt(); 
		
	case 2:
		System.out.println("=========================================");
		System.out.println("=======Welcome To Organic Store===========");
		System.out.println("Total bill of your purchased item is:"+sum_B);
		System.out.println("You received a discount of 10% : "+B_discount);
		System.out.println("Final bill is :"+B_final_bill);
		System.out.println("=========Thankyou for shopping you saved "+B_discount+"rs"+"===========");
		System.out.println("=======================Java Is Awesome===============================");
		break;
}
case 204:
	System.out.println("Grapes is good choice, How many dozen you want ? ");
	int G1=sc.nextInt();
	int sum_G;
	sum_G=G1*120;
	double G_discount;
	G_discount=sum_G*0.1;
	double G_final_bill;
	G_final_bill=sum_G-G_discount;
	System.out.println("If you want to continue with the shopping press 1");
	System.out.println("If you want to exit press 2");
	int G_d=sc.nextInt();
	switch(G_d)
	{
	case 1:
		System.out.println("Available products in the store");
		System.out.println("1. Electronics");
		System.out.println("2. Fruits");
		System.out.println("3. Vegetables");
		System.out.println("4. Cosmetics");
		System.out.println("please enter your choice ?");
		System.out.println("-------------------------------------");
		int m_e=sc.nextInt(); 
		
	case 2:
		System.out.println("=========================================");
		System.out.println("=======Welcome To Organic Store===========");
		System.out.println("Total bill of your purchased item is:"+sum_G);
		System.out.println("You received a discount of 10% : "+G_discount);
		System.out.println("Final bill is :"+G_final_bill);
		System.out.println("=========Thankyou for shopping you saved "+G_discount+"rs"+"===========");
		System.out.println("=======================Java Is Awesome===============================");
		break;
}
case 205:
	System.out.println("Pineapple is good choice, How many dozen you want ? ");
	int P1=sc.nextInt();
	int sum_P;
	sum_P=P1*140;
	double P_discount;
	P_discount=sum_P*0.1;
	double P_final_bill;
	P_final_bill=sum_P-P_discount;
	System.out.println("If you want to continue with the shopping press 1");
	System.out.println("If you want to exit press 2");
	int P_d=sc.nextInt();
	switch(P_d)
	{
	case 1:
		System.out.println("Available products in the store");
		System.out.println("1. Electronics");
		System.out.println("2. Fruits");
		System.out.println("3. Vegetables");
		System.out.println("4. Cosmetics");
		System.out.println("please enter your choice ?");
		System.out.println("-------------------------------------");
		int p_e=sc.nextInt(); 
		
	case 2:
		System.out.println("=========================================");
		System.out.println("=======Welcome To Organic Store===========");
		System.out.println("Total bill of your purchased item is:"+sum_P);
		System.out.println("You received a discount of 10% : "+P_discount);
		System.out.println("Final bill is :"+P_final_bill);
		System.out.println("=========Thankyou for shopping you saved "+P_discount+"rs"+"===========");
		System.out.println("=======================Java Is Awesome===============================");
		break;
	}
}
	
	}

	
  
	  
  
	  }
}
