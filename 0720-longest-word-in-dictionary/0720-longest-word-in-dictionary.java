class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> set = new HashSet<>();
        String result = "";
        for(String s : words){
            if(s.length() == 1 || set.contains(s.substring(0,s.length()-1))){
                set.add(s);
                if(s.length()>result.length()){
                    result = s;
                }
            }
        }
        return result;
    }
}