package JavaCore.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME));
            while(reader.ready()) {
                lines.add(reader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        System.out.println(lines);
    }
}
//Для решения этой задачи:
//
//    Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
//    В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.
//
//Требования:
//
//    •
//    Константа FILE_NAME не должна быть пустой.
//    •
//    В статическом блоке все строки из файла с именем FILE_NAME должны быть добавлены по отдельности в список lines.
//    •
//    Поле FILE_NAME НЕ должно быть final.
//    •
//    Класс Solution должен содержать список lines.