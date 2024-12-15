import java.util.*;

public class copyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        // System.out.println("Enter the number of element");
        // int n = sc.nextInt();

        // System.out.println("Enter the elements");

        // for (int i = 0; i < n; i++) {
        //     int x = sc.nextInt();
        //     st.push(x);
        // }
        // System.out.println(st);


        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);



        Stack<Integer> sr = new Stack<>();
        while (st.size() > 0) {
            int x = st.peek();
            sr.push(x);
            st.pop();

            // OR sr.push(st.pop())
        }
        System.out.println(sr);




        Stack<Integer> rt = new Stack<>();
        while (sr.size() > 0) {
            int x = sr.peek();
            rt.push(x);
            sr.pop();

            // OR sr.push(st.pop())
        }
        System.out.println(rt);

    }
}
