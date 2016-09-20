import java.lang.*;
public class childclass extends parentclass implements comb

{
childclass()
{

System.out.println("object for childclass");


}
void fora(a itera)
{
System.out.println("interface a");
}

void forb(b itera)
{
System.out.println("interface b");

}

void forc(c itera)
{

System.out.println("interface c");

}

void forcomb(comb itera)
{


System.out.println("interface comb");

}




public static void main(String args[])
{

childclass o=new childclass();
o.fora(o);
o.forb(o);
o.forc(o);
o.forcomb(o);
//System.out.println("In child class ");
}

}
