import java.util.ArrayList;

public class ReverseStack {
    static class Stack{
        ArrayList<Integer> list=new ArrayList<>();

        public boolean isEmpty(){
            return list.size()==0;
        }

        public void push(int val){
            list.add(val);
        }

        public int pop(){
            if(isEmpty()){
                return -1;
            }

            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }

        public void reverse(Stack s){

            if(s.isEmpty()){
                return;
            }
            int top=s.pop();
            s.reverse(s);
            s.pushAtbottom(top,s);
        }

        public void pushAtbottom(int top,Stack s){
            if(s.isEmpty()){
                s.push(top);
                return;
            }
            int val=s.pop();
            pushAtbottom(top, s);
            s.push(val);
        }

    }
    
    public static void main(String[] args) {
        Stack s=new Stack();

        /*   s.pop();
        System.out.println(s.pop());
        System.out.println(s.peek());   */

        s.push(50);
        s.push(40);
        s.push(30);
        s.push(20);
        s.push(10);

        s.reverse(s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
