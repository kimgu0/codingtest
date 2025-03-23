import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = a.toUpperCase();
        String c = a.toLowerCase();
        StringBuffer words = new StringBuffer();

        for (int i = 0; i< a.length(); i++){
            if (a.charAt(i) != b.charAt(i)){
                words.append(b.charAt(i));
            }else{
                words.append(c.charAt(i));
                }
        }
        System.out.println(words);
    }
}