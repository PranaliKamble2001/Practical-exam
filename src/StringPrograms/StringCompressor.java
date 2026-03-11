package StringPrograms
  public class StringCompressor {
    public static String compress(String input) {
        if (input == null || input.isEmpty()) return "";

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            // Check if the next character is the same as the current one
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                // Once the character changes, append the char and the count
                compressed.append(input.charAt(i));
                compressed.append(count);
                count = 1; // Reset count for the next character
            }
        }

        // Return the compressed string only if it's actually shorter than the original
        return compressed.length() < input.length() ? compressed.toString() : input;
    }

    public static void main(String[] args) {
        String str1 = "aaabbccccd";
        String str2 = "abc"; // Should return "abc" because "a1b1c1" is longer

        System.out.println("Compressed '" + str1 + "': " + compress(str1));
        System.out.println("Compressed '" + str2 + "': " + compress(str2));
    }
}
