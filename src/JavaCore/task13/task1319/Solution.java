package JavaCore.task13.task1319;

import java.io.*;

/*
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine())) ){
            String string = "";
            do{
                string = reader.readLine();
                writer.write(string + "\n");
            } while(!string.equals("exit"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

//В этой задаче тебе нужно:
//
//    Прочесть с консоли имя файла.
//    Считывать строки с консоли, пока пользователь не введет строку "exit".
//    Записать абсолютно все введенные в п.2 строки в файл: каждую строчку — с новой строки.
//
//Требования:
//
//    •
//    Программа должна считывать c консоли имя файла.
//    •
//    Создай и используй объект типа BufferedWriter.
//    •
//    Программа не должна ничего считывать из файловой системы.
//    •
//    Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
//    •
//    Программа должна записать все введенные строки (включая "exit", но не включая имя файла) в файл: каждую строчку — с новой строки.
//    •
//    Метод main должен закрывать объект типа BufferedWriter после использования.
//    •
//    Метод main не должен выводить данные на экран.