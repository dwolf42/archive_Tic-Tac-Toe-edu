import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       System.out.println(selectShape(readNum()));
    }

    public static int readNum() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String selectShape(int readNum) {
        String square = "You have chosen a square";
        String circle = "You have chosen a circle";
        String triangle = "You have chosen a triangle";
        String rhombus = "You have chosen a rhombus";
        String nope = "There is no such shape!";

        switch (readNum) {
            case 1:
                return square;
            case 2:
                return circle;
            case 3:
                return triangle;
            case 4:
                return rhombus;
            default:
                return nope;
        }
    }
}