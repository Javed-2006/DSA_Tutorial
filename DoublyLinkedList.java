class Node {
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
class DoublyList{
    Node head=null,tail=null;
    void insertAtFront(int item){   // We insert or delete from front then we take action through head. & update head
        Node newNode=new Node(item);

        if(head==null){
            head=tail=newNode;
        }else{
            newNode.next=head;     // like
            head.prev=newNode;
            head=newNode;
        }
    }

    void insertAtBack(int item){      // We insert or delete from back then we take action tail. & update tail
        Node newNode=new Node(item);

        if(head==null){
            head=tail=newNode;
        }else{
           /*  tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;   */

            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
    }

    void deleteFront(){
        Node temp=head;
        head=head.next;
        if(head!=null){
            head.prev=null;
        }
        temp.next=null;
    }

    void deleteBack(){
        Node temp=tail;

        tail=tail.prev;
        if(tail!=null){
            tail.next=null;
        }
        temp.prev=null;
    }
    void print(){
        Node temp;
        temp=head;

        System.out.print("null"+" ");
        while (temp!=null) {
            System.out.print(temp.data+" <=> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyList list=new DoublyList();
        list.insertAtBack(1);   
        list.insertAtBack(2);
        list.insertAtBack(3);
        list.insertAtBack(4);
        list.insertAtBack(5);
        list.insertAtBack(6);

        list.deleteBack();
        
        list.print();
    }
}
