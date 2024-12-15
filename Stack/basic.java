import java.util.*;

public class basic {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());

        st.push(2);
        st.push(3);
        st.push(5);
        st.push(7);
        st.push(9);

        System.out.println(st.peek());
        System.out.println(st);

        System.out.println(st.size());

        System.out.println(st.pop());      //O(1)
        System.out.println(st);

        System.out.println(st.size());




        // Unlimited size
        //

    }
}
