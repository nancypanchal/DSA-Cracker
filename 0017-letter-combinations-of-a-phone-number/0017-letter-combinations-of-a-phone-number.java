class Solution {
    private final String[] buttons = {"" ,  "" ,  "abc" ,  "def" ,  "ghi" ,  "jkl" ,  "mno" ,  "pqrs" ,  "tuv" ,  "wxyz"};
    
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if(digits.length() == 0){
            return result ;
        }
        solve(digits , 0 , "" , result);
        return result ;
    }

    private void solve (String digits , int index , String current , List<String>result){
        if (index == digits.length()){
            result.add(current) ;
            return ;
        }
        int currentDigit = digits.charAt(index) - '0' ;
        String letters = buttons[currentDigit];
        
        for (int i = 0; i < letters.length(); i++) {
            solve(digits, index + 1, current + letters.charAt(i), result);
        }
    }
}