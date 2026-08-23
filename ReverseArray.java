import java.util.*;
public class ReverseArray {
    static void reverse(int arr[]){
        int temp=0;
        for(int i=0;i<arr.length/2;i++){
         temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        int i=0;
        while(i<arr.length){
            System.out.print(arr[i]+"  ");
            i++;
        }
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
        sc.close();
        reverse(arr);
    }
}
