import java.util.Scanner;

/***
 * ЗАДАЧА №4
 * Игра
 * (Время: 1 сек. Память: 16 Мб Сложность: 4%)
 * <p>
 * Входные данные
 * В единственной строке входного файла INPUT.TXT задана единственная цифра К.
 * <p>
 * Выходные данные
 * В выходной файл OUTPUT.TXT нужно вывести K+'9'+(9-K).
 */
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        System.out.println(in+"9"+(9-in));
    }
}
