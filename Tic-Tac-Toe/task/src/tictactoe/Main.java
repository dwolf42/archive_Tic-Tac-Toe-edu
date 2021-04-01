package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        userInput();
    }

    public static void userInput() {
        Scanner scanner = new Scanner(System.in);

        // input from user
        String input = "XXXOO__O_";
        scanner.close();

        char[] charsOfInput = input.toCharArray();
//             [X, X, X, O, O, _, _, O, _]
        //  ticTac(charsOfInput);
        gameBoard(charsOfInput);
    }

    public static void printIt(char[][] printBoard) {
        char[][] boardPrint = gameBoard();
    }

    public static char[][] gameBoard(char[] charsOfInput) {
        char[][] board = {{'-', '-', '-', '-', '-', '-', '-', '-', '-'},
//                   i:1 j:2v  i:1 j:4v  i:1 j:6v
                {'|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|'},
//                   i:2 j:2v  i:2 j:4v  i:2 j:6v
                {'|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|'},
//                   i:3 j:2v  i:3 j:4v  i:3 j:6v
                {'|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|'},

                {'-', '-', '-', '-', '-', '-', '-', '-', '-'}
        };

        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = charsOfInput[j];
            }

        }
        return board;
    }
/*
        char[][] board = {{'-', '-', '-', '-', '-', '-', '-', '-', '-'},
//                              i:1 j:2  i:1 j:4  i:1 j:6
                          {'|', ' ', a1, ' ', a2, ' ', a3, ' ', '|'},
//                              i:2 j:2  i:2 j:4  i:2 j:6
                          {'|', ' ', b1, ' ', b2, ' ', b3, ' ', '|'},
//                              i:3 j:2  i:3 j:4  i:3 j:6
                          {'|', ' ', c1, ' ', c2, ' ', c3, ' ', '|'},
                          {'-', '-', '-', '-', '-', '-', '-', '-', '-'}
        };

 */

}

}