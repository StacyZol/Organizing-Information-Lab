package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Add code here to test your solutions

        int[] array = {6,12, 4, 15, 26, 32};
        findLargestAndSmallest(array);
        List<Integer> numberList = new ArrayList<>();

        numberList.add(2);
        numberList.add(6);
        numberList.add(8);
        sumOfTwoLargest(numberList);


    }

    /**
     * Question 1: Find the smallest and largest numbers in an array
     * <p>
     * You are given an array of integers, with at least two values.
     * Find the smallest and largest numbers in the array, and pass them back in an array containing two values,
     * the smallest and the largest.
     *
     * @param array An array of integers with at least two values
     * @return An array of integers with two elements, the largest and smallest from the method parameter
     */
    public static int[] findLargestAndSmallest(int array[]) {

        int minValue = 0;
        int maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                int x = maxValue;
               // array.remove(x);
            } else if (array[i] < minValue) {
                minValue = array[i];
            }
            System.out.println(minValue);
            System.out.println(maxValue);
            return new int[] {minValue, maxValue};

        }

        return new int[] {minValue, maxValue};


    }




        /**
         * Questions 2
         *
         * Given a List of Integers, return the sum of the two largest values.
         *
         * If the array is empty, return 0.
         * If the array has one value, return that value.
         *
         * @param intList A List of integers of any size.
         * @return Sum of the two largest values
         */

   public static int sumOfTwoLargest(List intList) {
        if (intList.size() == 0) {
            return 0;
        }
       else if (intList.size() == 1) {
            return (int) intList.get(0);
        }

       int largestA = (int) intList.get(0);
       int largestB = (int) intList.get(0);
       int x = 0;
       for (int i=0; i<intList.size(); i++) {
           if (intList[x] > largestA){
               largestA = intList[i];
           }
       }
   }


    /**
     * Question3: Remove duplicates from a List
     * <p>
     * You are given a List of Integers that might have duplicates. You must remove any duplicates from the List,
     * and return a List that doesn't contain duplicates. The order of the elements in the original List
     * does not need to be kept the same.
     * <p>
     * You MAY use any collections types you wish, but the method must return a List.
     * <p>
     * Example: [1,4,3,2,1] would return, in any order, [1,2,3,4]
     *
     * @param intList A List of Integers that may or may not include duplicates
     * @return A List of Integers that doesn't contain duplicates.
     */
    //public static List removeDuplicatesFromList(List intList) {

  //  }


    //BONUS QUESTION IS BELOW

    /**
     * BONUS:
     * <p>
     * Given two sorted arrays of integers, return a sorted array of the two original arrays merged together.
     * All valid numbers in these arrays are greater than 0.
     * <p>
     * array1 has enough empty space (represented by the value 0) to hold all valid values from the original two arrays
     * combined. The returned array must be array1 with the new values merged in.
     * <p>
     * For example:
     * array1 = [1,4,7,9,0,0,0]
     * array2 = [1,5,11]
     * returned array = [1,1,4,5,7,9,11]
     * <p>
     * No test cases are provided for this method, you will need to test it on your own.
     *
     * @param array1 Array of sorted integers
     * @param array2 Array of sorted integers
     * @return Array of sorted integers, merged from array1 and array2
     */
    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        return null;
    }

}
