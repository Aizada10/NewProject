package StringMethods;

import java.util.Scanner;

public class StringMethods2 {
    public static void main(String[] args) {

        /*
        get a work from user concat the word with "TECH"
        find the length of the new word
        find the first char and find the last char;
         */


        Scanner input=new Scanner(System.in);


        String string="flower";
        System.out.println();string.charAt(0);//index 0 will return first letter

        System.out.println(string.charAt(5));// index 5 will return last char
        System.out.println(string.charAt(string.length()-1)); //will return last char
      //  System.out.println(string.charAt(6)); run error index grader than length of word

       // System.out.println(string.charAt(-2)); // error also

      //  System.out.println(string.charAt(-1));










    }
}