class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for(int i = 1;i<nums.length;i++){
            if(nums[i]<0){
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }

            currentMax= Math.max(nums[i],nums[i]*currentMax);
            currentMin = Math.min(nums[i],nums[i]*currentMin);

            maxProd = Math.max(maxProd,currentMax);
        }
        return maxProd;
    }
}