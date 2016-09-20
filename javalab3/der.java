import java.lang.*;
import java.io.*;
public class der extends base{
int a=0;

		der(){
System.out.println("def constructor");
}
		der(int a){

System.out.println("non def constructor");
System.out.println("a="+a);
}
public static void main(String args[])
{

der o=new der(10);
base ob=new base();

}}
