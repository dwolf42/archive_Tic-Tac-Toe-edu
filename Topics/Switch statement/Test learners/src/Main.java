import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        userAnswer();
    }

    public static void userAnswer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(returnsAnswer(scanner.nextInt()));
    }

    public static String returnsAnswer(int selectOption) {

        String opt1 = "Yes!";
        String opt2 = "No!";
        String opt3 = "Unknown number";

        switch (selectOption) {
            case 1:
                return opt1;
            case 2:
            case 3:
            case 4:
                return opt2;
            default:
                return opt3;
        }
    }
}