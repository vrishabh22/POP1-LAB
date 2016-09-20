import java.util.*;
import java.lang.*;
class q2{
public static void main(String args[])
{
int h = 0x10000000;
        System.out.println(Integer.toBinaryString(h));
        for (int k = 0; k < 28; k++) {
            h >>>= 1;
            System.out.println(Integer.toBinaryString(h));
        }
}
}
