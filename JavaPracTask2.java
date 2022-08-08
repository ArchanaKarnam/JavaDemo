import java.util.Scanner;
public class JavaPracTask2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int extraDays=0;
        int sal=0;
        int TotalHours=0;
        int weeks[]=new int[7];
        for(int i=0;i<7;i++){
            weeks[i]=sc.nextInt();
        }
        for(int i=0;i<7;i++){
            if(weeks[i]>8){
                extraDays=weeks[i]-8;
                sal+=(weeks[i]*100)+(extraDays*15);
            }else{
                sal+=(weeks[i]*100);
            }
        }

        TotalHours=weeks[1]+weeks[2]+weeks[3]+weeks[4]+weeks[5];
        if(TotalHours>40){
            sal+=(TotalHours-40)*100+(TotalHours-40)*25;
        }
        if(weeks[0]>0){
            sal=sal*(25/100);
        }
        if(weeks[6]>0){
            sal=sal*(50/100);
        }
        System.out.println(sal);
    }
}
