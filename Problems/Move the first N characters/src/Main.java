import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        int n = scanner.nextInt();
        String[] stringInputToArray = input.split("");
        String[] newArray = new String[stringInputToArray.length];

       // for (int i = ((stringInputToArray.length - n) + 1), j = 0; i < newArray.length; i++, j++) {
         //   newArray[j] = stringInputToArray[i];
       // }
        for (int i = n - 1, j = 0; i < newArray.length; i++, j++) {
            newArray[j] = stringInputToArray[i];
        }
        for (int k = n, l = 0; k < newArray.length; k++, l++) {
            newArray[k] = stringInputToArray[l];
        }
        System.out.println(Arrays.toString(newArray));
    }


}
/*
01234
Hello 3

loop to copy chars past n
i = (stringInputToArray.length - n); i < stringInputToArray - 1; i++

alternative to ^
i = times - 1; i < stringInputToArray.length - 1; i++;

loop to copy first n chars
i < times - 1;


*/
