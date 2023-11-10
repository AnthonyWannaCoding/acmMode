package meituan;

import java.util.Scanner;

public class scholarship {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        while (T-->0){
            int n=scanner.nextInt(),x= scanner.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];

            for(int i=0;i<n;i++){
                a[i]=scanner.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i]=scanner.nextInt();
            }

            boolean ok=true;

            for(int b_num:b){
                if(b_num<60){
                    ok=false;
                    break;
                }
            }

            if(!ok){
                System.out.println("No");
            }else {
                int sum=0;
                int sumc=0;
                for(int i=0;i<n;i++){
                    sum+=a[i]*b[i];
                    sumc+=a[i];
                }
                if(sum<sumc*x){
                    System.out.println("No");
                }else {
                    System.out.println("Yes");
                }
            }

        }
    }
}
