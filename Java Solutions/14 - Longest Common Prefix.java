class Solution {
    public String longestCommonPrefix(String[] strs) {

        String lcs = "";
        if (strs.length == 0) {
            return lcs;
        }
        int index = 0;
        for (char c : strs[index].toCharArray()) {
            for (int i = 1; i < strs.length; i++) {
                if (index >= strs[i].length() || c != strs[i].charAt(index)) {
                    return lcs;
                }
            }
            lcs = lcs + c;
            index++;
        }
        return lcs;
    }
}