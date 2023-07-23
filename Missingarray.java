// Question 2: Find missing numbers in array 
// Description: Consider an array with N number of consecutive integers, in which few numbers are missing. Find and list down these missing numbers using Java.

// Sample input: arrNum = {1, 2, 4, 5, 6}

// Output: 3

// Sample input: arrNum = {1, 2, 3, 5, 6, 8, 10, 11, 14}

// Output: 4, 7, 9, 12, 13

import java.util.*;
class Solution
{
    static List<Integer> l=new ArrayList<Integer>();
    public static List<Integer> findMissing(int[] arr,int N)
    {
        int i=0;
        int prev=arr[i];
        while(i<N-1)
        {
            if(arr[i+1]==prev+1)
            {
                i++;
                prev=arr[i];
            }
            else
            {
                l.add(prev+1);
                prev=prev+1;
            }
        }
    return l;
}
}

public class Missingarray {
    public static void main(String[] args) {
        try {
            int N;
            List<Integer> result=new ArrayList<Integer>();
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
            result=Solution.findMissing(arr, N);
            System.out.println("Missing elements are: ");
            for(Integer i:result)
            {
                System.out.print(i+" ");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
