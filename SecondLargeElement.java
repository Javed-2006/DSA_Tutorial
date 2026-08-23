import java.util.Scanner;

public class SecondLargeElement {
    public static void secondlarge(int arr[]){
        int largest=arr[0];
        int secondlargest=arr[1];
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                secondlargest=largest;
                largest=arr[i];
            }
          /*   else if(secondlargest<arr[i] && largest>arr[i]){
                secondlargest=arr[i];
            }   */

        }
        System.out.println("Second Largest Element:"+secondlargest);
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
        secondlarge(arr);
    }
}
