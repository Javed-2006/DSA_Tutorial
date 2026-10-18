import java.util.Scanner;

class A{
    void recursive(int []arr ,int st,int last){
        if(st<last){
            int pivIdx=partition(arr,st,last);

            recursive(arr, st, pivIdx-1);   //left half
            recursive(arr, pivIdx+1,last);   //right half
        }
    }
    int partition(int []arr,int st,int last){
        int idx=st-1;
        int pivot=last;     // pivot is a last element of array.

        for(int i=st;i<last;i++){      //partitioning correct position(left side) of less than pivot element.
            if(arr[i]<arr[pivot]){      
                idx++;
                int temp=arr[idx];
                arr[idx]=arr[i];
                arr[i]=temp;
            }
        }
       // idx++;
        int temp=arr[idx+1];      // After looping we set pivot after lesser element from pivot.
        arr[idx+1]=arr[pivot];
        arr[pivot]=temp;
        return idx+1;
    }
}
public class Quicksort {
    public static void main(String[] args) {
        System.out.println("Enter the length of array:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

            System.out.println("---------Enter the array elements-------");
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        sc.close();

        A ob=new A();
       ob.recursive(arr,0,arr.length-1);

       System.out.println("----------After Sorted Array--------");
       for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"   ");
       }
    }
    
}
