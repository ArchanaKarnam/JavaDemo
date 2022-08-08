import java.util.*;
public class DoraMango {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int mango=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            a[i][0]=-1;
            a[i][m-1]=-1;
        }
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(count++==mango){
                   if(a[i][j]==-1){
                       System.out.println("Yes");
                   }else{
                       System.out.println("No");
                   }
                }
            }
        }
    }
}
