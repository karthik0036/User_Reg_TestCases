package com.bridge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean firstName(String firstName){
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}+$");
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public static void main(String[] args) {
        boolean a = firstName("Adsfd");
        System.out.println(a);
    }

}
