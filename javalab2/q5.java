import java.lang.*;
import java.util.*;
class q5{
public static void main(String args[])
{
 
Scanner s=new Scanner(System.in);
System.out.println("enter");
String s1=s.next();
System.out.println("entered "+s1);
System.out.println("enter");
String s2=s.next();
System.out.println("entered "+s2);
int c=s1.compareTo(s2);

if(c>0)
System.out.println("s1 is greater");
else if(c<0)
System.out.println("s2 is greater");
else
System.out.println("same");
System.out.println(s2.equals(s1)); 

}


}
