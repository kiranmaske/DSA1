class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;  // Convert 1-26 to 0-25

            int remainder = columnNumber % 26;
            sb.append((char) ('A' + remainder));

            columnNumber = columnNumber / 26;
        }

        return sb.reverse().toString();
    }
}
