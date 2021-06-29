package com.company;

public class Main {

    public static void main(String[] args) {
        String text = "The only true wisdom is in knowing you know nothing. c.Socrates";
        int count = 0;
        for(int i=0; i < text.length(); i++){
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i'
                    || text.charAt(i) == 'o' || text.charAt(i) == 'u') {

                count++;
            }
            }
        System.out.println("There is " + count +" vowels in the string: " + text);


        //  Write a program that take a Strings
        //    //Print out the number of vowels in that string
        //    // Apples - 2 vowels "There are two vowels in the string, Apples"
    }
}
