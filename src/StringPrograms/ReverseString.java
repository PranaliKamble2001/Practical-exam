package StringPrograms;

/**
 * Logic: Reverse a string manually without built-in library functions.
 * Demonstrates mastery of character indexing and iteration.
 */
public class ReverseString {
    public static void main(String[] args) {
        String original = "Portfolio2026";
        String reversed = "";

        // Iterate backwards from the last character to the first
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
