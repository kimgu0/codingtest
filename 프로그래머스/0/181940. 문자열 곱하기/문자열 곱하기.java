class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        StringBuffer words = new StringBuffer();
        for (int i = 0; i<k; i++){
            words.append(my_string);
        }
        answer = String.valueOf(words);
        return answer;
        
    }
}