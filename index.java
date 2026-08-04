class Solution {
    public int strStr(String haystack, String needle) {

        // If needle is longer than haystack, it can't be found
        if (haystack.length() < needle.length()) {
            return -1;
        }

        // Check every possible starting index
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            // Extract substring of needle's length and compare
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        // Needle not found
        return -1;
    }
}
