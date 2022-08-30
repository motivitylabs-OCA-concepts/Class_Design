package com.motivity.classdesign.InheritenceAndAbstraction;

interface WhereHouse
{
	public void products();
	public void offers();	
}
abstract class OfflineShope implements WhereHouse
{
	   String mode;
	   OfflineShope()
	   {
	   }
	   static {
		   System.out.println("........this is offline shopping..........");
	   }
	
	abstract void itemsCarryTrolly();
	abstract void caluculatePrice(int offer);
    void checking()
	{
    	System.out.println("Please Support personal checking..");
	}
    void exploringItems()
    {
    	System.out.println("the team will be support to explore anything..");
    }
    String payment(String method)
    {
    	return mode=method;
    }
}
 class Dmart extends OfflineShope
 {
	 int fashionoffer=15;
	 int groceryoffer=20;
	 int electronicsoffer=10;
	 int price =100;
	 public void products()
	    {
		 
		 System.out.println("1.grocery,2.electronics,3.fashion");
	    }
	 void itemsCarryTrolly()
	 {
		 System.out.println("Please select items and collect in trolley..");
	 }
	 void caluculatePrice(int offer)
	 {
		 price=price-(offer/100);
		 
		 System.out.println("price calculating.. price is"+price);
	 }
	    
	    public void offers()
		{
	    	
			System.out.println("multiple offers in fashion and grocery and electronics ");
		}
	   void billing()
	   {
		   System.out.println("your billg method  is "+mode);
	   }
 }

abstract class OnlineShope implements WhereHouse
{
	static {
		
		System.out.println("........this is online shopping..........");
		
	    }
	String mode;
	 void cart()
	{
		System.out.println("please select items and collect");
	}
   
    String payment(String method)
    {
    	return mode=method;	
    }
}
class Flipcart extends OnlineShope
{
	 int fashionoffer=25;
	 int groceryoffer=10;
	 int electronicsoffer=15;
	 int price =200;
	 
	 public void products()
	    {
		 System.out.println("1.grocery,2.electronics,3.fashion,4.furniture,5.kitchen");
	    }
	 void cart()
	 {
		 System.out.println("Please select items and collect in cart.");
	 }
	 void caluculatePrice(int offer)
	 {
		 price=price-(offer/100);
		 System.out.println("price calculating.. price is"+price);
	 }   
	    public void offers()
		{
	    	
			System.out.println("multiple offers in fashion and grocery and electronics ");
		}
	   void billing()
	   {
		   System.out.println("your billing method  is "+mode);
	   }
}
public class ShoppingService {

	public static void main(String[] args) {
		
		Dmart x=new Dmart();
		x.products();
		x.itemsCarryTrolly();
		x.caluculatePrice(10);	
		x.offers();
		x.payment("card");
		x.billing();
		Flipcart y=new Flipcart();
		y.products();
		y.cart();
		y.offers();
		y.caluculatePrice(10);
		y.payment("patym");
		y.billing();

	}

}
