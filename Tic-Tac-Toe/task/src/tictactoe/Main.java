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

        // --- X win conditions ---

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


        // --- Y win conditions ---

        // True if the indexes that are building the diagonal line from top left to bottom right are "Y"
        boolean yWinLeftDiagonal = board[0][0].equals("Y") &
                                   board[1][1].equals("Y") &
                                   board[2][2].equals("Y");

        // True if the indexes that are building the diagonal line from top right to bottom left are "Y"
        boolean yWinRightDiagonal = board[0][2].equals("Y") &
                                    board[1][1].equals("Y") &
                                    board[2][0].equals("Y");

        // True if the indexes that are building horizontal lines left to right are "Y"
        boolean yWinHorizontal1 = board[0][0].equals("Y") &
                                  board[0][1].equals("Y") &
                                  board[0][2].equals("Y");

        boolean yWinHorizontal2 = board[1][0].equals("Y") &
                                  board[1][1].equals("Y") &
                                  board[1][2].equals("Y");

        boolean yWinHorizontal3 = board[2][0].equals("Y") &
                                  board[2][1].equals("Y") &
                                  board[2][2].equals("Y");

        // True if the indexes that are building vertical lines top to bottom are "Y"
        boolean yWinVertical1 = board[0][0].equals("Y") &
                                board[1][0].equals("Y") &
                                board[2][0].equals("Y");

        boolean yWinVertical2 = board[0][1].equals("Y") &
                                board[1][1].equals("Y") &
                                board[2][1].equals("Y");

        boolean yWinVertical3 = board[0][2].equals("Y") &
                                board[1][2].equals("Y") &
                                board[2][2].equals("Y");


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
































