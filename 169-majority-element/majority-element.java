class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        //Better 
        for(int i =0;i<nums.length;i++){
            if(hp.containsKey(nums[i])){
                hp.put(nums[i],hp.get(nums[i])+1);
            }
            else{
                 hp.put(nums[i],1);
            }
        }
        for(Integer num:hp.keySet()){
            if(hp.get(num)>nums.length/2) return num;

        }
        return 0;
    }
}