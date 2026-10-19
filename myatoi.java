class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        int sign = 1;
        long num = 0;

        // 1. Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Check the sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        // 3. Convert digits and handle overflow
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';

            num = num * 10 + digit;

            if (sign * num <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (sign * num >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            i++;
        }

        // 4. Return the signed integer
        return (int) (sign * num);
    }
}
