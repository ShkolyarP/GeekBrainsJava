package HomeWork4;

import java.util.Random;
import java.util.Scanner;

public class GamePlay {

    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';

    private static Scanner in = new Scanner(System.in);
    private static Random random = new Random();

    private static int rowNumber;
    private static int columnNumber;
    private static int turnsCount;


    public static Scanner getIn() {
        return in;
    }


    public static void turnGame() {
        do {
            System.out.println("\n\n���� ����������!");
            initGame();
            playGame();
        } while (isContinueGame());

        endGame();

    }

    private static void endGame() {
        in.close();
        System.out.println("������� �� ����!");
    }

    private static boolean isContinueGame() {
        System.out.println("������ ��� �����? y\\n");
        return switch (in.next()) {
            case "y", "yes", "Yes", "Y", "��", "��", "�", "�", "+" -> true;
            default -> false;
        };
    }

    private static void initGame() {
        turnsCount = 0;
        System.out.println("����� ������ �������� ����?");
        System.out.println("������� ����� �� 3 �� 15: ");
        GameMap.setSize(in.nextInt());
        switch (GameMap.getSize()) {
            case 3, 4, 5, 6 -> {
                GameMap.setVictoryCondition(3);
                System.out.println("������ - 3 � ���");
            }
            case 7, 8, 9, 10 -> {
                GameMap.setVictoryCondition(4);
                System.out.println("������ - 4 � ���");
            }
            default -> {
                GameMap.setVictoryCondition(5);
                System.out.println("������ - 5 � ���");
            }
        }
        GameMap gameMap = new GameMap(GameMap.getSize(), GameMap.getVictoryCondition());
        GameMap.initMap();

    }

    private static void playGame() {

        GameMap.printMap();

        while (true) {
            humanTurn();
            GameMap.printMap();
            if (checkEnd(DOT_HUMAN, rowNumber, columnNumber)) {
                break;
            }

            aiTurn();
            GameMap.printMap();
            if (checkEnd(DOT_AI, rowNumber, columnNumber)) {
                break;
            }
        }
    }


    private static void humanTurn() {
        System.out.println("��� ��������");
        while (true) {
            System.out.print("������� ���������� ������: ");
            rowNumber = Validity.getValidNumberFromScanner() - 1;
            System.out.println("������� ���������� �������: ");
            columnNumber = Validity.getValidNumberFromScanner() - 1;

            if (isCellFree(rowNumber, columnNumber)) {
                break;
            }
            System.out.printf("������ � ������������: %d:%d ��� ������%n%n", rowNumber + 1, columnNumber + 1);
        }
        GameMap.getMap()[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;
    }


    private static void aiTurn() {
        System.out.println("��� ����������!");

        do {
            rowNumber = random.nextInt(GameMap.getSize());
            columnNumber = random.nextInt(GameMap.getSize());
        } while (!isCellFree(rowNumber, columnNumber));

        GameMap.getMap()[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;

    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return GameMap.getMap()[rowNumber][columnNumber] == GameMap.DOT_EMPTY;
    }

    private static boolean checkEnd(char symbol, int rowNumber, int columnNumber) {
        if (checkWin(symbol, rowNumber, columnNumber)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("���! �� ��������!");
            } else {
                System.out.println("��������� �������!");
            }
            return true;
        }
        if (checkDraw()) {
            System.out.println("�����!");
            return true;
        }
        return false;
    }

    private static boolean checkDraw() {
        return turnsCount == GameMap.getSize() * GameMap.getSize();
    }

    private static boolean checkWin(char symbol, int rowNumber, int columnNumber) {
        return checkRowNumber(symbol, rowNumber) || checkColumnNumber(symbol, columnNumber) ||
                checkDiagonal(symbol, rowNumber, columnNumber) || checkDiagonalRevers(symbol, rowNumber, columnNumber);
    }

    private static boolean checkRowNumber(char symbol, int rowNumber) {
        int count = 0;
        for (int i = 0; i < GameMap.getSize(); i++) {
            if (GameMap.getMap()[rowNumber][i] == symbol) {
                count++;
                if (count == GameMap.getVictoryCondition()) {
                    return true;
                }
            } else
                count = 0;
        }
        return false;
    }

    private static boolean checkColumnNumber(char symbol, int columnNumber) {
        int count = 0;
        for (int i = 0; i < GameMap.getSize(); i++) {
            if (GameMap.getMap()[i][columnNumber] == symbol) {
                count++;
                if (count == GameMap.getVictoryCondition()) {
                    return true;
                }
            } else
                count = 0;
        }
        return false;
    }

    private static boolean checkDiagonal(char symbol, int rowNumber, int columnNumber) {
        int count = 0;
        if (columnNumber > rowNumber) {
            do {
                rowNumber--;
                columnNumber--;
            } while (rowNumber != 0);
            for (int i = columnNumber; i < GameMap.getSize(); i++) {
                if (GameMap.getMap()[i][rowNumber] == symbol) {
                    count++;
                    if (count == GameMap.getVictoryCondition()) {
                        return true;
                    }

                }
                rowNumber++;
            }
            return false;
        } else {
            do {
                rowNumber--;
                columnNumber--;
            } while (columnNumber != 0);
            for (int i = rowNumber; i < GameMap.getSize(); i++) {
                if (GameMap.getMap()[columnNumber][i] == symbol) {
                    count++;
                    if (count == GameMap.getVictoryCondition()) {
                        return true;
                    }
                }
                columnNumber++;
            }
            return false;
        }
    }

    private static boolean checkDiagonalRevers(char symbol, int rowNumber, int columnNumber) {
        int count = 0;
        if ((columnNumber + rowNumber) <= (GameMap.getSize() - 1)) {
            do {
                rowNumber--;
                columnNumber++;
            } while (rowNumber != 0);
            for (int i = columnNumber; i >= 0; i--) {
                if (GameMap.getMap()[rowNumber][i] == symbol) {
                    count++;
                    if (count == GameMap.getVictoryCondition()) {
                        return true;
                    }

                }
                rowNumber++;
            }
            return false;
        } else {
            while (columnNumber != (GameMap.getSize() - 1)) {
                rowNumber--;
                columnNumber++;
            }
            for (int i = rowNumber; i < GameMap.getSize(); i++) {
                if (GameMap.getMap()[i][columnNumber] == symbol) {
                    count++;
                    if (count == GameMap.getVictoryCondition()) {
                        return true;
                    }
                }
                columnNumber--;
            }
            return false;
        }
    }


}
