class Solution {
    public void nextPermutation(int[] nums) {
                int ind=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]) {
                ind=i;
                break;

            }
              }
                  if (ind == -1) {
            reverse(nums, 0, n - 1);
            return; 
        }
          for (int i = n - 1; i > ind; i--) {
            if (nums[i] > nums[ind]) {
                // Swap them
                int temp = nums[ind];
                nums[ind] = nums[i];
                nums[i] = temp;
                break;
            }
        }
         reverse(nums,ind+1,n-1);

         }


    
    public int[] reverse(int []arr,int left,int right){
        int temp=0;
        while(left<right){
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return arr;
    
    
    }
}