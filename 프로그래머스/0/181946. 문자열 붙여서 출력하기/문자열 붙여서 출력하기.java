import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        StringBuffer words = new StringBuffer();
        words.append(a);
        words.append(b);
        System.out.println(words);
    }
}