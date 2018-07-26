/**
 * Java1. Homework4
 *
 * @authors Irina Poberey
 * @version dated Jul 22, 2018
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Java1HW4 {

    final int SIZE = 5;
    final int GOAL = 4;
    final char DOT_X = 'x';
    final char DOT_O = 'o';
    final char DOT_EMPTY = '.';
    char[][] map = new char[SIZE][SIZE];
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    public static void main(String[] args) {
        new Java1HW4();
    }

    Java1HW4() {
        initMap();
        while (true) {
            humanTurn();
            if (checkWin(DOT_X)) {
                System.out.println("YOU WON!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("AI WON!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER.");
        printMap();
    }

    void initMap() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                map[i][j] = DOT_EMPTY;
    }

    void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                System.out.print(map[i][j]);
            System.out.println();
        }
    }

    void humanTurn() {
        int x, y;
        do {
            System.out.println("Enter X and Y (1.." + SIZE + ")^");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    void aiTurn() {
        int x, y;
        int[] point = checkDanger();
        if (point.length == 2) {
            System.out.println(Arrays.toString(point));
            map[point[0]][point[1]] = DOT_O;
            return;
        }
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[x][y] = DOT_O;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE)
            return false;
        return map[x][y] == DOT_EMPTY;
    }

    int[] checkDanger() {
        int[] point = {};
        int countD = 0;
        int countD2 = 0;
        for (int i = 0; i < SIZE; i++) {
            int countX = 0;
            int countY = 0;

            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_X) {
                    countX++;
                    if (countX == 2) {
                        if (j + 1 < SIZE && map[i][j + 1] == DOT_EMPTY) {
                            return new int[]{i, j + 1};
                        }
                        if (j - 2 >= 0 && map[i][j - 2] == DOT_EMPTY) {
                            return new int[]{i, j - 2};
                        }
                    }
                }
                if (map[j][i] == DOT_X) {
                    countY++;
                    if (countY == 2) {
                        if (j + 1 < SIZE && map[j + 1][i] == DOT_EMPTY) {
                            return new int[]{j + 1, i};
                        }
                        if (j - 2 >= 0 && map[j - 2][i] == DOT_EMPTY) {
                            return new int[]{j - 2, i};
                        }
                    }
                }
            }
            if (map[i][i] == DOT_X) {
                countD++;
                if (countD == 2) {
                    if (i + 1 < SIZE && map[i + 1][i + 1] == DOT_EMPTY) {
                        return new int[]{i + 1, i + 1};
                    }
                    if (i - 2 >= 0 && map[i - 2][i - 2] == DOT_EMPTY) {
                        return new int[]{i - 2, i - 2};
                    }
                }
            }
            if (map[i][SIZE - i - 1] == DOT_X) {
                countD2++;
                if (countD2 == 2) {
                    if (i + 1 < SIZE && map[i + 1][SIZE - i - 2] == DOT_EMPTY) {
                        return new int[]{i + 1, SIZE - i - 2};
                    }
                    if (i - 2 >= 0 && map[i - 2][SIZE - i + 1] == DOT_EMPTY) {
                        return new int[]{i - 2, SIZE - i + 1};
                    }
                }
            }
        }
        return point;
    }

    boolean checkWin(char dot) {
        int countD = 0;
        int countD2 = 0;
        for (int i = 0; i < SIZE; i++) {
            int countX = 0;
            int countY = 0;

            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == dot) {
                    countX++;
                    if (countX == GOAL) {
                        return true;
                    }
                }
                if (map[j][i] == dot) {
                    countY++;
                    if (countY == GOAL) {
                        return true;
                    }
                }
            }
            if (map[i][i] == dot) {
                countD++;
                if (countD == GOAL) {
                    return true;
                }
            }
            if (map[i][SIZE - i - 1] == dot) {
                countD2++;
                if (countD2 == GOAL) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean isMapFull() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (map[i][j] == DOT_EMPTY)
                    return false;
        return true;

    }
}
