import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        // Total elements in the sequence is 2^n
        int numElements = 1 << n; 
        
        for (int i = 0; i < numElements; i++) {
            // Apply the formula: i XOR (i shifted right by 1)
            result.add(i ^ (i >> 1));
        }
        
        return result;
    }
}
