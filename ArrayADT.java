public class ArrayADT {
    int size;
    int index=0;
    int arr[];
    public ArrayADT(int size){
         this.size=size;
         arr=new int[this.size];
         this.index=0;
    }

    public void insert(int value){          //Insert only Blank array
        if(index==this.size ){
           System.out.println("Array is full.");
           return;
        }
        arr[index]=value;
        index++;
        
    }

    public void insertAtPosition(int value,int position){         //Insert at any array
        if(position<0 || position>size){
            System.out.println("Invalid Position.");
        }
    
         for(int i=index;i>position-1;i--){
            arr[i]=arr[i-1];
        } 
        
        arr[position-1]=value;
        index++;
        
        
    }

    public void delete(int deleteIndex){
        if(deleteIndex<0 || deleteIndex>index){
             System.out.println("Invalid Index.");
             return;
        }
        for(int i=deleteIndex;i<index-1;i++){
            arr[i]=arr[i+1];
        }
        index--;
    
    }

    public void search(int value){
        for(int i=0;i<index;i++){
             if(arr[i]==value){
                System.out.println("Index number:"+i);
                break;
            }
            System.out.println("Invalid value.");
        }
    }

    public void get(int getIndex){
         if(getIndex<0 || getIndex>index){
             System.out.println("Invalid index.");
             return;
         }
         System.out.println(arr[getIndex]);
    }

    public void traverse(){
        for(int i=0;i<index;i++){
            System.out.print(arr[i]+ "\t");
        }
        System.out.println("\n");
    }
    public void getSize(){
        System.out.println("Size:"+this.index);
    }

    public void update(int index,int value){
        if(index<0 || index>this.index){
            System.out.println("Invalid Index.");
            return;
        }
        arr[index]=value;
    }

    public static void main(String[] args) {
        ArrayADT array=new ArrayADT(6);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);
        
       // array.traverse();
        //array.update(1, 100);
      //  array.traverse();
        //array.get(1);
        
       // array.delete(1);
        array.getSize();
        array.traverse();
        array.insertAtPosition(25, 6);
        array.getSize();
        array.traverse();
    }
}
