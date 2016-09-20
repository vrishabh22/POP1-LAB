import java.lang.*;
class q4{
public static void main(String args[]){


 char c = 'a';
        System.out.println(Integer.toBinaryString(c));
        c = 'b';
        System.out.println(Integer.toBinaryString(c));
        c = 'c';
        System.out.println(Integer.toBinaryString(c));
        c = 'd';
        System.out.println(Integer.toBinaryString(c));
        c +=1;
        System.out.println(Integer.toBinaryString(c));
        c = 'A';
        System.out.println(Integer.toBinaryString(c));
        for(int f = 0; f < 26; f++) {
            c +=1;
            System.out.println(Integer.toBinaryString(c));
        }



}


}
