import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int defineLength = scanner.nextInt();
        int[][] matrix = new int[defineLength][defineLength];

        for (int i = 0; i < defineLength; i++) {
            for (int j = i; j > 0; j--) {
               // System.out.print(j + " ");
                matrix[j][] = j;
            }
            for (int k = 0; k < defineLength - i; k++) {
                System.out.print(k + " ");
            }
            System.out.println("");
        }
    }
}