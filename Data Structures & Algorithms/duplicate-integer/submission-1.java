class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> list = new HashMap<>();

       for(int i=0; i<nums.length; i++){
        if(list.containsKey(nums[i])){
            return true;
        }
        else{
            list.put(nums[i],1);
        }
       }
       return false; 
    }
}