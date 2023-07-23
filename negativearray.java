
// Given an array of  n integers, find and print its number of negative subarrays on a new line.



import java.io.*;
import java.util.*;
public class negativearray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int N;
        int count=0;
         int sum=0;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<N;i++)
        {
            for(int j=i;j<N;j++)
            {
                for(int k=i;k<=j;k++)
                     sum+=arr[k];
                if(sum<0)
                    count++;
                sum=0;
            }
        }
        System.out.println(count);
        
    }
}
