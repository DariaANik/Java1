import java.util.Random;
import java.util.Scanner;

public class HomeworkLesson4 {
    final int SIZE = 3;
    final char DOT_X = 'x';
    final char DOT_O = 'o';
    final char EMPTY = '.';
    char[][] map = new char[SIZE][SIZE];
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    public static void main(String[] args) {
        new HomeworkLesson4().game();
    }

    void game() {
        initMap();
        while (true) {
            humanTurn();
            if (checkWin(DOT_X)) {
                System.out.println("You are a winner!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Draw!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("AI is a winner!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Draw!");
                break;
            }
        }
        System.out.println("Game over");
        printMap();
    }

    void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = EMPTY;
            }
        }
    }

    void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void humanTurn() {
        int x, y;
        do {
            System.out.println("X and Y (1 / 2 / 3");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;

    }

    void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;
    }

    boolean checkWin(char dot) {

        int sumd1 = 0;
        int sumd2 = 0;
        for (int i = 0; i < SIZE; i++) {                // diagonal
            if (map[i][i] == dot) {
                sumd1++;
            }
            if (map[SIZE - 1 - i][i] == dot) {
                sumd2++;
            }
            if (sumd1 == 3 || sumd2 == 3) {
                return true;
            }
        }
        for (int i = 0; i < SIZE; i++) {                // horizontal and vertical
            int sumh = 0;
            int sumv = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == dot) {
                    sumh++;
                }
                if (map[j][i] == dot) {
                    sumv++;
                }
            }
            if (sumh == 3 || sumv == 3) {
                return true;
            }
        }
        return false;
    }

    boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y <0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == EMPTY;
    }
}
