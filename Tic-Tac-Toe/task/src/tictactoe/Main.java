package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] partsOfInput = scanner.nextLine().toUpperCase().split("");
//                           impossible   XXXXO_XOX
        scanner.close();

        // That's the way to paradise - oh wait, it's just the game board - lol
        String[][] board = {{" ", " ", " "},
                            {" ", " ", " "},
                            {" ", " ", " "}
        };

        // indexOnPartOfInput; is to count which index (token) of partsOfInput[] should be put into
        // which position of the board[][]
        int indexOnPartOfInput = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
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

        // X win conditions

        // X wins right diagonal

        for ()



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
































