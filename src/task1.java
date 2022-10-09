import java.util.Scanner;

/***
 * ЗАДАЧА №1
 * A+B
 * (Время: 1 сек. Память: 16 Мб Сложность: 2%)
 * Требуется сложить два целых числа А и В.
 * <p>
 * Входные данные
 * В единственной строке входного файла INPUT.TXT записаны два натуральных числа через пробел. Значения чисел не превышают 109.
 * <p>
 * Выходные данные
 * В единственную строку выходного файла OUTPUT.TXT нужно вывести одно целое число — сумму чисел А и В.
 */
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        System.out.println(first + second);
    }
}
