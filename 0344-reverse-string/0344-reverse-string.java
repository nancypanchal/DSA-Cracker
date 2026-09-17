class Solution {
    public void reverseString(char[] s) {
     
      reverseFunction(s , 0 , s.length - 1);
    }

    public void reverseFunction(char[]s , int left , int right){
        if(left >= right){
            return;
        }
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        
        reverseFunction(s , left + 1 , right - 1);
    }

}