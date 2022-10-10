import java.util.Scanner;

/***
 * ЗАДАЧА №8
 * Арифметика
 * (Время: 1 сек. Память: 16 Мб Сложность: 5%)
 * <p>
 * Входные данные
 * Во входном файле INPUT.TXT записаны три натуральных числа A, B и C через пробел. Числа A и B ≤ 102, а C ≤ 106.
 * <p>
 * Выходные данные
 * В выходной файл нужно вывести YES в том случае, если A*B=C и вывести NO в противном случае.
 */
public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a * b == c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
