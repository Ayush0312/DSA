package DSA.Arrays;

public class Rotation {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Rotation solution = new Rotation();
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        System.out.println("Original array:");
        printArray(nums);
        solution.rotate(nums, k);
        System.out.println("Array after rotation:");
        printArray(nums);
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
