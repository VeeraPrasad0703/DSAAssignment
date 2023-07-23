// Question 6: Remove Duplicates from Linked-List

// Skill Mapping: Intermediate

// Description: Consider a Linked-List with N number of repeated integers in Data-Node.

// Task - WAP in Java to remove the repeated integer numbers from Linked-List.

// Sample input: Linked-List:- 2->5->12->2->3->5->1->2->5->5

// Output:- 2->5->12->3->1

// import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class removeduplicates {
    public static void removeduplicateselements(LinkedList<Integer> l1,int N1)
    {
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<N1;i++)
        {
            if(hs.contains(l1.get(i)))
            {
                N1=N1-1;
                i=i-1;
                l1.remove(i);
            }
            else
            {
                hs.add(l1.get(i));
            }
        }
    }
    public static void main(String[] args) {
        try {
            int N1;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of the linked list: ");
            N1=sc.nextInt();
            if(N1==0) throw new Exception("linked list should not be empty");
            LinkedList<Integer> l1=new LinkedList<Integer>();
            System.out.println("Enter elements for linked list");
            for(int i=0;i<N1;i++) 
                l1.add(sc.nextInt());
            removeduplicateselements(l1,N1);
            // for(int j=0;j<N1-result-1 && result<N1-1;j++)
            //     l1.removeLast();
            System.out.println("Elements after removing dupliactes: ");
            for(Integer i:l1)
                System.out.print(i+" ");
        
            }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
