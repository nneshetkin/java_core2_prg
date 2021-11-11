package lesson2.homework;
//1. Напишите метод, на вход которого подаётся двумерный строковый массив
//размером 4х4, при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
//Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
//должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
//3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException,
//и вывести результат расчета.

public class HomeWork2 {

    public static void main(String[] args) {
        String[][] arr1 = new String[][]{
                {"1", "2", "3", "5",},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "1"}};

        try {
            ArraySummator.sum(arr1);
        } catch (MyArraySizeException e ) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

