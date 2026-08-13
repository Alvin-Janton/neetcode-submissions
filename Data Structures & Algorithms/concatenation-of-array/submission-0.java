class Solution {
    public int[] getConcatenation(int[] nums) {
        int []nums2 = new int[nums.length * 2];

        int right = 0;
        int left = nums.length;

        for(int i=0; i<nums.length; i++){
            nums2[right] = nums[i];
            nums2[left] = nums[i]; 
            right++;
            left++;
        }

        return nums2;
    }
}