class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] char_counts = new int[26];
        for (char c : magazine.toCharArray()) {
            char_counts[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (--char_counts[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}