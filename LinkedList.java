class Node{
    public int data;
    public Node next;
    
    public Node(int data){
        this.data=data;
        this.next=null;
    }
    
}
class List{
    Node head;

    // It doesn't depends on the length of list
    //0(1)
    public void insertAtBeginning(int item){
        Node newNode = new Node(item);
        
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        return;
    }

    // Operation: depends on the length of list
    // 0(n)
    public void insetAtPosition(int item,int position){
        Node newNode=new Node(item);
        if(head==null){
            head=newNode;
            return;
        }
        if(position==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        if(position<0){
            System.out.println("Invalid position.");
            return;
        }

        int index=0;
        Node temp=head;
        while (temp.next!=null) {
            
            if(index==(position-1)){
                break;
            }
            temp=temp.next;
            
            index++;
        }
        if(temp.next==null){
            System.out.println("Position is out of bounds.");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        return;
    }

    // Operation: depends on the length of list
    //0(n)
    public void insertEnd(int item){
        Node newNode=new Node(item);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return;
    }

    // Operation: doesn't depends on the length of list
    // 0(1)
    public void deleteAtFist(){
        if(head==null){
            return;
        }
        head=head.next;
    }

    // Opertaion: depends on the length of list
    // 0(n)
    public void deleteAtPosition(int position){
        int index=0;

        if(position==0){
            head=head.next;
        }
         
        if(position==1){
            head.next=head.next.next;
        }

        Node temp=head;
        while(index!=position-1){
            temp=temp.next;
            index++;
        }
        temp.next=temp.next.next;
    }

    // Operation: depends on the length on the list
    // 0(n)
    public void deleteAtLast(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
        }

        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    // Operation: depends on the length of list
    // 0(n)
    public void printData(){
        Node temp=head;
        if(temp.next==null){
            System.out.println("LinkedList is Empty.");
            return;
        }
        while (temp!=null) {
            System.out.print(temp.data+"  ==>");
            temp=temp.next;
        }

    }

}
public class LinkedList {
    public static void main(String[] args) {
        List list=new List();
        list.insertAtBeginning(40);
        list.insertAtBeginning(20);
        list.insertEnd(50);
        list.insertEnd(60);
        list.insertAtBeginning(10);
        list.insetAtPosition(30,2);

        list.deleteAtFist();
        list.deleteAtLast();
        list.deleteAtPosition(2);
        list.printData();
    }
}
