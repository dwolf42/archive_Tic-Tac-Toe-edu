package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        userInput();
    }

    public static void userInput() {
        Scanner scanner = new Scanner(System.in);

        String input = "XOXOXOXXO";
        scanner.close();

        char[] charsOfInput = input.toCharArray();
        printIt(gameBoard(charsOfInput));
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

        int indexOnCharsOfInput = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 2; j < 7; j += 2) {
                board[i][j] = charsOfInput[indexOnCharsOfInput];
                indexOnCharsOfInput++;
            }
        }
        return board;
    }

    public static void printIt(char[][] charsOfBoard) {
        for (char[] characters : charsOfBoard) {
            for (char chars : characters) {
                System.out.print(chars);
            }
            System.out.println("");
        }
    }
}

