import java.util.*;
public class LargeElement {
static void large(int arr[]){
    int large=arr[0];
    for(int i=0;i<arr.length;i++){
        if(large<arr[i]){
           large=arr[i];
        }
    }
    System.out.println("Largest:"+large);
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
        large(arr);
    }
}
