public class linkedListImplementationOfStack {
    public static class Node{  // User Defined data type 
        Node next;
        int val;

        Node(int val){
            this.val = val;
        }
    }
    public static class LLStack {  // User Defined data Structure
        Node head = null;
        int size = 0;

        void push(int val){
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
            size++;
        }

        int pop(){
            if(size() == 0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int poped = head.val;
            head = head.next;
            size--;

            return poped;
        }

        int peek(){
            if(size() == 0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return head.val;
        }
        void displaySecond(Node head){
            if(head == null){
                return;
            }
            displaySecond(head.next);
            System.out.print(" "+head.val);
            head = head.next;

        }
        void display(){
            displaySecond(head);
            System.out.println();
        }

        void displayRev(){
            Node temp = head;

            while (temp != null) {
                System.out.print(" "+temp.val);
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            return size;
        }

        boolean isEmpty(){
            if(size() == 0){
                return true;
            }
            return false;
        }
    
        
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
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
        

        System.out.println(st.isEmpty()); 

        st.displayRev(); // 4 3 2 1
    }
}
