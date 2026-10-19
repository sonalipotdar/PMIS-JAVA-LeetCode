class Solution {

    // Function to reverse words in a string
    public String reverseWords(String s) {
        // Split the string by one or more spaces
        String[] words = s.trim().split("\\s+");

        // StringBuilder to store reversed words
        StringBuilder sb = new StringBuilder();

        // Traverse the words array from end to start
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);   // Add the word
            sb.append(" ");        // Add a space
        }

        // Convert StringBuilder to String and remove trailing space
        return sb.toString().trim();
    }
}
