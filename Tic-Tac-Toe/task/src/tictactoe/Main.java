package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        userInput();
    }

    public static void userInput() {
        Scanner scanner = new Scanner(System.in);

        String[] partsOfInput = scanner.nextLine().toUpperCase().split("");
        scanner.close();

        gameBoard(partsOfInput);
    }

    public static void gameBoard(String[] partsOfInput) {
        String[][] board = {{"-", "-", "-", "-", "-", "-", "-", "-", "-"},
//                   i:1 j:2v  i:1 j:4v  i:1 j:6v
                {"|", " ", "_", " ", "_", " ", "_", " ", "|"},
//                   i:2 j:2v  i:2 j:4v  i:2 j:6v
                {"|", " ", "_", " ", "_", " ", "_", " ", "|"},
//                   i:3 j:2v  i:3 j:4v  i:3 j:6v
                {"|", " ", "_", " ", "_", " ", "_", " ", "|"},
                {"-", "-", "-", "-", "-", "-", "-", "-", "-"}
        };

        int indexOnPartOfInput = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 2; j < 7; j += 2) {
                board[i][j] = partsOfInput[indexOnPartOfInput];
                indexOnPartOfInput++;
            }
        }
        printIt(board);
    }

    public static void gameStateAnalyzer(String[][] gameBoard) {
        /*getting gameBoard, iterate through board
        * to determine:
        * -> Game not finished: neither side wins and empty cells
        * -> Draw: neither side wins, no more empty cells
        * -> X wins: three X's in a row
        * -> O wins: three O's in a row
        * -> Impossible: three X's and three O's in a row,
        * or more X's than O's or vice versa - ratio should be 1 or 0, 2 or more is impossible
        * */

        //Impossible: ratio X to O
        int amountX = 0;
        int amountO = 0;
        for (String[] strings : gameBoard) {
            for (int j = 0; j < gameBoard[1].length; j++) {
                if (strings[j].equals("X")) {
                    amountX++;
                }
                if (strings[j].equals("O")) {
                    amountO++;
                }
            }
        }

        boolean impossible = amountX - amountO !=0 || amountX - amountO !=1;

        //Impossible: three X's and three O's in a row
        //results form concurrency of X and O



    }

    public static void printIt(boolean impossible, String[][] partsOfBoard) {
        for (String[] strings : partsOfBoard) {
            for (String stringsi : strings) {
                System.out.print(stringsi);
            }
            System.out.println("");
        }
        boolean possi = impossible;
        System.out.println(possi);
    }

}

