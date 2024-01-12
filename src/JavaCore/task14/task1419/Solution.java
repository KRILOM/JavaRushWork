package JavaCore.task14.task1419;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int num[] = {1, 2};
            System.out.println(num[3]);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            String a = "This is like chipping "; // length is 22
            char c = a.charAt(24); // accessing 25th element
            System.out.println(c);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Class.forName("Class1");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int num = Integer.parseInt ("akki") ;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            String a = null; //null value
            System.out.println(a.charAt(0));
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            FileReader file = new FileReader("");
            } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int num[] = new int[-3];
            System.out.println(num.length);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Object[] array = new String[2];
            array[0] = 5;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            List<String> list = new ArrayList<>();
            list.add("Alive");
            list.add("is");
            list.add("Awesome");
            list.get(5);
        } catch (Exception e) {
            exceptions.add(e);
        }
        //напишите тут ваш код

    }
}
