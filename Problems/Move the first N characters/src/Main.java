import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        String[] oldArray = s.split("");
        if (n == oldArray.length || n == 0) {
            System.out.println(s);
        } else {
            String[] newArray = new String[oldArray.length];


        /*
        // copy the fist n elements to the end of the array
       (1) 2 3 4 5
        H  E L L O -> old[from 0 to n - 1]
        0  1 2 3 4
                 H -> new[from length - n + i]

        1 (2) 3 4 5
        H  E  L L O -> old[from 0 to n - 1]
        0  1  2 3 4
                H E -> new[length - n + i]

        1 2 (3) 4 5
        H E  L  L O -> old[from 0 to n - 1]
        0 1  2  3 4
             H  E L -> new[length:5 - n:3 = 2 + i:0 = 2]

        1 2 3 (4) 5
        H E L  L  O -> old[from 0 to n - 1]
        0 1 2  3  4
          H E  L  L
-------------------------------------------------
        // copy the elements past n to the beginning of the array
       (1) 2 3 4 5
        H  E L L O -> old[from n + j to < length]
        0  1 2 3 4
        E  L L O   -> new[j]

        1 (2) 3 4 5
        H  E  L L O -> old[from n + j to < length]
        0  1  2 3 4
        L  L  O     -> new[j]

        1 2 (3) 4 5
        H E  L  L O -> old[from n:3 + j:0 = 3 to < length] // old[n3 + j0 = 3L], old[n3 + j1 = 4O]
        0 1  2  3 4
        LO          -> new[j]

        1 2 3 (4) 5
        H E L  L  O -> old[from n + j to < length]
        0 1 2  3  4
        O           -> new[j]



        Phew, hab jetzt noch mal einiges Zeit investiert und hin und her experimentiert, um ne Lösung zu finden.
Letztlich bin ich zu exakt der gleichen Lösung gekommen wie du, aber ohne abzugucken 😁😁
Es hat mir geholfen die Aufgabe nicht nur komplett zu zerlegen, sondern für ein Szenario alle möglichen Varianten durchzuspielen. Anfangs hatte ich mich nur auf die Varianten HELLO 3 eingeschossen und dafür auch Lösungen gefunden. Blöderweise haben die dann nicht funktioniert, wenn aus der 3 eine 2 oder 4 geworden ist.

Bin wirklich mächtig stolz darüber als Anfänger auf deine Lösung gekommen zu sein😍
Werde es später noch finalisieren und
        */

            // copy first n elements to the end of the new array
            for (int i = 0; i < n; i++) {
                newArray[oldArray.length - n + i] = oldArray[i];
            }
            // copy elements past n to the beginning of the new array
            for (int j = 0; j < oldArray.length - n; j++) {
                newArray[j] = oldArray[n + j];
            }
            // print the new array
            System.out.println(String.join("", newArray));
        }
    }
}
//        Scanner scanner = new Scanner(System.in);
//
//        String input = scanner.next();
//        int n = scanner.nextInt();
//        String[] stringInputToArray = input.split("");
//        String[] newArray = new String[stringInputToArray.length];
//
//       // for (int i = ((stringInputToArray.length - n) + 1), j = 0; i < newArray.length; i++, j++) {
//         //   newArray[j] = stringInputToArray[i];
//       // }
//        for (int i = 0, j = n; i < stringInputToArray.length; i++, j++) {
//            newArray[i] = stringInputToArray[j];
//        }
//        for (int k = n, l = 0; k < newArray.length; k++, l++) {
//            newArray[k] = stringInputToArray[l];
//        }
//        System.out.println(Arrays.toString(newArray));
//    }
//}
/*
01234
Helto 3 -> toHel
12345

1. Loop: newArray[0] = stringInputToArray[2]

n - 1 = index 2 = l


loop to copy chars past n
i = (stringInputToArray.length - n); i < stringInputToArray - 1; i++

alternative to ^
i = times - 1; i < stringInputToArray.length - 1; i++;

loop to copy first n chars
i < times - 1;


*/
