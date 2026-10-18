class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> ht=new HashMap<>();
        ht.put('I',1);
        ht.put('V',5);
         ht.put('X',10);
          ht.put('L',50);
           ht.put('C',100);
            ht.put('D',500);
             ht.put('M',1000);
    int num=0;
             for(int i=0;i<s.length();i++){
              int currentVal = ht.get(s.charAt(i));
            
            // Check if there is a next character and if its value is greater
            if (i < s.length() - 1 && currentVal < ht.get(s.charAt(i + 1))) {
                num -= currentVal; // Subtraction rule (e.g., IV, IX)
            } else {
                num += currentVal; // Regular addition rule
            }}
             return num;
    }

}