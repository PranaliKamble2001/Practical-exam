package ArrayPrograms;

import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 20, 50}; 
        
        findDuplicateLogic(numbers);
    }

    public static void findDuplicateLogic(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : arr) {
            // Logic: If the number is already in the set, it is a duplicate
            if (seen.contains(num)) {
                System.out.println("Duplicate found: " + num);
                return;
            }
            seen.add(num);
        }
        System.out.println("No duplicates found.");
    }
}
