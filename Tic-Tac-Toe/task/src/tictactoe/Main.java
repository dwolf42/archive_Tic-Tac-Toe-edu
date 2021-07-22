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
                xWinHorizontal2 && oWinHorizontal3 ||
                oWinHorizontal1 && xWinHorizontal2 ||
                oWinHorizontal2 && xWinHorizontal3 ||
                oWinHorizontal1 && xWinHorizontal3;

        // >>> Impossible vertical <<<
        boolean impossibleVertical = xWinVertical1 && oWinVertical2 ||
                xWinVertical1 && oWinVertical3 ||
                xWinVertical2 && oWinVertical3 ||
                oWinVertical1 && xWinVertical2 ||
                oWinVertical2 && xWinVertical3 ||
                oWinVertical1 && xWinVertical3;

        // >>> Impossible ratio <<<
        int X = 0;
        int O = 0;

        for (int i = 0; i < partsOfInput.length; i++) {
            if (partsOfInput[i].equals("X")) {
                X++;
            }
            else if (partsOfInput[i].equals("O")) {
                O++;
            }
        }
        // Determine if there is an imbalance between X and O
        int ratioXtoO = Math.abs(X - O);

        // --- Printer ---

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

        // Prints the actual status of the game

        // Print when win combinations impossible
        if (ratioXtoO > 1 || impossibleHorizontal || impossibleVertical) {
            System.out.println("Impossible");
        }
        // Print wins for X or O
        else if (xWinLeftDiagonal || xWinRightDiagonal ||
                xWinHorizontal1 || xWinHorizontal2 ||
                xWinHorizontal3 || xWinVertical1 ||
                xWinVertical2 || xWinVertical3) {
            System.out.println("X wins");
        } else if (oWinLeftDiagonal || oWinRightDiagonal ||
                oWinHorizontal1 || oWinHorizontal2 ||
                oWinHorizontal3 || oWinVertical1 ||
                oWinVertical2 || oWinVertical3) {
            System.out.println("O wins");
        }
        // Print draw
        int draw = 0;
        else if ({ for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[1].length; j++) {
                    if (board[i][j].equals("X") || board[i][j].equals("Y")) {
                        draw++;
                    }
                }
        }
        })
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


//////////////////////////
Stage 3/5: What's up on the field
Description
In this stage, we’re going to analyze the game state to determine if either of the players has already won the game or it is still ongoing, if the game is a draw, or if the user has entered an impossible game state (two winners, or with one player having made too many moves).

Objectives
In this stage, your program should:

Take a string entered by the user and print the game grid as in the previous stage.
Analyze the game state and print the result. Possible states:
Game not finished when neither side has three in a row but the grid still has empty cells.
Draw when no side has a three in a row and the grid has no empty cells.
X wins when the grid has three X’s in a row.
O wins when the grid has three O’s in a row.
Impossible when the grid has three X’s in a row as well as three O’s in a row, or there are a lot more X's than O's or vice versa (the difference should be 1 or 0; if the difference is 2 or more, then the game state is impossible).
In this stage, we will assume that either X or O can start the game.

You can choose whether to use a space or underscore _ to print empty cells.

Examples
The examples below show outputs and analysis results for different game states. Your program should work in the same way.

Notice that after Enter cells: comes the user input.

Example 1:

Enter cells: XXXOO__O_
---------
| X X X |
| O O _ |
| _ O _ |
---------
X wins
Example 2:

Enter cells: XOXOXOXXO
---------
| X O X |
| O X O |
| X X O |
---------
X wins
Example 3:

Enter cells: XOOOXOXXO
---------
| X O O |
| O X O |
| X X O |
---------
O wins
Example 4:

Enter cells: XOXOOXXXO
---------
| X O X |
| O O X |
| X X O |
---------
Draw
Example 5:

Enter cells: XO_OOX_X_
---------
| X O   |
| O O X |
|   X   |
---------
Game not finished
Example 6:

Enter cells: XO_XO_XOX
---------
| X O _ |
| X O _ |
| X O X |
---------
Impossible
Example 7:

Enter cells: _O_X__X_X
---------
|   O   |
| X     |
| X   X |
---------
Impossible
Example 8:

Enter cells: _OOOO_X_X
---------
|   O O |
| O O   |
| X   X |
---------
Impossible

*/