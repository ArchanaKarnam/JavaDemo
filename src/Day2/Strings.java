package Day2;
import java.util.*;
public class Strings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        int length1=str1.length();
        int length2=str2.length();
        String mergedStrings=str1+str2;
        StringBuilder sb=new StringBuilder(str1);
        System.out.println("String reverse : "+ sb.reverse());
        String str3="Who#are#you";
        String[] splitString=str3.split("#",2);
        for(String s:splitString){
           System.out.println(s);
       }
        System.out.println("Length of string 1 is "+length1);
        System.out.println("Length of String 2 is "+length2);
        System.out.println("Merged strings are "+mergedStrings);
        System.out.println("The two Strings are equal : " + str1.equals(str2));
    }
}
