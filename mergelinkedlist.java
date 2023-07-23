// Question 5: Merge and Sort the elements in two Linked-List

// Skill Mapping: Intermediate

// Description: Consider two Linked-List with N number of integers in Data-Node respectively.

// Task 1- WAP in Java to merge both Linked-Lists.

// Task 2 - Sort the output Linked-List basis of its Data-Node in ascending order.

// Sample input: Linked-List-1:- 25->35->12->4->36->48

// Linked-List-2:- 8->32->22->45->63->49

// Output:- 4->8->12->22->25->32->35->36->45->48->49->63

import java.util.*;

public class mergelinkedlist {
    public static LinkedList<Integer> merge(LinkedList<Integer> l1,LinkedList<Integer> l2,int N1,int N2)
    {
        if(N1==0) return l2;
        if(N2==0) return l1;
        LinkedList<Integer> result=new LinkedList<Integer>();
        result.addAll(l1);
        result.addAll(l2);
        int temp=0;
        int index=0;
        for(int i=0;i<N1+N2-1;i++)
        {
            int min=result.get(i);
            for(int j=i+1;j<N1+N2;j++)
            {
                if(min>result.get(j)) {
                    min=result.get(j);
                    index=j;
                }
            }
            temp=result.get(i);
            result.set(i,min);
            result.set(index,temp);
        }
        return result;

    }
    public static void main(String[] args) {
        try {
        int N1,N2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the first linked list: ");
        N1=sc.nextInt();
        System.out.println("Enter the size of the second linked list: ");
        N2=sc.nextInt();
        if(N1==0 && N2==0) throw new Exception("Both the linked list should not be null");
        LinkedList<Integer> l1=new LinkedList<Integer>();
        LinkedList<Integer> l2=new LinkedList<Integer>();
        System.out.println("Enter elements for first linked list");
        for(int i=0;i<N1;i++) 
            l1.add(sc.nextInt());
            System.out.println("Enter elements for second linked list");
        for(int i=0;i<N2;i++)
            l2.add(sc.nextInt());
        LinkedList<Integer> result=new LinkedList<Integer>();
        result=merge(l1,l2,N1,N2);
        System.out.println("Elements after merging is: ");
        for(Integer i:result)
            System.out.print(i+" ");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }


    }
}
