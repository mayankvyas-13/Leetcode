class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int leftEnd = nums1.length - 1;
        // int rightEnd = nums2.length - 1;

        for(int i = 0;i<nums2.length;i++){
            nums1[leftEnd] = nums2[i];
            leftEnd--;
        }
        Arrays.sort(nums1);
    }
}