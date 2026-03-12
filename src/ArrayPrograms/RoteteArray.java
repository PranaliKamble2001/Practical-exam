package ArrayPrograms;

import java.util.Arrays;

public class RotateArray {
    
    /**
     * Logic: 
     * 1. Reverse the entire array.
     * 2. Reverse the first 'k' elements.
     * 3. Reverse the remaining elements.
     */
    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) return;
        
        // Handle cases where k is larger than array length
        k %= nums.length; 
        
        // Step 1: Reverse everything
        reverse(nums, 0, nums.length - 1);
        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);
        // Step 3: Reverse the rest
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7};
        int rotationSteps = 3;
        
        System.out.println("Original: " + Arrays.toString(data));
        rotate(data, rotationSteps);
        System.out.println("Rotated by " + rotationSteps + ": " + Arrays.toString(data));
    }
}
