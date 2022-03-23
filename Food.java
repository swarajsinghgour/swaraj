public class Food 
{
	int orderNumber;
	int costOFOrder;
		
	void available()
	{
		System.out.println("Welcome!! The Food is available");
	}
	void order(String foodName)
	{
		System.out.println("I want to order.."+foodName);
	}
	float bill(int a, int b)
	{
		orderNumber=a;
		costOFOrder=b;
		float c= a*b;
		return c;
	}
	int feedback()
	{
		System.out.println("kindly Give Feedback between 1 to 10");
		return 5;
		
	}
	
	public static void main(String[] args) 
	{
		
		Food f1 = new Food();
		f1.available();
		f1.order("Tea");
		System.out.println("Your Bill for this order is:"+f1.bill(5, 20));
		System.out.println("Thanks for your response:"+f1.feedback());
	}

}

