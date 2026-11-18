class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        String newStr = str.substring(1, str.length() - 1);
        return newStr.contains(s);
    }
}
