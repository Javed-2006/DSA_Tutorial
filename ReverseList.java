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
    void insertAtFirst(int item){
    Node newNode=new Node(item);
    if(head==null){
        head=newNode;
        return;
    }

    newNode.next=head;
    head=newNode;
    return;
    }
    
    void insertAtLast(int item){
        Node newNode=new Node(item);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null) {
            temp=temp.next;
        }
            temp.next=newNode;
            newNode.next=null;
        
    }

    Node reverse(){
        Node temp=head;
        Node prev=null,next=null;
        while (temp!=null) {
            next=temp.next;  //stored next for updating
            temp.next=prev;   //make next to previous
            prev=temp;    //update ahead
            temp=next;     // stored updation save line -1
            
        }
        head=prev;
    return head;
    }


    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"==>");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
public class ReverseList {
    public static void main(String[] args) {
    List list=new List();
     list.insertAtFirst(10);
    // list.print();  
     list.insertAtLast(20);
      list.insertAtLast(30);
       list.insertAtLast(40);
        list.insertAtLast(50);
         list.insertAtLast(60);
         list.insertAtFirst(5);
         
     list.print(); 
     list.reverse();
     list.print();
    }
}
