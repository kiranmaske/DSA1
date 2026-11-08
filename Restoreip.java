import java.util.*;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, 0, new ArrayList<>(), result);
        return result;
    }

    void backtrack(String s, int index, int parts,
                   List<String> path, List<String> result) {

        // If four parts are formed
        if (parts == 4) {
            if (index == s.length()) {
                result.add(String.join(".", path));
            }
            return;
        }

        // Try segments of length 1 to 3
        for (int len = 1; len <= 3; len++) {

            if (index + len > s.length()) {
                break;
            }

            String part = s.substring(index, index + len);

            // Leading zero condition
            if (part.length() > 1 && part.charAt(0) == '0') {
                break;
            }

            // Value must be between 0 and 255
            if (Integer.parseInt(part) > 255) {
                break;
            }

            path.add(part);

            backtrack(s, index + len, parts + 1, path, result);

            // Backtracking
            path.remove(path.size() - 1);
        }
    }
}
