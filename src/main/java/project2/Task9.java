package project2;

import java.lang.reflect.Array;

//Find the First Non-Repeating Character in a String: Given a string, find and
//return the first non-repeating character. For example, in the string
//"abracadabra", the first non-repeating character is 'c'.
public class Task9 {
    public static void main(String[] args) {
        String str = "abracadabra";

        for (int i = 0; i <str.length() ; i++) {
            boolean nonRepeat=true;

            for(int j=0;j<str.length();j++) {
                if(i !=j && str.charAt(i)==str.charAt(j)) {
                  nonRepeat=false;
                    break;
                }}
            if(nonRepeat){
                    System.out.print("first non-repeated character in string is:"+str.charAt(i));
             break;
        }
    }
}}
