import java.util.Scanner;

public class Decompose_Rectangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Горизонтальная длина прямоугольника: ");
        int a = in.nextInt();
        System.out.print("Вертикальная длина прямоугольника: ");
        int b = in.nextInt();
        in.close();

        designRectangle(' ', '|', '-', a, b);
    }

    static void designRectangle(char cornersChar, char verticalChar, char horizontalChar, int width, int height) {
        doString(cornersChar, horizontalChar, width, 1);
        doString(verticalChar, ' ', width, height);
        doString(cornersChar, horizontalChar, width, 1);
    }

    static void doString(char borderChar, char middleChar, int sideLength, int stringCount) {
        String sourceString = "";
        while (0 < sideLength--) sourceString += middleChar;

        duplicateStrings(borderChar + sourceString + borderChar, stringCount);
    }

    static void duplicateStrings(String sourceString, int stringCount) {
        while (0 < stringCount--) System.out.println(sourceString);
    }

}