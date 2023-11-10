package xiecheng;

import java.util.Scanner;

//5 3
//        abcde
//        2 4
//        5 8
//        1 3
//aabbbbcccddddee
public class strProcess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        String s = scanner.next();
        while (q-- > 0) {
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                ans.append(s.charAt(i));
                if (i >= left - 1 && i <= right - 1) {
                    ans.append(s.charAt(i));
                }
            }
            s = ans.toString();
        }
        System.out.println(s);
    }
}
