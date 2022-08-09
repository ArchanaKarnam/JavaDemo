package Day2;
import java.util.*;
public class StudentMarks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int students[][]=new int[3][2];
        int marks[]=new int[3];
        int[] rank=new int[3];
        int TotalAvgMarks=0;
        int AvgSubWiseMarks=0;
        int[] subAvg=new int[2];
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<2;j++){
                students[i][j]=sc.nextInt();
                sum+=students[i][j];
            }
            marks[i]=sum;
        }
        for(int i=0;i<3;i++){
            System.out.println("Total marks of student " +(i+1)+ " is :"+marks[i]);
        }
        System.out.println("------------------------------------------------------");
        for(int i=0;i<3;i++){
            int count=0;
            for(int j=0;j<3;j++){
                if(marks[j]>marks[i]){
                    count++;
                }
            }
            rank[i]=count+1;
        }

        for(int i=0;i<3;i++){
            System.out.println("Rank of student " +(i+1)+" is :"+rank[i]);
        }
        System.out.println("----------------------------------");
        for(int i=0;i<3;i++){
            if(rank[i]==1){
                System.out.println("Top 1 Student is : student "+(i+1));
            }
            if(rank[i]==2){
                System.out.println("Top 2 Student is : student "+(i+1));
            }
            if(rank[i]==3){
                System.out.println("Top 3 Student is : student "+(i+1));
            }
        }
        System.out.println("------------------------------------------");

        for(int i=0;i<3;i++){
            TotalAvgMarks+=marks[i];
        }
        System.out.println("Average of Total Marks of whole class is : " + TotalAvgMarks/3);
        System.out.println("--------------------------------------------");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++) {
                subAvg[j] += students[i][j];
            }
        }
        for(int i=0;i<2;i++){
            System.out.println("Average marks of each subject "+(i+1)+ " is :"+subAvg[i]/2);
        }
        System.out.println("-------------------------------------");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                if(students[i][j]<2){
                    System.out.println("Poorly performed by student "+(i+1) +" whose rank is : "+rank[i] +" in subject "+(j+1)+
                            " total marks is " +marks[i]);
                }
            }
        }
    }
}
