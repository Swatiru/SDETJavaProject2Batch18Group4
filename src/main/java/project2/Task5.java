package project2;

import java.util.Arrays;

//Check if Two Strings are Anagrams: Given two strings, determine if they
//are anagrams, meaning they contain the same characters in a different order.
//For example, "listen" and "silent" are anagrams.
public class Task5 {
    public static void main(String[] args) {
          String s1 = "listen";
          String s2 = "silent";
           // check if length is same
         if (s1.length() == s2.length()) {

            // convert string to array
            char[] array1 = s1.toCharArray();
            char[] array2 = s2.toCharArray();

            // sort the char array
            Arrays.sort(array1);
            Arrays.sort(array2);

            if (Arrays.equals(array1, array2)) {
                System.out.println(s1 + " and " + s2 + " are anagram");
            } else System.out.println(s1 + " and " + s2 + " are not anagram");

        }
    }
}
