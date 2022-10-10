import java.util.Scanner;


/***
 * ЗАДАЧА №9
 * Домашнее задание
 * (Время: 1 сек. Память: 16 Мб Сложность: 27%)
 * <p>
 * Входные данные
 * В первой строке входного файла INPUT.TXT записано единственное число N – количество элементов массива.
 * Вторая строка содержит N целых чисел, представляющих заданный массив.
 * Все элементы массива разделены пробелом. Каждое из чисел во входном файле,
 * в том числе и N, не превышает 100 по абсолютной величине.
 * <p>
 * Выходные данные
 * В единственную строку выходного файла OUTPUT.TXT нужно вывести два числа, разделенных пробелом:
 * сумму положительных элементов и произведение чисел, расположенных между минимальным и максимальным элементами.
 * Значения суммы и произведения не превышают по модулю 30000.
 */
public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] in = new int[n];
        int sumOut = 0;
        int timesOut = 1;
        int maximum = -9999999;
        int minimum = 99999999;
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < n; i++) {
            in[i] = sc.nextInt();
            if (in[i] > 0) {
                sumOut += in[i];
            }
            if (maximum < in[i]) {
                maximum = in[i];
                i1 = i;
            }
            if (minimum > in[i]) {
                minimum = in[i];
                i2 = i;
            }
        }
        if (i1 > i2) {
            for (int i = i2 + 1; i < i1; i++) {
                timesOut *= in[i];
            }
        } else {
            for (int i = i1 + 1; i < i2; i++) {
                timesOut *= in[i];
            }
        }
        System.out.println(sumOut + " " + timesOut);
    }
}
