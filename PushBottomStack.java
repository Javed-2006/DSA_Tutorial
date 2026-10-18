import java.util.ArrayList;

public class PushBottomStack {
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        
        public void pushAtbottom(int val, Stack s){
            if(s.isEmpty()){
                s.push(val);
                return;
            }

            int top=s.pop();
            pushAtbottom(val, s);
            s.push(top);
        }

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
    }
    public static void main(String[] args) {
        Stack s=new Stack();
            s.push(40);
            s.push(30);
            s.push(20);
            s.push(10);

           s.pushAtbottom(25, s);

           while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
           }
    }
}
