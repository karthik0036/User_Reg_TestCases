package com.bridge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean firstName(String firstName){
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}+$");
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public static boolean lastName(String lastName){
        Pattern pattern = Pattern.compile("^[A-Z]+[a-z]{2,}$");
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public static boolean email(String email){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static boolean phone(String phone){
        Pattern pattern = Pattern.compile("^[0-9]{2}\\s{0,1}[0-9]{9,}$");
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    public static boolean pwdRule1(String password) {
        Pattern pattern = Pattern.compile("^[0-9a-zA-Z!,@#$&*().]{8,}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args) {
        boolean a = firstName("Firstname");
        System.out.println(a);

        boolean b = lastName("Lastname");
        System.out.println(b);

        boolean c = email("Aabc_123@gmail.co.in");
        System.out.println(c);

        boolean d = phone("91 9999888889");
        System.out.println(d);

        boolean e = pwdRule1("Abcd12!@");
        System.out.println(e);

    }

}
