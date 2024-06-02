package com.example.mylibrary;

/**
 * Counts the number of target occurances in an array
 *
 * @param array   The array to search
 * @param target   The target to search for
 * @return   The number of occurances in the array
 * @throws   IllegalArgumentException if array is null
 */
public class ArrayUtils {

    public static <T> int count(T[] array, T target){
        if(array == null){
            throw new IllegalArgumentException("Array cannot be null");
        }

        int count = 0;
        for(T element : array){
            if(target == null && element == null){
                count++;
            }else if(element != null && element.equals(target)){
                count++;
            }
        }
        return count;
    }
}