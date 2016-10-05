package java1;

public class Outer {
	void printMessage()
	{
		System.out.println("I am Outer class!!");
	}

	class Inner
	{
		void printMessage()
		{
			System.out.println("I am Inner class!!"); 
		}
	}
	
	Inner method()
	{
		Inner i1 = new Inner();
		return i1;
	}
	
	public static void main(String[] args)
	{
		
		Outer o1 = new Outer();
		Inner i2 = o1.method();
		i2.printMessage();
		o1.printMessage();
	}

}
