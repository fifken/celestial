import java.util.Scanner;

public class forLoop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int crypto = input.nextInt();

        for (int i = 0; i < crypto; i++) {
            System.out.printf("A%d", (i + 1));
            for (int j = 0; j < 5; j++) {
                System.out.printf(" B%d", (j - 1));
            }
            System.out.println();
        }
        input.close();
    }
}