import java.awt.*;
import java.util.Scanner;

public class Main {

    final double PI = 3.14; // пример глобальной константы

    public static void main(String[] args) {
        //System.out.println(2+3);
        // основные типы переменных
        int a = 0; // целочисленное
        char b = 'a'; // символ
        double c = 1.0; // дробное число
        float d = 1.0f; // дробное число (поменьше)
        boolean e = true; // булевское true/false

        String f = "Hello"; // строка (непримитивный тип данных)


        // Ввод значений из консоли
        Scanner scanner = new Scanner(System.in);

        // System.out.println(a + " " + d);
        //a = scanner.nextInt();
        // f = scanner.nextLine();
        //d = scanner.nextFloat();
        //System.out.println(a + " " + d);

        a = scanner.nextInt();

        // && - И / || - ИЛИ /  ! - НЕ / == - РАВНО / != - НЕ РАВНО

        //   if (a == 0) {
        //       System.out.println("Ноль");
        //   } else if (a % 2 == 0) {
        //       System.out.println("Четное");
        //   } else {
        //       System.out.println("Нечетное");
        //   }

        // гибкая настройка параметров (цикл со счётчиком)
        for (int i = 0; i < 10; i++ /* эквивалентно i = i + 1 */) {
            System.out.println(i);
        }

        // сокращенные операторы: i += 2 == i = i + 2
        // i -= 2 == i = i - 2
        // c умножением и делением то же самое;

        int j;
        j = 2; // ВАЖНО: придать значение переменной до того, как к ней обратишься
        while (j < 100) { // цикл с преусловием
            System.out.println(j);
            j *= j;
        }

        String k = "";
        do {
            k = k + "a"; // оператор конкатенации (сращения строк)
        } while (!k.equals("aaaa")); // Цикл с постусловием
        System.out.println(k);

        System.out.println((double) 10 / 3); // приведение к нужному типу в скобках
        System.out.println(10 / 3); // целые делятся нацело
        System.out.println(10.0 / 3); // при наличии дробных все выражение приводится к ним

        int[] array = new int[10];
        int[] array2 = {10, 23, 94}; // одномерный
        int[][] array2D = new int[10][10]; // двумерный массив 10x10

        for (int i = 0; i < 10; i++) {
            for (int l = 0; l < 10; l++) {
                System.out.print(array2D[i][l] + " ");
            }
            System.out.print("\n");
        }

        for (int item : array2) { // цикл foreach
            System.out.println(item);
        }

        int in = scanner.nextInt();

        switch (in) {
            case 0:
                System.out.println("Ноль");
                break;
            case 1:
                System.out.println("Единица");
                break;
            case 2:
                System.out.println("Два");
                break;
            default:
                System.out.println("Не знаю такого числа");
                break;
        }

        print("Sjajs");
        int res = sqrt(144);
        System.out.println(res);
        System.out.println(exp(10, 3));
    }

    static void print(String string) {
        System.out.println(string);
    }

    static int sqrt(int n) {
        return (int) Math.sqrt(n);
    }

    static int exp(int n, int k) {
        int result = n;
        for (int i = 0; i < k-1; i++) {
            result *= n;
        }
        return result;
    }

    static Point test() {
        return new Point(20,30);
    }
}