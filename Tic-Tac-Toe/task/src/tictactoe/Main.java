package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] partsOfInput = scanner.nextLine().toUpperCase().split("");
//                           impossible   xoooxooox
        scanner.close();

        // That's the way to paradise - oh wait, it's just the game board - lol
        String[][] board = {{" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };

        // indexOnPartOfInput; is to count which index (token) of partsOfInput[] should be put into
        // which position of the board[][]
        int indexOnPartOfInput = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[1].length; j++) {
                board[i][j] = partsOfInput[indexOnPartOfInput];
                indexOnPartOfInput++;
            }
        }

        /* Iterate through board to determine:
         * -> Game not finished: neither side wins and empty cells
         * -> Draw: neither side wins, no more empty cells
         * -> X wins: three X's in a row
         * -> O wins: three O's in a row
         * -> Impossible: three X's and three O's in a row,
         * or more X's than O's or vice versa - ratio should be 1 or 0, 2 or more is impossible
         * */

        // --- Win conditions ---

        // >>> X win conditions <<<

        // True if the indexes that are building the diagonal line from top left to bottom right are "X"
        boolean xWinLeftDiagonal = board[0][0].equals("X") &
                                   board[1][1].equals("X") &
                                   board[2][2].equals("X");

        // True if the indexes that are building the diagonal line from top right to bottom left are "X"
        boolean xWinRightDiagonal = board[0][2].equals("X") &
                                    board[1][1].equals("X") &
                                    board[2][0].equals("X");

        // True if the indexes that are building horizontal lines left to right are "X"
        boolean xWinHorizontal1 = board[0][0].equals("X") &
                                  board[0][1].equals("X") &
                                  board[0][2].equals("X");

        boolean xWinHorizontal2 = board[1][0].equals("X") &
                                  board[1][1].equals("X") &
                                  board[1][2].equals("X");

        boolean xWinHorizontal3 = board[2][0].equals("X") &
                                  board[2][1].equals("X") &
                                  board[2][2].equals("X");

        // True if the indexes that are building vertical lines top to bottom are "X"
        boolean xWinVertical1 = board[0][0].equals("X") &
                                board[1][0].equals("X") &
                                board[2][0].equals("X");

        boolean xWinVertical2 = board[0][1].equals("X") &
                                board[1][1].equals("X") &
                                board[2][1].equals("X");

        boolean xWinVertical3 = board[0][2].equals("X") &
                                board[1][2].equals("X") &
                                board[2][2].equals("X");


        // >>> O win conditions <<<

        // True if the indexes that are building the diagonal line from top left to bottom right are "O"
        boolean oWinLeftDiagonal = board[0][0].equals("O") &
                                   board[1][1].equals("O") &
                                   board[2][2].equals("O");

        // True if the indexes that are building the diagonal line from top right to bottom left are "O"
        boolean oWinRightDiagonal = board[0][2].equals("O") &
                                    board[1][1].equals("O") &
                                    board[2][0].equals("O");

        // True if the indexes that are building horizontal lines left to right are "O"
        boolean oWinHorizontal1 = board[0][0].equals("O") &
                                  board[0][1].equals("O") &
                                  board[0][2].equals("O");

        boolean oWinHorizontal2 = board[1][0].equals("O") &
                                  board[1][1].equals("O") &
                                  board[1][2].equals("O");

        boolean oWinHorizontal3 = board[2][0].equals("O") &
                                  board[2][1].equals("O") &
                                  board[2][2].equals("O");

        // True if the indexes that are building vertical lines top to bottom are "O"
        boolean oWinVertical1 = board[0][0].equals("O") &
                                board[1][0].equals("O") &
                                board[2][0].equals("O");

        boolean oWinVertical2 = board[0][1].equals("O") &
                                board[1][1].equals("O") &
                                board[2][1].equals("O");

        boolean oWinVertical3 = board[0][2].equals("O") &
                                board[1][2].equals("O") &
                                board[2][2].equals("O");

        // --- Impossible conditions ---

        // >>> Impossible horizontal <<<

        boolean impossibleHorizontal = xWinHorizontal1 && oWinHorizontal2 ||
                                       xWinHorizontal1 && oWinHorizontal3 ||
                                       xWinHorizontal2 && oWinHorizontal3;


        // >>> Impossible vertical <<<

        boolean impossibleVertical = xWinVertical1 && oWinVertical2 ||
                                     xWinVertical1 && oWinVertical3 ||
                                     xWinVertical2 && oWinVertical3;

        // >>> Impossible ratio <<<

        int X = 0;
        int Y = 0;

        for (int i = 0; i < partsOfInput.length; i++) {
            if (partsOfInput[i].equals("X")) {
                X++;
            }
            else if (partsOfInput[i].equals("Y")) {
                Y++;
            }
            else {
                System.out.println("FATAL ERROR! WRONG INPUT!");
            }

        }


        // This part is printing the 3x3 board to the screen, also adds the lines around the board
        System.out.println("---------"); // Top board line
        for (String[] boardArrayString : board) {
            System.out.print("| "); // Leading vertical bar
            for (String boardString : boardArrayString) {
                System.out.print(boardString + " ");
            }
            System.out.print("|" + '\n'); // Tailing vertical bar
        }
        System.out.println("---------"); // Lower board line
    }
}

/*
  0 1 2 3 4 5 6
0 * . . * . . *
1 . * . * . * .
2 . . * * * . .
3 * * * * * * *
4 . . * * * . .
5 . * . * . * .
6 * . . * . . *


  0 1 2
0 x x x
1 x x x
2 x x x

*/
































