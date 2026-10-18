import java.util.ArrayList;

public class StackUsingArrayList {
    static class Stack{
        
        static ArrayList<Integer> list=new ArrayList<>();

        public static boolean isEmpty(){
            return list.size()==0;
        }

        public void push(int data){
            list.add(data);
        }

        public int pop(){
            if(
                isEmpty()){
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
        s.push(30);
        s.push(50);
        s.push(100);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
