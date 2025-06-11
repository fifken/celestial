import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

            int factorial = 1;
            for (int j = 1; j <= num; j++) {
                System.out.printf("Multiplying %d by %d%n", factorial, j);
                factorial *= j;
            }
            System.out.printf("\nFactorial of %d is %d%n\n", num, factorial);
        input.close();
    }
}