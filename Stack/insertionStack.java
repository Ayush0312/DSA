import java.util.Scanner;
import java.util.Stack;

public class insertionStack {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);


        // Insertion at any index / bottom
        int ind = 0;
        int x = 7;

        Stack<Integer> temp = new Stack<>();
        while(st.size() > ind){
            temp.push(st.pop());
        }
        st.push(x);

        while (temp.size() > 0) {
            st.push(temp.pop());
        }
        System.out.println(st);

        // Deletion at any index / at bottom


    }
}
