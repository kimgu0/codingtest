class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String A = (a+"") + (b+"");  
        String B = (b+"") + (a+""); 
        int n1 = Integer.valueOf(A);
        int n2 = Integer.valueOf(B);
        if (n1 < n2 || n1 == n2){
            answer = n2;  
            }else{
                answer = n1;
        }
         
        return answer;
    }
}