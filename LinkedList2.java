class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        next=null;
    }
    
}

class List{
    Node head;

    void insertAtBeginning(int value){
        Node newNode=new Node(value);

        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
        return;
    }

    void insertAtEnd(int value){
        Node newNode=new Node(value);

        if(head==null){
            head=newNode;
            return;
        }

        Node temp;
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        
        temp.next=newNode;
        return;
    }

    void insertAtPosition(int value,int position){
        Node newNode=new Node(value);

        if(head==null){
            head=newNode;
            return;
        }

        Node temp;
        temp=head;

        for(int i=1;i<position;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }

    void printList(){
        Node temp;
        temp=head;

        while(temp!=null){
            System.out.print(temp.data+"  ->  ");
            temp=temp.next;
        }
    }
}
public class LinkedList2 {
    public static void main(String[] args) {
        List list=new List();
        list.insertAtBeginning(10);
      //  list.printList();

        list.insertAtEnd(20);
      //  list.printList();

        list.insertAtEnd(30);
//        list.printList();

        list.insertAtPosition(5, 1);
        list.printList();
    }
    
}
