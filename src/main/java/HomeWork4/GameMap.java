package HomeWork4;

public class GameMap {
    private static int size;
    private static int victoryCondition;

    private static final String HEADER_FIRST_SYMBOL = "\u2727";
    private static final String SPACE_MAP = " ";

    public static final char DOT_EMPTY = '+';


    private static char[][] map;

    public static void setSize(int size) {
        GameMap.size = size;
    }

    public static void setVictoryCondition(int victoryCondition) {
        GameMap.victoryCondition = victoryCondition;
    }

    public static int getVictoryCondition() {
        return victoryCondition;
    }

    public static int getSize() {
        return size;
    }

    public static char[][] getMap() {
        return map;
    }

    public GameMap(int size, int victoryCondition) {
        this.size = size;
        this.victoryCondition = victoryCondition;
        map = new char[size][size];
    }

    public static void initMap() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        if (size <= 9) {
            System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP);
            for (int i = 0; i < size; i++) {
                System.out.print(i + 1 + SPACE_MAP);
            }
            System.out.println();
            for (int i = 0; i < size; i++) {
                System.out.print(i + 1 + SPACE_MAP);
                for (int j = 0; j < size; j++) {
                    System.out.print(map[i][j] + SPACE_MAP);
                }
                System.out.println();
            }
        } else {
            System.out.print(SPACE_MAP + HEADER_FIRST_SYMBOL + SPACE_MAP);
            for (int i = 0; i < size; i++) {
                String header = (i + 1) + SPACE_MAP;
                System.out.printf("%4s", header);
            }
            System.out.println();
            for (int i = 0; i < size; i++) {
                System.out.printf("%2s", (i + 1));
                for (int j = 0; j < size; j++) {
                    System.out.printf("%4s", map[i][j]);
                }
                System.out.println();
            }
        }
    }
}
