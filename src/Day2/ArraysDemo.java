package Day2;
import java.util.*;
public class ArraysDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[10];
        for(int i=0;i<10;i++){
            marks[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int min_index=0;
        int max_index=0;
        for(int i=0;i<10;i++){
            if(marks[i]>max){
                max=marks[i];
                max_index=i;
            }
            if(marks[i]<min){
                min=marks[i];
                min_index=i;
            }
        }
        System.out.println("Roll Number of student with maximum marks is "+(1001+max_index)+" with marks "+max);
        System.out.println("Roll Number of student with minimum marks is "+(1001+min_index)+" with marks "+min);

    }
}
