/**
 * morpion
 */
public class morpion {

    public static void main(String[] args) {

        char[][] gameBoard = {
                { '_', '|', '_', '|', '_' },
                { '_', '|', '_', '|', '_' },
                { ' ', '|', ' ', '|', ' ' }
        };

        printBoard(gameBoard);

    }

    public static void printBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
