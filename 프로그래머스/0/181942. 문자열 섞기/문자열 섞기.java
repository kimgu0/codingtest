class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        StringBuffer words = new StringBuffer();
        words.append(str1);
        int count = 1;
        for (int i = 0; i<str2.length(); i++){
            words.insert(count,str2.charAt(i));
            count +=2;
        }
        answer = String.valueOf(words);
        return answer;
    }
}