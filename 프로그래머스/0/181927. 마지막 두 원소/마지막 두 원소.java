import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer;
        
        int A = num_list.length - 1;
        int b = 0; 
        answer = Arrays.copyOf(num_list,A+2);
        if (num_list[A-1] >= num_list[A]){
            b = num_list[A] * 2;
        }else{
            b = num_list[A] - num_list[A-1];
        }
        answer[answer.length-1] = b;
        return answer;
    }
}