package huawei;

import java.util.Scanner;

public class longPublicString {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N=1010;
        int[][] f=new int[N][N];
        char[] s=scanner.next().toCharArray();
        char[] t=scanner.next().toCharArray();
        int ns=s.length,nt=t.length;

        //最长公共字串

        int ans=0;

        for(int i=1;i<=ns;i++){
            for(int j=1;j<=nt;j++){
                if(s[i-1]==t[j-1]){
                    f[i][j]=f[i-1][j-1]+1;
                    ans=Math.max(ans,f[i][j]);
                }
            }
        }
        System.out.println(ans);
    }
}
