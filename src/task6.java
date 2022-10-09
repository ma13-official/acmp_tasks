import java.util.Scanner;
import static java.lang.Math.abs;

/***
 * ЗАДАЧА №6
 * Шахматы
 * (Время: 1 сек. Память: 16 Мб Сложность: 23%)
 * <p>
 * Входные данные
 * В единственной строке входного файла INPUT.TXT записан текст хода (непустая строка), который указал пользователь.
 * Пользователь не может ввести строку, длиннее 5 символов.
 * <p>
 * Выходные данные
 * В выходной файл OUTPUT.TXT нужно вывести «YES», если указанный ход конем верный,
 * если же запись корректна (в смысле правильности записи координат), но ход невозможен, то нужно вывести «NO».
 * Если же координаты не определены или заданы некорректно, то вывести сообщение «ERROR».
 */
public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] in = sc.nextLine().toCharArray();
        if (in.length != 5) {
            System.out.println("ERROR");
        } else {
            if (in[2] != '-') {
                System.out.println("ERROR");
            } else {
                int letterFrom = in[0];
                int letterTo = in[3];
                int numberFrom = Character.getNumericValue(in[1]);
                int numberTo = Character.getNumericValue(in[4]);
                boolean checkLF = letterFrom > 64 && letterFrom < 73;
                boolean checkLT = letterTo > 64 && letterTo < 73;
                boolean checkNF = numberFrom > 0 && numberFrom < 9;
                boolean checkNT = numberTo > 0 && numberTo < 9;
                if (checkNF && checkLF && checkNT && checkLT) {
                    if ((abs(letterTo - letterFrom) == 2 && abs(numberTo - numberFrom) == 1) ||
                            (abs(letterTo - letterFrom) == 1 && abs(numberTo - numberFrom) == 2)) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("ERROR");
                }

            }
        }
    }
}
