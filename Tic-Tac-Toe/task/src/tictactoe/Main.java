// My first solution

package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] templateBoard = inputTemplateBoard();
        char[][] board = {
                // 1,1   1,2  1,3
                // 0,0   0,1  0,2
                {'_', '_', '_'},
                // 2,1   2,2  2,3
                // 1,0   1,1  1,2
                {'_', '_', '_'},
                // 3,1   3,2  3,3
                // 2,0   2,1  2,2
                {'_', '_', '_'},
        };

        int k = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[1].length; j++) {
                board[i][j] = templateBoard[k];
                k++;
            }
        }

        printIt(board);

        int[] validCoordinates = getValidCoordinates(board);

        // Coordinates provided by the user start counting form 1-3,
        // while the counting in arrays start fom 0-2.
        // So the position on the board where the user wants to place their symbol has to be
        // the user's entered coordinate - 1, like: input = 1 1 -> position = 0 0 on the board.
        // That's why I subtract 1 in the final coordinates here.
        board[validCoordinates[0] - 1][validCoordinates[1] - 1] = 'X';

        printIt(board);
    }

    // As the task requires to input a template or starting situation of the game,
    // this will be asked from the user here.
    public static char[] inputTemplateBoard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cells: ");

        return scanner.nextLine().toUpperCase().toCharArray();
    }

    // Users input of coordinates is a string that will be checked if it contains
    // numbers and then the numbers will be translated to integers.
    // Keeps asking for the correct input.
    public static int[] getValidCoordinates(char[][] board) {
        Scanner scanner = new Scanner(System.in);
        // Only positive numbers are allowed.
        String pattern = "([-+])?\\d+";
        System.out.println("Enter the coordinates: ");
        String[] coordinates = scanner.nextLine().split(" ");

        // Loops as long as the input doesn't match the patten of only positive integers.
        if (!coordinates[0].matches(pattern) || !coordinates[1].matches(pattern)) {
            System.out.println("You should enter numbers!");
            return getValidCoordinates(board);
        }

        // Translates string numbers into integers.
        int[] numCoordinates = {Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1])};

        // In case the user enters coordinates bigger than 3 or smaller than 0 an error will be shown and
        // the method will be reset and restarted.
        if (numCoordinates[0] > 3 || numCoordinates[0] < 1 || numCoordinates[1] > 3 || numCoordinates[1] < 1) {
            System.out.println("Coordinates should be from 1 to 3!");
            return getValidCoordinates(board);
        }

        // When user input is in range and a number, this checks whether it's valid or not.
        if (!isValidTurn(board, numCoordinates)) {
            return getValidCoordinates(board);
        }

        return numCoordinates;
    }

    // Coordinates provided by the user start counting form 1-3,
    // while the counting in arrays start fom 0-2.
    // So the position on the board where the user wants to place their symbol has to be
    // the user's entered coordinate - 1, like: input = 1 1 -> position = 0 0 on the board.
    // That's why I subtract 1 in the if-condition here.
    public static boolean isValidTurn(char[][] board, int[] getValidCoordinates) {
        if (board[getValidCoordinates[0] - 1][getValidCoordinates[1] - 1] == '_') {
            return true;
        } else {
            System.out.println("This cell is occupied! Choose another one!");
            return false;
        }
    }

    // Prints the board
    public static void printIt(char[][] board) {
        String horizontalBorder = "---------";
        String verticalBar = "|";

        System.out.println(horizontalBorder);
        for (char[] ch : board) {
            System.out.print(verticalBar + " ");
            for (char cha : ch) {
                System.out.print(cha + " ");
            }
            System.out.println(verticalBar);
        }
        System.out.println(horizontalBorder);
    }
}