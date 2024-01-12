package JavaCore.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        System.out.println(gcd(num1, num2));
    }
//    public static void GCD(int num1, int num2){
//        int counter = 0;
//        int mod_counter = 0;
//        if(num1 > num2){
//            while(num1 > num2 && (num1 != 0 || num2 != 0)){
//                mod_counter = num1 - num2;
//                counter++;
//            }
//            num1 = counter * num2 - mod_counter;
//            System.out.println(num1);
//        }else{
//            while(num1 < num2 && (num1 != 0 || num2 != 0)){
//                num2 -= num1;
//                counter++;
//            }
//        }
    public static int gcd(int num1, int num2){
        while(num2 != 0){
            int t;
            t = num2;
            num2 = num1 % num2;
            num1 = t;
        }
        return num1;
    }

        //System.out.println(num1);
        //System.out.println(num2);
        //System.out.println(counter);
    }

//Давай найдем наибольший общий делитель (НОД). Для этого:
//
//    Введи с клавиатуры 2 целых положительных числа.
//    Выведи в консоли наибольший общий делитель.
//
//Требования:
//
//    •
//    Программа должна считывать с клавиатуры 2 строки.
//    •
//    Программа должна выводить данные на экран.
//    •
//    Программа должна выводить на экран наибольший общий делитель (НОД) чисел, считанных с клавиатуры, и успешно завершаться.