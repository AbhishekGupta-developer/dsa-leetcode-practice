import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store value and index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement is already in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Put current number and index into the map
            map.put(nums[i], i);
        }
        
        // Return empty array if no solution is found (problem guarantees one solution)
        return new int[] {};
    }
}
