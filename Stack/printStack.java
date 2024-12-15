import java.util.Stack;

public class printStack {
    public static void main(String[] args) { //  O(N) and O(N)
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);


        // Using Stack
        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0) {
            rt.push(st.pop());
        }

        while (rt.size() > 0) {
            System.out.print("  "+st.push(rt.pop()));
        }



        // Using array

        int size = st.size();
        int arr[] = new int[size];

        for(int i = size - 1 ; i >= 0 ; i--){
            arr[i] = st.pop();
        }

        System.out.println();
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print("  "+st.push(arr[i]));
        }
    }
}