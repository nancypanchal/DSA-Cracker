class Solution {
    public boolean isPalindrome(String s) {
        String y = "";
        System.out.print("s = ");
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i = clean.length()-1;i>=0;i--){
            y=y+clean.charAt(i);
        }
        if(clean.equals(y)){
           return true;
        }
        else{
            return false;
        }

    }
}