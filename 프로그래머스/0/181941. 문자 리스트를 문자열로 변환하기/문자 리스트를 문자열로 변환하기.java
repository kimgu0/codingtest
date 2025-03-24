class Solution {
    public String solution(String[] arr) {
        String answer = "";
        StringBuffer words = new StringBuffer();
        for (String A : arr){
            words.append(A);
        }
        answer = String.valueOf(words);
        return answer;
    }
}