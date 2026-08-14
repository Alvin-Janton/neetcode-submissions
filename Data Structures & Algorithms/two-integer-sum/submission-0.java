class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int [] indexes = new int[2];
        int difference;

        for(int i=0; i<nums.length; i++){
            difference = target - nums[i];
            if(map.containsKey(difference)){
                indexes[0] = map.get(difference);
                indexes[1] = i;
                break;
            }

            map.put(nums[i], i);
        }

        return indexes;
    }
}
