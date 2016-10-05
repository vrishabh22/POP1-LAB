import java.util.*;
import java.util.Scanner;

public class fib {

	public static void main(String[] args) {
		 int n1=0,n2=1,n3,i,count=20,b;
		 int a[]=new int[20];
		 //System.out.print(n1+" "+n2);//printing 0 and 1    
		    a[0]=n1;
		    a[1]=n2;
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  a[i]=n3;
		  //System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		  
		 System.out.println("Enter position to find element");
		 Scanner s=new Scanner(System.in);
		b=s.nextInt();
		 b=b-1;
		 System.out.println(a[b]);

	}

}