//  Find the count of singulars in array
// Description: Consider data with assorted details of socks pair IDs. Each element in the array represents a number of similar pairs. You will have to find out how many singular socks are present which do not have any pair left.

// Sample input: arrNum = {10, 20, 20, 10, 10, 30, 50, 10, 20}

// Output: Count of singular socks = 3

// Explanation : Socks Id - 10: total count 4 => Two pairs of socks - no singular left

// Socks Id - 20: total count 3 => One pair of socks - 1 singular left

// Socks Id - 30: total count 1 => No pair of socks - 1 singular left

// Socks Id - 50: total count 1 => No pair of socks - 1 singular left

// So, Total number of Singular socks = 3

import java.util.*;

public class singulararray {
    public static int findSockets(int[] arr,int N)
    {
        int socks=0;
        int count=0;
        int i=0,j=0;
        if(N==1) return 1;
        Arrays.sort(arr);
        for(i=0,j=0;j<N;)
        {
            if(arr[i]!=arr[j])
            {
                i=j;
                if(count%2!=0) {
                    socks++;
                }
                 count=0;
            }
            else {
                count++;
                j++;
            }
        }
        if(arr[j-1]!=arr[j-2])
            socks++;
        return socks;

    }
    public static void main(String[] args) {
        try {
                int N;
                int Nofsocks=0;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the size of the array");
                N=sc.nextInt();
                if(N<=0) {
                    throw new Exception("size should be greater than zero");
                }
                int[] arr=new int[N];
                System.out.println("Enter the elements of the array: ");
                for(int i=0;i<N;i++)
                    arr[i]=sc.nextInt();
                Nofsocks=findSockets(arr,N);
                System.out.println("Total number of Singular socks "+Nofsocks);
            }
            catch(Exception e)
            {  
                 System.out.println(e);
            }
    }
}
