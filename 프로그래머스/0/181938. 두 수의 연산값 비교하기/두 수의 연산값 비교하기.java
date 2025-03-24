class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int A = 2*a*b;
        String words = "" +a+b;
        int B = Integer.valueOf(words);
        if (A>B){
            answer = A;
        }else{
            answer = B;
        }
        return answer;
    }
}