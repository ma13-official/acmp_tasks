import java.util.Scanner;
import static java.lang.Math.abs;


/***
 * ЗАДАЧА №12
 * Дачники
 * (Время: 1 сек. Память: 16 Мб Сложность: 45%)
 * <p>
 * Входные данные
 * В первой строке входного файла INPUT.TXT записано натуральное число N (1 ≤ N ≤ 1000) – количество дачников,
 * далее идут N строк, в каждой из которых описаны координаты каждого дачника и его участка:
 * X Y X1 Y1 X2 Y2 X3 Y3 X4 Y4
 * где
 * (X,Y) – координаты приземления парашютиста
 * (X1, Y1, X2, Y2, X3, Y3, X4,Y4) – координаты прямоугольного участка на плоскости, указанные последовательно.
 * Все координаты – целые числа, не превышающие 50000 по абсолютной величине
 * <p>
 * Выходные данные
 * В выходной файл OUTPUT.TXT нужно вывести количество дачников, приземлившихся на свой участок.
 * Попадание на границу участка считается попаданием на участок.
 */
public class task12 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int out = 0;
        for (int i = 0; i < n; i++) {
            if (checkIfItIn()){
                out++;
            }
        }
        System.out.println(out);
    }

    private static boolean checkIfItIn() {
        double[] c = new double[10];
        for (int i = 0; i < 10; i++) {
            c[i] = sc.nextInt();
        }
        double fourTriangles =   triangleArea(c[0], c[1], c[2], c[3], c[4], c[5]) +
                                triangleArea(c[0], c[1], c[4], c[5], c[6], c[7]) +
                                triangleArea(c[0], c[1], c[6], c[7], c[8], c[9]) +
                                triangleArea(c[0], c[1], c[8], c[9], c[2], c[3]);
        double fullRectangle = rectangleArea(c[2], c[3], c[4], c[5], c[6], c[7], c[8], c[9]);
        return fullRectangle == fourTriangles;
    }

    private static double triangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double out = abs((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1));
        return out/2;
    }

    private static double rectangleArea(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        double out = abs(x1*y2+x2*y3+x3*y4+x4*y1-x2*y1-x3*y2-x4*y3-x1*y4);
        return out/2;
    }
}
