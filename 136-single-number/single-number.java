class Solution {
    public int singleNumber(int[] nums) {
        //your code goes here
        HashMap<Integer,Integer> hp= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hp.containsKey(nums[i])){
                hp.put(nums[i],hp.get(nums[i])+1);
            }
            else{
                 hp.put(nums[i],1);
            }
        }
          // Assumes 'i' is defined earlier in your code
for (Integer num : hp.keySet()) {
    // Fetch the list/array associated with the key 'num'
    if (hp.get(num) != 2) { 
        return num; // 'num' is already an Integer, no parsing needed
    }
}

        return 0;
    }
}