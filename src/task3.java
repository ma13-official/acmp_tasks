import java.util.Scanner;

/***
 * ЗАДАЧА №3
 * Пятью пять - двадцать пять!
 * (Время: 1 сек. Память: 16 Мб Сложность: 8%)
 * <p>
 * Входные данные
 * В единственной строке входного файла INPUT.TXT записано одно натуральное число А, оканчивающееся на цифру 5, не превышающее 4*105.
 * <p>
 * Выходные данные
 * В выходной файл OUTPUT.TXT выведите одно натуральное число - A2 без лидирующих нулей.
 */
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        System.out.println(a*a);
    }
}
