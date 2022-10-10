import java.math.BigInteger;
import java.util.Scanner;

/***
 * ЗАДАЧА №11
 * Зайчик
 * (Время: 1 сек. Память: 16 Мб Сложность: 55%)
 * В нашем зоопарке появился заяц. Его поместили в клетку, и чтобы ему не было скучно,
 * директор зоопарка распорядился поставить в его клетке лесенку. Теперь наш зайчик может прыгать по лесенке вверх,
 * перепрыгивая через ступеньки. Лестница имеет определенное количество ступенек N.
 * Заяц может одним прыжком преодолеть не более К ступенек.
 * Для разнообразия зайчик пытается каждый раз найти новый путь к вершине лестницы.
 * Директору любопытно, сколько различных способов есть у зайца добраться до вершины лестницы при заданных значениях
 * K и N. Помогите директору написать программу, которая поможет вычислить это количество.
 * Например, если K=3 и N=4, то существуют следующие маршруты: 1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2, 1+3, 3+1.
 * Т.е. при данных значениях у зайца всего 7 различных маршрутов добраться до вершины лестницы.
 * <p>
 * Входные данные
 * В единственной строке входного файла INPUT.TXT записаны два натуральных числа K и N (1 ≤ K ≤ N ≤ 300).
 * К - максимальное количество ступенек, которое может преодолеть заяц одним прыжком, N – общее число ступенек лестницы.
 * <p>
 * Выходные данные
 * В единственную строку выходного файла OUTPUT.TXT нужно вывести количество возможных вариантов
 * различных маршрутов зайца на верхнюю ступеньку лестницы без ведущих нулей.
 */
public class task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        BigInteger[] arr = new BigInteger[n+1];
        arr[n] = BigInteger.ONE;
        arr[n-1] = BigInteger.ONE;
        for (int i = n-2; i >= 0; i--){
            arr[i] = BigInteger.ZERO;
            for (int j = i + 1; j <= i + k && j <= n; j++){
                arr[i] = arr[i].add(arr[j]);
            }
        }
        System.out.print(arr[0]);
    }
}
