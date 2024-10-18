class Solution {
    public boolean containsDuplicate(int[] nums) {
        // int len = nums.length;
        // for(int i=0; i<len-1; i++) {
        //     for(int j=i+1; j<len; j++) {
        //         if(nums[i] == nums[j]) {
        //             return true;
        //         }
        //     }
        // }
        // // System.out.println(len);
        // return false;

        HashSet<Integer> seen = new HashSet<>();
    
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;  // Duplicate found
            }
            seen.add(num);
        }
        
        return false;  // No duplicates
    }
}