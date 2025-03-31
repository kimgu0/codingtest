class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        StringBuffer ret = new StringBuffer();
        for(int i = 0; i<code.length(); i++){
            if (code.charAt(i) == '1' ){
                switch(mode){
                    case(0):
                        mode = 1;
                        continue;
                        
                    case(1):
                        mode = 0;
                        continue;
                        
                }
            }
            switch(mode){
                case(0):
                    if (i%2==0){
                        ret.append(code.charAt(i));
                        
                    }break;
                case(1):
                    if (i%2==1){
                        ret.append(code.charAt(i));

                    }break;
            }
        }
        answer = String.valueOf(ret);
        if (answer == null || answer.isEmpty()){
            answer = "EMPTY";
        }
        return answer;
    }
}