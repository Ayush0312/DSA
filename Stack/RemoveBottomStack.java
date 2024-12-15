import java.util.Stack;

public class RemoveBottomStack { // O(N) and O(N)
    public static void Remove(Stack<Integer> s , int x){
        Stack<Integer> temp = new Stack<>();

        while(s.size() - 1 > x){
            temp.push(s.pop());
        }
        s.pop();
        while (temp.size() > 0) {
            s.push(temp.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);
        int ind = 3;           // remove element at given index
        Remove(st , ind);
        System.out.println(st);
    }
}
