package io.github.dbc;

public class ReverseStringsGenerator {
    /**
     * This method will reverse the letters of each word in the given string.
     *
     * @param string the string to reverse.
     * @return the reversed string with the letters of each word reversed.
     * @throws NullPointerException     if the given string is null.
     * @throws IllegalArgumentException if the given string is empty.
     */
    public String reverseWords(String string) {
        if (string.equals("") || string.equals(" ") || string.isBlank() || string.isEmpty()) {
            throw new IllegalArgumentException();
        } else if (string == null) {
            throw new NullPointerException();
        }
        StringBuffer ans = new StringBuffer();
        String[] words = string.split(" ");
        for (String EachWord : words) {
            StringBuffer word = new StringBuffer(EachWord);

            ans.append(word.reverse());
            ans.append(" ");
        }
        return ans.toString().trim();
    }

    /**
     * This method reverses the order of the characters in a string.
     * It also reverses the order of the words in the string.
     *
     * @param string the string to reverse.
     * @return the reversed string with the letters of each word reversed and the words in reverse order.
     * @throws NullPointerException     if the given string is null.
     * @throws IllegalArgumentException if the given string is empty.
     */
    public String reverse(String string) {
        if (string.equals("") || string.equals(" ") || string.isEmpty() || string.isBlank()) {
            throw new IllegalArgumentException();
        } else if (string == null) {
            throw new NullPointerException();
        }
        StringBuffer ans = new StringBuffer();
        for (int i = string.length() - 1; i >= 0; i--) {
            ans.append(string.charAt(i));
        }
        return ans.toString();
    }
}
