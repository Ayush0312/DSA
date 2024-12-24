import java.util.*;

public class deleteConsecutiveSubsequence {

    public static int[] remove(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (st.size() == 0 || st.peek() != arr[i]) {
                st.push(arr[i]);
            } else if (arr[i] == st.peek()) {
                if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                    st.pop();
                }
            }
        }

        int ans[] = new int[st.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 3, 2, 5, 5, 5, 7, 7, 8, 9, 10, 10, 28, 10000000 };
        int res[] = remove(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}