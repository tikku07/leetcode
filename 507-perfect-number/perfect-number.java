class Solution {
    public boolean checkPerfectNumber(int num) {
        Stack<Integer> arr=new Stack<>();
        for(int i=1;i<num;i++){
            if(num%i==0) arr.push(i);
        }
        
       
        int sum=0;
    while(!arr.isEmpty()){
            sum+=arr.pop();
        }
        if(sum==num) return true;
        return false;
    }
}