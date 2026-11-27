class Solution {
    public int divide(int dividend, int divisor) {

        // Overflow condition
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Convert to long to handle negative numbers safely
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        // Determine the sign of the result
        boolean negative = (dividend < 0) ^ (divisor < 0);

        long result = 0;

        // Subtract divisor using bit shifting
        while (a >= b) {
            long temp = b;
            long multiple = 1;

            // Find the largest multiple of divisor
            while (a >= (temp << 1)) {
                temp = temp << 1;
                multiple = multiple << 1;
            }

            // Subtract and update quotient
            a = a - temp;
            result = result + multiple;
        }

        // Apply sign
        if (negative) {
            result = -result;
        }

        return (int) result;
    }
}
