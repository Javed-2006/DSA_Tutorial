import java.util.*;
public class Loop {
    public static void main(String[] args) {
        System.out.println("Enter 10 Number and find sum of all:");
        int num[]=new int[10];
        int s=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
            s+=num[i];
        }
        System.out.println("Total Sum:"+s);
        sc.close();
    }
}
