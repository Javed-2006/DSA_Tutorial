import java.util.Scanner;

public class CountElement {
    public static void counter(int arr[],int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                 count++;
            }

        }
        System.out.println("Targeted element is come in "+count+" times.");
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of Array:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the Array Element:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the targeted element:");
        int target=sc.nextInt();
        sc.close();
        counter(arr,target);
    }
}
