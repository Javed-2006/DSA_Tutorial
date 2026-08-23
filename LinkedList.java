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
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertEnd(30);
        list.insertEnd(40);
        list.insertAtBeginning(50);
        list.insetAtPosition(60,2);
        list.printData();
    }
}
