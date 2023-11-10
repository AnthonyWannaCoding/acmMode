package oppo;

import java.util.Scanner;

public class Main {
//    7 3
//            1 2 3 4 5 6 7
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();

        int[] nums=new int[n];
        int ans=n;


        int left=0;

        for(int i=0;i<n;i++){
            int x=scanner.nextInt();
            while(x%2==0){
                nums[i]+=1;
                x/=2;
            }
        }

        while(left<n){
            if(nums[left]<k){
                left++;
                continue;
            }
            int right=left;
            int tmp=0;
            while(right<n){
                if(nums[right]>=k){
                    right++;
                }else{
                    tmp=right-left+1;
                    ans=Math.min(ans,tmp);
                    break;
                }
            }
            left=right;

        }
        System.out.println(ans);
    }
}
