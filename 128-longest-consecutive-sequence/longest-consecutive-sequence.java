class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 1;
        int maxCount = 1;

        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        for(int i = nums.length-1;i>0;i--){
            if(nums[i]-1==nums[i-1]) {
                count++;
                maxCount = Math.max(count, maxCount);
            }
            else if (nums[i]==nums[i-1]) {
                continue;
            }
            else {
                count = 1;
            }
        }
        return maxCount;
    }
}