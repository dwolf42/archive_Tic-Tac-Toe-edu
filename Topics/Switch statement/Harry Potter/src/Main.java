import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String houseGryffindor = "bravery";
        String houseHufflepuff = "loyalty";
        String houseSlytherin = "cunning";
        String houseRavenclaw = "intellect";
        String baseCase = "not a valid house";

        switch (scanner.nextLine().toLowerCase()) {
            case "gryffindor":
                System.out.println(houseGryffindor);
                break;
            case "hufflepuff":
                System.out.println(houseHufflepuff);
                break;
            case "slytherin":
                System.out.println(houseSlytherin);
                break;
            case "ravenclaw":
                System.out.println(houseRavenclaw);
                break;
            default:
                System.out.println(baseCase);
                break;
        }
    }
}