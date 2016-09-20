import java.util.*;
class q3{
public static void main(String args[])
{






int h2 = -1;
        System.out.println(Integer.toBinaryString(h2));
        h2 <<= 1;
        System.out.println(Integer.toBinaryString(h2));
        for (int g = 0; g < 32; g++){
            h2 >>>= 1;
            System.out.println(Integer.toBinaryString(h2));
        }
}}
