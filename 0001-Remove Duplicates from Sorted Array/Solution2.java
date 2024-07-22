class Solution {
    public int removeDuplicates(int[] nums) {
      int k = 0;
      int[] newArray = new int[nums.length];
      for(int i=0; i<nums.length; i++) {
        if(i == nums.length-1 || nums[i] != nums[i+1]) {
            newArray[k] = nums[i];
            k++;
        }
      }
      for(int i=0; i<newArray.length; i++) {
        nums[i] = newArray[i];
      }
      return k;
    }
}