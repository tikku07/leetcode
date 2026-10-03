class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>hp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int m=nums[i];
            int n=target-nums[i];
            if(hp.containsKey(m)) return new int[]{i,hp.get(m)};
            else{
                hp.put(n,i);
            }
        }
       return new int[]{0,0} ;
    }
}