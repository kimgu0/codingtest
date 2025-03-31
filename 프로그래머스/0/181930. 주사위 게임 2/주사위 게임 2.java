class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int[] a1 = {a,b,c};
        int count = 0;
        for (int i = 1 ; i<a1.length; i++){
            if (count == 2){
                break;
            }
            else if(a1[0]==a1[i]){
                count += 1;
            }
        }
        if (count < 2){
            if (b == c){
                count += 1;
            }
        }
        switch(count){
            case(0):
                answer = a+b+c;
                break;
            case(1):
                answer = (a+b+c)*((int)Math.pow(a,2)+(int)Math.pow(b,2)+(int)Math.pow(c,2));
                break;
            case(2):
                answer =(a+b+c)*((int)Math.pow(a,2)+(int)Math.pow(b,2)+(int)Math.pow(c,2))*((int)Math.pow(a,3)+(int)Math.pow(b,3)+(int)Math.pow(c,3));
                break;
        }
        return answer;
    }
}