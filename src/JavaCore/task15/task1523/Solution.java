package JavaCore.task15.task1523;

/*
Перегрузка конструкторов
*/

public class Solution {

    public int age, high;
    public String name;
    boolean sex;

    public Solution(boolean sex) {
        this.sex = sex;
    }

    Solution(int age) {
        this.age = age;
    }

    private Solution(int age, int high, String name) {
        this.age = age;
        this.high = high;
        this.name = name;
    }

    protected Solution(int age, int high) {
        this.age = age;
        this.high = high;
    }

    public static void main(String[] args) {

    }


}
//Чтобы решить эту задачу:
//
//    Создай 4 конструктора с разными модификаторами доступа в классе Solution.
//    В отдельном файле создай класс SubSolution и сделай его потомком класса Solution.
//    Внутри класса SubSolution создай конструкторы командой Alt+Insert -> Constructors.
//    Исправь модификаторы доступа конструкторов в SubSolution так, чтобы получилось 3 разных (все, кроме private).
//
//Требования:
//
//    •
//    В классе SubSolution должно содержаться 3 различных конструктора.
//    •
//    В классе Solution должно содержаться 4 различных конструктора.
//    •
//    В классе Solution должны быть объявлены конструкторы со всеми возможными модификаторами доступа.
//    •
//    В классе SubSolution должны быть объявлены конструкторы со всеми возможными модификаторами доступа, кроме private.
//    •
//    Класс Solution должен быть родителем класса SubSolution.
