package dia8;
//1. Write a Java program to sort a numeric array and a string array.

import java.util.Arrays; 
public class Array {
public static void main(String[] args){   

    int[] my_array1 = {
            1, 2 ,3,4,5,6,7};
            
    String[] my_array2 = {
            "a",
			
            "b",
            "c",
            "d",
            "e",
            "f"
        };        
    System.out.println("Original numeric array : "+Arrays.toString(my_array1));
    Arrays.sort(my_array1);
    System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));
    
    System.out.println("Original string array : "+Arrays.toString(my_array2));
    Arrays.sort(my_array2);
    System.out.println("Sorted string array : "+Arrays.toString(my_array2));
    }
}