/* 
*  FileName     : arraySearchCmpUniqElems.java
*
*  Date         : 06 Apr 2026
*
*  Version      : 1.0
*
*  Author       : Afreen B Junaid
*
*  Description  : This program defines a method to check if two integer arrays have the same unique elements. 
*                 It uses HashSet to store unique elements from both arrays and compares the sets for equality.
*                 The main method prompts the user to input two arrays, calls the method to check for unique 
*                 elements, and prints the results. 
*
*  Note         : The program assumes that the user will input valid integers and does not handle exceptions for invalid input.
*                 The program also assumes that the size of the arrays will be non-negative.
*/
/* Import necessary classes for handling arrays, sets, and user input. */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/* Define the main class for the program. */
public class arraySearchCmpUniqElems {
    /* This method checks if two integer arrays have the same unique elements 
    *  by comparing their hash sets of unique elements. It returns true if the arrays 
    *  have the same unique elements, false otherwise. */
    public static boolean haveSameUniqueElements(Integer[] array1, Integer[] array2) {
        /* Convert both arrays to sets to get unique elements and compare the sets. */
        Set<Integer> arrset1 = new HashSet<>(Arrays.asList(array1));
        Set<Integer> arrset2 = new HashSet<>(Arrays.asList(array2));
        /* The equals method of HashSet checks if both sets contain the same elements, regardless of order. */
        return arrset1.equals(arrset2);
    }

/* Main method to execute the program */
    public static void main(String[] args) {
        /* Create a Scanner object to read user input from the console. */
        Scanner scanner = new Scanner(System.in); 

        /* Prompt the user to input the size and elements of the first array. */
        System.out.print("Enter the size of array 1: ");
        int size1 = scanner.nextInt();
        Integer[] array1 = new Integer[size1]; // Initialize the first array with the specified size.
        System.out.println("Enter elements of array 1 (use spaces as delimiter):");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt(); // Read each element of the first array from user input.
        }

        /* Prompt the user to input the size and elements of the second array. */
        System.out.print("Enter the size of array 2: ");
        int size2 = scanner.nextInt();
        Integer[] array2 = new Integer[size2]; // Initialize the second array with the specified size.
        System.out.println("Enter elements of array 2 (use spaces as delimiter):");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt(); // Read each element of the second array from user input.
        }

        /* Call the method to check if the two arrays have the same unique elements and store the result. */
        boolean result = haveSameUniqueElements(array1, array2);

        /* Print the results, including the input arrays, their unique elements, and whether they have the same unique elements. */
        System.out.println("=======================================");
        System.out.println("=============== Result ================");
        System.out.println("=======================================");
        System.out.println("Input Array 1: " + Arrays.toString(array1));
        System.out.println("Input Array 2: " + Arrays.toString(array2) + "\n");
        System.out.println("Unique elements in Array 1: " + new HashSet<>(Arrays.asList(array1)));
        System.out.println("Unique elements in Array 2: " + new HashSet<>(Arrays.asList(array2)) + "\n");
        System.out.println("Do the input arrays have the same unique elements? : // " + result + " //");
        
        /* Close the scanner to prevent resource leaks. */
        scanner.close();
    }
}