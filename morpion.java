
/**
 * morpion
 */

import java.util.Scanner;

public class morpion {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        char[][] gameBoard = {
                { '_', '|', '_', '|', '_' },
                { '_', '|', '_', '|', '_' },
                { ' ', '|', ' ', '|', ' ' }
        };

        printBoard(gameBoard);
        playerMove(gameBoard);

    }

    public static void playerMove(char[][] gameBoard) {
        // demande au joueur de choisir un emplacement
        System.out.println("please say a case between 1 and 9");
        int move = input.nextInt();
        updateBoard(move, 1, gameBoard);
    }

    public static void printBoard(char[][] gameBoard) {
        // creation du plateau
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }

        for (int row = 0; row < gameBoard.length; row++) {
            for (int c = 0; c < gameBoard[0].length; c++) {
                // System.out.println(gameBoard[row][c]);
            }
            System.out.println();
        }
    }

    public static void updateBoard(int posistion, int player, char[][] gameBoard) {
        // affiche la position choisit grace a la fonction playerMove
        char character;

        if (player == 1) {
            character = 'X';
        } else {
            character = 'O';
        }

        switch (posistion) {

            case 1:
                gameBoard[0][0] = character;
                printBoard(gameBoard);
                break;

            case 2:
                gameBoard[0][2] = character;
                printBoard(gameBoard);
                break;

            case 3:
                gameBoard[0][4] = character;
                printBoard(gameBoard);
                break;

            case 4:
                gameBoard[1][0] = character;
                printBoard(gameBoard);
                break;

            case 5:
                gameBoard[1][2] = character;
                printBoard(gameBoard);
                break;

            case 6:
                gameBoard[1][4] = character;
                printBoard(gameBoard);
                break;

            case 7:
                gameBoard[2][0] = character;
                printBoard(gameBoard);
                break;

            case 8:
                gameBoard[2][2] = character;
                printBoard(gameBoard);
                break;

            case 9:
                gameBoard[2][4] = character;
                printBoard(gameBoard);
                break;

            default:
                System.out.println("invalid number, please pick a number beetwen 1 and 9");
                break;
        }

    }

    public static void condWin(char[][] gameBoard, char character) {
        if (gameBoard[0][0] == character) {
            System.out.println("you win");
        }
    }

}
