package ArrayPrograms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30; // The element which we want to find 
        int index = -1;

        // Traverse the array to find the target
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i; // Store the index if found
                break;     // Exit loop immediately 
            }
        }

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
