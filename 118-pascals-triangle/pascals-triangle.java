import java.util.ArrayList;
import java.util.List;

class Solution {
    // Kept your exact code logic, only renamed the method to 'generate'
    public List<List<Integer>> generate(int n) {
        ArrayList<List<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>row=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(getRow(i));
        }
        return ans;
    }
    
    public List<Integer> getRow(int rowIndex) {
        long ans=1;
        ArrayList<Integer>arr=new ArrayList<>();
       
        int r=rowIndex+1;
        arr.add((int) ans);
        for(int i=1;i<r;i++){
            ans=ans*(r-i);
            ans/=i;
            arr.add((int) ans);
        }
        return arr;
    }
}
