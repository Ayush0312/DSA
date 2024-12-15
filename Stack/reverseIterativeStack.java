import java.util.Stack;

public class reverseIterativeStack {
    public static void reverse(Stack<Integer> s){
        Stack<Integer> temp1 = new Stack<>();
        while (s.size() > 0) {
            temp1.push(s.pop());
        }

        Stack<Integer> temp2 = new Stack<>();
        while (temp1.size() > 0) {
            temp2.push(temp1.pop());
        }

        while (temp2.size() > 0) {
            s.push(temp2.pop());
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
        reverse(st);
        System.out.println(st);
    }
}
