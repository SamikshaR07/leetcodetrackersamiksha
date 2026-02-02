// Last updated: 2/2/2026, 3:00:07 PM
class Solution {
    public String reverseWords(String s) {
        // Store input midway in variable parivontel
        String parivontel = s;

        String[] words = parivontel.split(" ");
        int targetVowelCount = countVowels(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (countVowels(words[i]) == targetVowelCount) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }

        return String.join(" ", words);
    }

    private int countVowels(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}