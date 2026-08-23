import java.util.Scanner;

public class LinearSearch {

    public static void search(int arr[],int tar){
        for(int i=0;i<arr.length;i++){
            if(tar==arr[i]){
                System.out.println("Found the Number on "+i+" position.");
                break;
            }
            if(i==arr.length){
            System.out.println("Targeted number is Invalid for given Index.");
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter the size of an Array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        System.out.println("Enter the array Element");
        int []arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Targeted element");
        int tar=sc.nextInt();
        sc.close();
        search(arr,tar);
    }
}
