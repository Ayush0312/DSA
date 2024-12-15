import java.util.Stack;

public class bottomInsertStack {
    public static void insertAtBottom(Stack<Integer> s , int x){
        if(s.isEmpty()){
            s.push(x);
            return;
        }

        int top = s.pop();
        insertAtBottom(s , x);
        s.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);
        int x = 100;
        insertAtBottom(st , x);
        System.out.println(st);

    }
}
