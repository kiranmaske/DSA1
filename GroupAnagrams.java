import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            // Convert string into character array
            char[] ch = s.toCharArray();

            // Sort characters
            Arrays.sort(ch);

            // Sorted string becomes the key
            String key = new String(ch);

            // Add original string to its group
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
