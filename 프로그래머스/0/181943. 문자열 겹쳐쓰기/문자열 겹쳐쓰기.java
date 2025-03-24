class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        StringBuffer words = new StringBuffer();
        for (int i = 0; i<s; i++){
            words.append(my_string.charAt(i));
        }
        for (int i = 0; i< overwrite_string.length(); i++){
            words.append(overwrite_string.charAt(i));
            
        }
        for (int i = overwrite_string.length()+s; i<my_string.length(); i++){
            words.append(my_string.charAt(i));
        }
        answer = String.valueOf(words);
        return answer;
        
    }
}