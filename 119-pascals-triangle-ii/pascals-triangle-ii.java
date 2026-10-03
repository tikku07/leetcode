class Solution {
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
