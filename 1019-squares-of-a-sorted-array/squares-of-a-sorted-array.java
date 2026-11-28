class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int pos = nums.length - 1;
        int[] ans = new int[nums.length];

        while(left<=right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if(leftSquare>rightSquare){
                ans[pos] = leftSquare;
                left++;
            }
            else {
                ans[pos] = rightSquare;
                right--;
            }
            pos--;
        }
        return ans;
    }
}