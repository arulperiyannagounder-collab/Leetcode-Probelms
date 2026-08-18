import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(0, 0, n, "", res);
        return res;
    }

    private void backtrack(int ob, int cb, int n, String str, List<String> res) {
        
        if (str.length() == 2 * n) {
            res.add(str);
            return;
        }

        
        if (ob < n) {
            backtrack(ob + 1, cb, n, str + "(", res);
        }

        
        if (cb < ob) {
            backtrack(ob, cb + 1, n, str + ")", res);
        }
    }
}
