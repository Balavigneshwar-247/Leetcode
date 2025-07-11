class Solution {
    public String removeOuterParentheses(String s) {
        int st = 0;
        StringBuilder end = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '(' && st++ > 0) end.append(c);
            if(c == ')' && st-- > 1) end.append(c);
        }
        return end.toString();
    }
}