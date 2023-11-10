package xiecheng;

import java.util.*;
public class Main {

//    6
//            2 3 5 4 5 6
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=scanner.nextInt();
        }
        int res=1;
        int left=0;
        while (left<n-1){
            int right=left+1;
            while (right<n){
                if(Math.abs(num[right]-num[right-1])>1){
                    res=Math.max(res,right-left);
                    break;
                }else {
                    right++;
                    if(right==n-1){
                        res=Math.max(res,right-left+1);
                    }
                }
            }
            left=right;
        }
        System.out.println(res);
    }
}