import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkInput(readInput()));
    }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String checkInput(int readInput) {

        String up = "move up";
        String down = "move down";
        String left = "move left";
        String right = "move right";
        String dMove = "do not move";
        String error = "error!";

        switch (readInput) {
            case 0:
                return dMove;
            case 1:
                return up;
            case 2:
                return down;
            case 3:
                return left;
            case 4:
                return right;
            default:
                return error;
        }
    }
}
