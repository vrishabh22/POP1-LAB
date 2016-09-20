import java.lang.*;
import java.util.*;
public class line_intersect{
public static void main(String args[])
{

int m1,m2,c1,c2;
Scanner o=new Scanner(System.in);
System.out.println("Enter slope and intercept of 1st line");
m1=o.nextInt();
c1=o.nextInt();
System.out.println("Enter slope and intercept of 2nd line");
m2=o.nextInt();
c2=o.nextInt();
if(m1==m2)
System.out.println("do not Intersect");
else
System.out.println("Intersect");
}}
