import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printIt(swapParts(splitInput(input)));
    }

    public static String[] splitInput(String input) {
        String[] splitted = input.split("-");
        return splitted;
    }

    public static String[] swapParts(String[] splitInput) {
        String[] blah = splitInput[];
        String[] reversed = new String[splitInput.length];
        String[] temp = splitInput[1];
        for (int i = 0; i < splitInput.length; i++) {
            temp[i] = splitInput[i];
            reversed[i] = splitInput[i];
        }
        return reversed;
    }

    public static void printIt(String[] swapParts) {
        for (int i = 0; i < swapParts.length; i++) {
            System.out.print(swapParts[i]);
            if (i < 2) {
                System.out.print("/");
            }
        }
    }

}

/*
Convert a date
Write a program that takes a date string formatted as YYYY-MM-DD as input, then converts and outputs it as MM/DD/YYYY.

For instance, the input 2007-07-21 will result in the following output 07/21/2007.


Sample Input:
2012-09-28

Sample Output:
09/28/2012
*/