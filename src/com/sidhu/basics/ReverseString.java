package com.sidhu.basics;

import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
            String str = "sidhu";
            String reversed = "";

            for(int i = str.length()-1;i>=0;i--){
                reversed += str.charAt(i);
            }
            System.out.println(reversed);
    }
}
