import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        solve(s, 0, "", result);
        return result;
    }

    private void solve(String s, int index, String current, List<String> result) {
        if (index == s.length()) {
            result.add(current);
            return;
        }

        char ch = s.charAt(index);

        if (Character.isDigit(ch)) {
            solve(s, index + 1, current + ch, result);
        } 
        
        else {
            solve(s, index + 1, current + Character.toLowerCase(ch), result);
            solve(s, index + 1, current + Character.toUpperCase(ch), result);
        }
    }
}
