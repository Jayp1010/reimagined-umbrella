/**
 * Name: Jaykumar Patel
 * Date: 10/18/2022
 * File: StockSelectionHelper.java
 */

import java.util.*;
public class StockSelectionHelper 
	{
	
	public static void main(String[] args) 
	{
		    
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Welcome to the Stock Selection Helper App!\n")  ;
	  System.out.print("Enter the total amount of money you are willing to invest: ");
			
			double invest = sc.nextDouble();
		
	  System.out.print("\nEnter the stock ticker: ");
			
			String stockTicker = sc.next();
			
	 while(stockTicker.length() > 5)
		 
			{
		 
	  System.out.println("Invalid input. Try again.");
      System.out.print("Enter stock ticker: ");
		
			  stockTicker = sc.next();
			}
			
	  System.out.print("\nEnter the price: ");
	
		    double stockPrice = sc.nextDouble();

	while(stockPrice < 1.00)
		{
		 
	  System.out.println("Invalid price entered for stock. Try again.");
      System.out.print("Enter the price: ");
			  
			    stockPrice = sc.nextDouble();
		}
			
	  System.out.print("\nEnter P/E Ratio: ");
			
	    	double PERatio = sc.nextDouble();
			
	  System.out.print("\nBelow are your results: \n");
			
			double stocksnum = invest/stockPrice;
			
	    System.out.println("Stock: " + stockTicker);
		
		System.out.println("Price: $" + stockPrice);
			 
		System.out.println("P/E Ratio : " + PERatio);
		if(PERatio > 45)
			
		System.out.println("OVERVALUED STOCK!");
		
	    System.out.print(" ");
	    
	    System.out.println("# of shares able to purchase: " + stocksnum);
			
		}
	}



