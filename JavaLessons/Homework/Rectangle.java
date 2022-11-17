import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Горизонтальная длина прямоугольника: ");
        int a = in.nextInt();
        System.out.print("Вертикальная длина прямоугольника: ");
        int b = in.nextInt();
        in.close();

        String vertical = "|", horizontal = "-", empty = " ", middle = "", firstlast = "";
        while (0 < a--) {
            firstlast += horizontal;
            middle += empty;
        }
        System.out.println(empty + firstlast + empty);
        while (0 < b--) System.out.println(vertical + middle + vertical);
        System.out.println(empty + firstlast + empty);
    }
}