import java.math.BigInteger;
import java.util.Scanner;

/***
 *ЗАДАЧА №7
 * Золото племени АББА
 * (Время: 1 сек. Память: 16 Мб Сложность: 30%)
 * <p>
 * Входные данные
 * В первой строке входного файла INPUT.TXT записаны три натуральных числа через пробел.
 * Каждое из чисел не превышает 10^100. Числа записаны без ведущих нулей.
 * <p>
 * Выходные данные
 * В выходной файл OUTPUT.TXT нужно вывести максимальное число.
 */
public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        BigInteger c = new BigInteger(sc.next());
        if (a.floatValue() > b.floatValue()) {
            if (a.floatValue() > c.floatValue()) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b.floatValue() > c.floatValue()) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}
