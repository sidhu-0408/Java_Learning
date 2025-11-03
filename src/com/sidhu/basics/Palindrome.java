package com.sidhu.basics;

public class Palindrome {
    public static void main(String[] args) {
        String str = "amma";
        String str2 = "dog";

        String reversed = new StringBuilder(str).reverse().toString();
        if(str.equals(reversed)){
            System.out.println(str +" is Palindrome");
        }
        else
        System.out.println(str + " is not Palindrome");
    }
}
