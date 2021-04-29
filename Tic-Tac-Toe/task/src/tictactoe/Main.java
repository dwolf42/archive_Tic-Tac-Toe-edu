package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] partsOfInput = scanner.nextLine().toUpperCase().split("");
//                           impossible   XO_XO_XOX
        scanner.close();

        // That's the way to paradise - oh wait, it's just the game board - lol
        String[][] board = {{"-", "-", "-", "-", "-", "-", "-", "-", "-"},
//                   i:1 j:2v  i:1 j:4v  i:1 j:6v    <-- 'v' marks the index in which the payer's symbols will be placed
                {"|", " ", "_", " ", "_", " ", "_", " ", "|"},
//                   i:2 j:2v  i:2 j:4v  i:2 j:6v
                {"|", " ", "_", " ", "_", " ", "_", " ", "|"},
//                   i:3 j:2v  i:3 j:4v  i:3 j:6v
                {"|", " ", "_", " ", "_", " ", "_", " ", "|"},
                {"-", "-", "-", "-", "-", "-", "-", "-", "-"}
        };

        // indexOnPartOfInput; is to count which index (token) of partsOfInput[] should be put into
        // which position of the board[][]
        int indexOnPartOfInput = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 2; j < 7; j += 2) {
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

        // Impossible: ratio X to O
        // If one or the other is more often represented in the array the flag changes
        int amountX = 0;
        int amountO = 0;
        for (String[] strings : board) {
            for (int j = 0; j < board[1].length; j++) {
                if (strings[j].equals("X")) {
                    amountX++;
                }
                if (strings[j].equals("O")) {
                    amountO++;
                }
            }
        }

        boolean flagImpossibleRatio = amountX - amountO != 0 || amountX - amountO != 1;

        // Impossible: three X's and three O's in a row
        // results form concurrency of X and O

        // prints board[][] to screen
        for (String[] boardArrayString : board) {
            for (String boardString : boardArrayString) {
                System.out.print(boardString);
            }
            System.out.println("");
        }

        System.out.println(flagImpossibleRatio);
    }
}
































