import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/***
 * Статистика
 * (Время: 1 сек. Память: 16 Мб Сложность: 15%)
 * <p>
 * Входные данные
 * В первой строке входного файла INPUT.TXT записано единственное число N –
 * – количество элементов целочисленного массива (1 ≤ N ≤ 100).
 * Вторая строка содержит N чисел, представляющих заданный массив.
 * Каждый элемент массива – натуральное число от 1 до 31. Все элементы массива разделены пробелом.
 * <p>
 * Выходные данные
 * В первую строку выходного файла OUTPUT.TXT нужно вывести нечетные числа.
 * Во второй строке соответственно расположить четные.
 * В третьей строке нужно вывести «YES», если нечетных не меньше и «NO» в противном случае.
 * В каждой строчке числа следует выводить в том же порядке, в котором они идут во входных данных.
 * При выводе числа отделяются пробелом.
 */
public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int cur = sc.nextInt();
            if (cur % 2 == 0) even.add(cur);
            else odd.add(cur);
        }
        outArrayList(odd);
        outArrayList(even);
        if (even.size() >= odd.size()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static void outArrayList(List<Integer> a) {
        for (Integer integer : a) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
