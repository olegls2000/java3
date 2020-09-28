package lessons;


import model.*;


public class Lesson4 {
    public static void main(String[] args) {
        int[] unsorted = {2, 4, 7, 1, 66, 5, 8};
        Lesson3.printArrayByWhile(unsorted);
        int o = 6;
        boolean p = true;
        String str = "STR";

        sortArrayByBubble(unsorted);
        Lesson3.printArrayByWhile(unsorted);
        System.out.println();
        int[][] twoDimArray = {{2, 3, 4}, {5, 6, 88}, {8, 9, 10}};
        printTwoDimArray(twoDimArray);
        printMax(twoDimArray);
        printTwoDimArray(twoDimArray);

        doWhilePrintArray(unsorted);
        System.out.println();
        forEachPrintArray(unsorted);

        Men ivan = new Men(23, "Ivan", "Director");
        Men maria = new Men("Maria", "Secretar");
        System.out.println(maria.getName());

        Men[] people = {ivan, maria};

       /* System.out.println();
        System.out.println(ivan);
        System.out.println(maria);
        System.out.println();
        ivan = maria;
        System.out.println(ivan);
        System.out.println(maria);*/
        printOldestName(people);

        SimpleTriangle simpleTriangle = new SimpleTriangle(2, 2, 2);
    }

    public static void printOldestName(Men[] people) {
        Men oldest = people[0];
        for (Men men : people) {
            if (men.getAge() > oldest.getAge()) {
                oldest = men;
            }
        }
        System.out.println("Max age: " + oldest.getAge());
        System.out.println("Max age name: " + oldest.getAge());
    }

    public static void printLowestSalaryProfession(Men[] people) {

    }


    public static void doWhilePrintArray(int[] array) {
        int i = 0;
        do {
            System.out.print(array[i] + " ");
            i++;
        } while (i < array.length);
    }

    public static void forEachPrintArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
    }

    public static void printMax(int[][] array) {
        int iMax = 0;
        int jMax = 0;
        int iMin = 0;
        int jMin = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > array[iMax][jMax]) {
                    iMax = i;
                    jMax = j;
                }
                if (array[i][j] < array[iMin][jMin]) {
                    iMin = i;
                    jMin = j;
                }
            }
        }
        System.out.println("Max value = " + array[iMax][jMax]);
        System.out.println("Max value location = [" + iMax + ", " + jMax + "]");
        System.out.println("Min value = " + array[iMin][jMin]);
        System.out.println("Min value location = [" + iMin + ", " + jMin + "]");

        int temp = array[iMax][jMax];
        array[iMax][jMax] = array[iMin][jMin];
        array[iMin][jMin] = temp;
    }

    public static void printTwoDimArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] sortArrayByBubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
