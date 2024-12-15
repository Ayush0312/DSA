

public class arrayImplementationOfStack {
    public static class Stack {
        private int arr[] = new int[5];
        private int idx = 0; // imp

        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full!");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int peek(){
            if(idx == 0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return arr[idx - 1];
        }

        int pop(){
            if(idx == 0){
                System.out.println("Stack is Empty!");
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }

        void display(){
            for(int i = 0 ; i < idx ; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }

        boolean isEmpty(){
            return (idx == 0)? true : false;
        }

        boolean isFull(){
            return (idx == arr.length)? true: false;
        }

        int capacity(){
            return arr.length;
        }
        
        
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.isEmpty());

        st.push(1);
        st.display(); // 1

        st.push(2);
        st.display(); // 1 2
 
        st.push(3);
        st.display(); // 1 2 3

        st.push(4);
        st.display(); // 1 2 3 4

        st.push(5);
        st.display(); // 1 2 3 4 5


        System.out.println("peek: "+st.peek()); // 5

        System.out.println("Size: "+st.size()); // 5

        st.pop();
        st.display(); // 1 2 3 4 
        System.out.println("Size: "+st.size()); // 4
        

        st.push(5);
        st.display();

        st.push(6);
        System.out.println(st.isFull());
        st.display();

        System.out.println("Capacity: "+st.capacity());




    }
}
