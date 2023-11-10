package meituan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        while(T-->0){
            String s=scanner.next();
            String t=scanner.next();

            int ans=0;
            if(s.length()>t.length()){
                ans+=s.length()-t.length();
            }
            for(int i=0;i<t.length();i++) {
                if (s.charAt(i) != t.charAt(i)) {
                    ans++;
                }
            }
            System.out.println(ans);
        }

    }
}
