package lessons;

import java.util.regex.Pattern;

import model.Programmer;

// Recursion
public class Lesson9 {

    public static void main(String... args) {
        System.out.println(args);
        //0 .... n
        int n = 9;
        cyclePrint(9);
        System.out.println();
        recursionPrint(9);
        System.out.println();
        recursionPrintReverse(3);
        System.out.println();
        int fibo = getFiboByNumber(7);
        System.out.println("Fibo 7 = " + fibo);

        String strA = new String("A");
        String strB = new String("A");
        System.out.println(" == " + (strA == strB));
        System.out.println("equals " + strA.equals(strB));

        String str1P = "A";
        String str2P = "A";
        System.out.println(" ==P " + (str1P == str2P));

        String str9 = new String("One");
        str9 = str9.concat("Two");
        System.out.println(str9);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("One");
        stringBuilder.append("Two");
        stringBuilder.append(new Programmer("Ivan", "Ivanov", new String[]{"Java"}));
        System.out.println(stringBuilder.toString());

        stringBuilder.append(999);
        System.out.println(stringBuilder.toString());
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("One");

        String sentence = "Hello my Friend, HowTYerterter are you?";
        final String wordWithMaxLength = getWordWithMaxLength(sentence);
        System.out.println("Word with Max Length: " + wordWithMaxLength);


        String[] strs = sentence.split(" ");
        String newRepl = sentence.replace("?", " ").trim();
        sentence.trim();
        sentence.equalsIgnoreCase("CCC");
        sentence.charAt(0);

        String mathExpression = "2*3+(5+3) - 8+ ((5-7)";
        boolean correct = isMathExpressionCorrect(mathExpression);
        System.out.println("Math Expression Correct: " + correct);

        Pattern pattern = Pattern.compile("^A{3}.{3}");


        printVarArgs(1, 2, 3, 4);
        printVarArgs(1, 2, 3, 4, 9, 77, 78, 90, 34);
    }

    private static int getWordsNumber(String sentence) {
        //TODO ..
        return 0;
    }

    private static String getWordWithMaxLength(String sentence) {
        String maxLengthWord = "";
        for (String word : sentence.split(" ")) {

            String clearWord = replace(word, "?", "!", ".", ":", "\"", "\'", ";");
            if (clearWord.length() > maxLengthWord.length()) {
                maxLengthWord = clearWord;
            }
        }
        return maxLengthWord;
    }

    static String replace(String rawString, String... whatToEliminate) {
        for (String toEliminate : whatToEliminate) {
            rawString = rawString.replace(toEliminate, " ").trim();
        }
        return rawString;
    }

    private static boolean isMathExpressionCorrect(String mathExpression) {
        int countR = 0;
        int countL = 0;
        for (int i = 0; i < mathExpression.length(); i++) {
            if (mathExpression.charAt(i) == ')') {
                countL++;
            }
            if (mathExpression.charAt(i) == '(') {
                countR++;
            }
        }
        return countL == countR;
    }


    private static void cyclePrint(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    private static void recursionPrint(int n) {
        if (n == 0) {
            System.out.print(n + " ");
            return;
        }
        recursionPrint(n - 1);
        System.out.print(n + " ");
    }

    private static void recursionPrintReverse(int n) {
        if (n == 0) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        recursionPrintReverse(n - 1);

    }

    private static int getFiboByNumber(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return getFiboByNumber(n - 1) + getFiboByNumber(n - 2);
    }


    private static void printVarArgs(int... numbers) {
        System.out.println(numbers);
    }

    private static void printVarArgsX(int t, int... numbers) {
        System.out.println(numbers);
    }

    private static void printVarArgsY(Object... objects) {
        System.out.println(objects);
    }


}
