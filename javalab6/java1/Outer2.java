package java1;

public class Outer2 {
	private String s1;
	public Outer2() {
		s1 = "outer";
	}
	
	/**
	 * @param args
	 */
	public class Inner
	{
		public String toString()
		{
			System.out.println("I am Inner class!!");
			return s1;
		}
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
				Outer2 o1 = new Outer2();
				Outer2.Inner i2 = o1.new Inner();
				System.out.println("The private member : "+i2.toString());
	}

}
