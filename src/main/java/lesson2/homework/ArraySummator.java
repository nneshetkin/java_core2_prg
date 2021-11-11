package lesson2.homework;

public class ArraySummator {

    public static int sum(String[][] arr) {

        if (arr.length != 4) throw new MyArraySizeException("Only 4x4 array ");
        int sum = 0;
        for (int y = 0; y < arr.length; y++) {
            if (arr[y].length != 4) throw new MyArraySizeException("Only 4x4 array ");
            for (int x = 0; x < arr[y].length; x++) {
                try {
                    sum += Integer.parseInt(arr[y][x]);
                } catch (NumberFormatException e) {
//                    System.err.printf("Not a number data at cell [%d][%d]\n", x + 1, y + 1);
                    throw new MyArrayDataException(String.format("Not a number data at cell [%d][%d]", x + 1, y + 1));
                }
            }
        }
        System.out.println("Sum is " + sum);
        return sum;
    }

}
