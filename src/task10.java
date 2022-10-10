import java.util.Scanner;

/***
 * ЗАДАЧА №10
 * Уравнение
 * (Время: 1 сек. Память: 16 Мб Сложность: 17%)
 * <p>
 * Входные данные
 * В единственной строке входного файла INPUT.TXT записаны 4 числа:
 * A, B, C и D – целые коэффициенты кубического уравнения. Каждый коэффициент по модулю меньше 32768, A ≠ 0.
 * <p>
 * Выходные данные
 * В единственную строку выходного файла OUTPUT.TXT нужно вывести через пробел в порядке возрастания
 * все корни заданного кубического уравнения. Кратные корни следует выводить только один раз.
 */
public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();
        for (int i = -100; i < 101; i++) {
            if (a*i*i*i + b*i*i + c*i + d == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
