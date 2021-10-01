// Java Program to Remove Duplicate Elements
// From the Array using Set
package project1;
import java.util.*;

public class removeDuplicate {

    // Function to remove duplicate from array
    public static void removeDuplicates(int[] a)
    {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        // adding elements to LinkedHashSet
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);
        // Print the elements of LinkedHashSet
        System.out.print(set);
    }

    // Driver code
    public static void main(String[] args)
    {
        int a[] = {5,2,6,8,6,7,5,2,8};

        // Function call
        removeDuplicates(a);
    }
}