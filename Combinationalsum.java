import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        
        return result;
    }

    void backtrack(int[] candidates, int target, int index,
                   List<Integer> current,
                   List<List<Integer>> result) {
        
        // Target reached
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Check all candidates
        for (int i = index; i < candidates.length; i++) {
            
            if (candidates[i] > target) {
                continue;
            }

            // Choose the candidate
            current.add(candidates[i]);

            // Same index because number can be reused
            backtrack(candidates, target - candidates[i],
                      i, current, result);

            // Backtracking: remove last element
            current.remove(current.size() - 1);
        }
    }
}
