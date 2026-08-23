import java.util.Scanner;

public class MoveZero {

    public static void move(int []arr){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        for(int i=index;i<arr.length;i++){
            arr[i]=0;
        }

        System.out.println("Down the Moved Zero element in last");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
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
        sc.close();
        move(arr);
    }
}
