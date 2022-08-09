package Day2;
import java.util.*;
public class Alphabets {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String[] words=sentence.split("\\s");
        String result="";
        for(String i:words){
            for(int j=0;j<i.length();j++){
                if(Character.isUpperCase(i.charAt(j))){
                    result+=Character.toLowerCase(i.charAt(j));
                }
                else{
                    result+=Character.toUpperCase(i.charAt(j));
                }
            }
            result+=" ";
        }
        System.out.println(result);
    }
}
