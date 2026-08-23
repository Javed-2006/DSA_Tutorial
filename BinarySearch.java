import java.util.Scanner;
public class BinarySearch {

    static void search(int arr[],int tar){
        int firstIndex=0;
        int midIndex=0;
        int lastIndex=arr.length-1;
        while(lastIndex>firstIndex){
            midIndex=(lastIndex+firstIndex)/2;
            if(tar==arr[midIndex]){
            System.out.println("Found the number as "+midIndex+" position.");
            break;
            }
            else if(tar<arr[midIndex]){
            lastIndex=midIndex-1;
            }
            else{
            firstIndex=midIndex+1;
            }
        }
        if(firstIndex>=lastIndex){
        System.out.println("targetted element is wrong for given array.");
        }

    }


    public static void main(String[] args) {
        System.out.println("Enter the size of an Array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        System.out.println("Enter the array Element in Sorted order");
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
