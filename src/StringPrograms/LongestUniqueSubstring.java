package StringPrograms
  
import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {
    public static int findLength(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0; // The start of our window
        Set<Character> charSet = new HashSet<>();

        // The 'right' pointer expands the window
        for (int right = 0; right < n; right++) {
            // If we find a duplicate, shrink the window from the left
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            // Add the new character and calculate the size
            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String input = "pwwkew";
        System.out.println("Longest unique substring length in '" + input + "': " + findLength(input));
    }
}
