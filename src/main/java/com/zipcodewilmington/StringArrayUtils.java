package com.zipcodewilmington;
import java.util.*;
/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> al = new ArrayList<>();
        al.add(array[0]);
        for (int i = 1; i < array.length-1; i++) {
            if (!array[i].equals(array[i+1])) {
                System.out.print(array[i]+", ");
                al.add(array[i+1]);
            }
        }

        System.out.println(al);
        return al.toArray(new String[al.size()]);

    }
    
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {


       return array[array.length-2];

//        String result="";
//        List<String> newArray = new ArrayList();
//        for(int i=1; i<array.length; i++){
//            newArray.add(array[i]);
//        }
//        return newArray.toString();

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        return Arrays.asList(array).contains(value);

    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        Collections.reverse(Arrays.asList(array));
        return array;

    }
    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        for(int i=0; i< (array.length-1)/2; i++){
            if(array[i]!=array[array.length-1-i]){
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        //create a set to store array's every letter;
        //if total letter less than 26, then it is false
        Set<String> set1 = new HashSet<>();
        String tmp = "";
        for(String words: array) {
            for (int i = 0; i < words.length(); i++) {
                tmp = String.valueOf(words.charAt(i));
                if (!tmp.equals(" ")) {
                    set1.add(tmp.toUpperCase());
                }
            }
        }
        return set1.size()==26;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count=0;
        for(String arrayValue: array){
            if(arrayValue.equals(value)){
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equalsIgnoreCase(valueToRemove)) {
                al.add(array[i]);
            }
        }
        return al.toArray(new String[al.size()]);
    }



    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        ArrayList<String> al = new ArrayList<>(Arrays.asList(array));
        String tmp="";

        for (int i = 0; i < array.length-1; i++) {
            tmp=array[i];
            if (array[i].equals(array[i+1])) {
                tmp+=array[i+1];
            }
        }
        return al.toArray(new String[al.size()]);
    }
}
