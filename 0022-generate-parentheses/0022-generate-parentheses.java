import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        solve(n, 0, 0, "", result);
        return result;
    }

    private void solve(int n, int startCount, int endCount, String current, 
    List<String> result) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (startCount < n) {
            solve(n, startCount + 1, endCount, current + "(", result);
        }

        if (endCount < startCount) {
            solve(n, startCount, endCount + 1, current + ")", result);
        }
    }
}
