    class Solution {
    public int singleNumber(int[] nums) {
        
        Set<Integer> numbers = new HashSet<>();
        for( int i=0; i< nums.length;i++){
            if(numbers.contains(nums[i])){
                numbers.remove(nums[i]);
            }else{
                numbers.add(nums[i]);
            }
        }
        for( int i:numbers){
            return i;
        }
        return -1;
    }
}