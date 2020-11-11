package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ticTac();

    }

    public static void ticTac() {
        Scanner scanner = new Scanner(System.in);
 
        // input from user
        String input = scanner.nextLine();
       
        scanner.close();

        char[][] tic = new char[5][9];
        // dash-row-top
        tic[0][0] = '-';
        tic[0][1] = 'a';
        tic[0][2] = '-';
        tic[0][3] = '-';
        tic[0][4] = '-';
        tic[0][5] = '-';
        tic[0][6] = '-';
        tic[0][7] = '-';
        tic[0][8] = '-';

        // first-row
        tic[1][0] = '|';
        tic[1][1] = ' ';
        tic[1][2] = input.charAt(0);
        tic[1][3] = ' ';
        tic[1][4] = input.charAt(1);
        tic[1][5] = ' ';
        tic[1][6] = input.charAt(2);
        tic[1][7] = ' ';
        tic[1][8] = '|';

        // second-row
        tic[2][0] = '|';
        tic[2][1] = ' ';
        tic[2][2] = input.charAt(3);
        tic[2][3] = ' ';
        tic[2][4] = input.charAt(4);
        tic[2][5] = ' ';
        tic[2][6] = input.charAt(5);
        tic[2][7] = ' ';
        tic[2][8] = '|';

        // third-row
        tic[3][0] = '|';
        tic[3][1] = ' ';
        tic[3][2] = input.charAt(6);
        tic[3][3] = ' ';
        tic[3][4] = input.charAt(7);
        tic[3][5] = ' ';
        tic[3][6] = input.charAt(8);
        tic[3][7] = ' ';
        tic[3][8] = '|';

        // dash-row-bottom
        tic[4][0] = '-';
        tic[4][1] = '-';
        tic[4][2] = '-';
        tic[4][3] = '-';
        tic[4][4] = '-';
        tic[4][5] = '-';
        tic[4][6] = '-';
        tic[4][7] = '-';
        tic[4][8] = '-';

        for (int i = 0; i < tic.length; i++) {
            int j;
            for (j = 0; j < tic[i].length - 1; j++) {
                System.out.print(tic[i][j]);
            }

            System.out.print(tic[i][j] + "\n");

        }

    }

}