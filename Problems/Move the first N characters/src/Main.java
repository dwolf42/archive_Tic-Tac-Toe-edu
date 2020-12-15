import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        if (n > s.length()) {
            System.out.println(s);
        }

        String[] arrayFromInput = s.split("");
        String[] rotatedArray = shiftArrayTimes(arrayFromInput, n);
        printIt(rotatedArray);
    }

    public static String[] shiftArrayTimes(String[] arrayToRotate, int rotations) {
        for (int i = 0; i < rotations; i++) {
            shiftArrayToRigt(arrayToRotate);
        }
        return arrayToRotate;
    }



}

/*
hello 3
x read a string s
x read an int n
move first n characters to the end of string
print new string
if n > s.length() output unchanged string

*/