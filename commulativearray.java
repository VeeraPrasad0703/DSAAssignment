// Question 1: Cumulative Multiple of an Array with exception handling
// Description: Consider an Array with N number of integers.

// Task 1- WAP in Java to calculate cumulative multiple at each index.

// Task 2 – Push the result into the same Array and Print.

// Task 3 - Handle the exceptions in program

// Sample input: arrNum = [5, 3, 4, 2, 0, 8]

// Output:- arrNum = [5, 15, 60, 120, 0, 0]

// Explanation:- arrNum[0] -> C.M. = 5

// arrNum[1] -> C.M. = 5 x 3

// arrNum[2] -> C.M. = 5 x 3 x 4

// arrNum[3] -> C.M. = 5 x 3 x 4 x 2

// arrNum[4] -> C.M. = 5 x 3 x 4 x 2 x 0

// arrNum[5] -> C.M. = 5 x 3 x 4 x 2 x 0 x 8





import java.util.Scanner;
public class commulativearray
{
    public static void findcommulative(long[] arr,int N)
    {
        // int prev=1;
        for(int i=1;i<N;i++)
        {
            if(arr[i-1]==0) {
                arr[i]=0;
            }
            // prev=arr[i]*prev;
            arr[i]*=arr[i-1];
        }
    }
    public static void main(String[] args) throws Exception{
        try {
            int N;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of the array");
            N=sc.nextInt();
            if(N<=0) {
                throw new Exception("size should be greater than zero");
            }
            long[] arr=new long[N];
            System.out.println("Enter the elements of the array: ");
            for(int i=0;i<N;i++)
                arr[i]=sc.nextInt();
            findcommulative(arr,N);
            System.out.println("Elements after updation: ");
            for(int i=0;i<N;i++)
                System.out.print(arr[i]+" ");
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}