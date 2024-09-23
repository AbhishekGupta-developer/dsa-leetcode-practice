class Solution {
    public int findPeakElement(int[] nums) {
        int p1 = 0;
        int p2 = nums.length;
        int max = nums[0];
        int index = 0;

        while(p1<p2) {
            for(int i=p1; i<p2; i++) {
                if(nums[i]>max) {
                    max = nums[i];
                    index = i;
                }
            }
            System.out.println("p1: "+p1+" p2: "+p2);
            if((max!=nums[p1]) && (max!=nums[p2-1])) {
                return index;
            } else {
                p1++;
                p2--;
            }
        }
        return index;
    }
}