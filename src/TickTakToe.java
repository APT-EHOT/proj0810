import java.util.Scanner;

public class TickTakToe {

    static char[][] table = new char[3][3];
    static boolean isCross;

    static Scanner scanner;

    public static void main(String[] args) {
        init();
        while (!check()) {
            move();
            print();
        }
        System.out.println(currentMove(!isCross) + " выиграли!");
    }

    static void init() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                table[i][j] = '*';
        isCross = true;
        scanner = new Scanner(System.in);
        print();
    }

    static void move() {
        System.out.print(currentMove(isCross) + " введите номер клетки (от 1 до 9): ");
        int input = scanner.nextInt() - 1;
        if (table[input / 3][input % 3] == '*') {
            table[input / 3][input % 3] = currentChar();
            isCross = !isCross;
        }
    }

    static char currentChar() {
        char result = 'O';
        if (isCross) result = 'X';
        return result;
    }

    static String currentMove(boolean value) {
        String result = "Нолики";
        if (value) result = "Крестики";
        return result;
    }

    static void print() {
        for (char[] row : table) {
            for (char item : row)
                System.out.print(item);
            System.out.println();
        }
    }

    static boolean check() {
        for (int i = 0; i < 3; i++)
            if (checkRow(table[i]))
                return true;

        for (int i = 0; i < 3; i++) {
            char[] col = new char[3];
            for (int j = 0; j < 3; j++) {
                col[j] = table[j][i];
            }
            if (checkRow(col))
                return true;
        }

        char[] diag1 = {table[0][0], table[1][1], table[2][2]};
        char[] diag2 = {table[0][2], table[1][1], table[2][0]};
        if (checkRow(diag1) || checkRow(diag2))
            return true;

        return false;
    }

    static boolean checkRow(char[] row) {
        return row[0] == row[1] && row[1] == row[2] && row[0] != '*';
    }
}
