import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);
    public static double readNumber(String promt){
        return scanner.nextDouble();
    }
    public static double readNumber(String promt, int min, int max) {
        int value;
        while (true) {
            System.out.print(promt);
            value = scanner.nextInt();
            if (value > min && value < max)
                break;
            System.out.println("Enter value greater than " + min + " and smaller than " + max);
        }
        return value;
    }
}
