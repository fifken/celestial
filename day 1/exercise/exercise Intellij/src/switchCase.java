import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        int cryptoPrice[] = {75000, 2000, 1000};
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih crypto:");
        System.out.println("1 = Bitcoin");
        System.out.println("2 = Ethereum");
        System.out.println("3 = XRP");
        System.out.print("Masukkan nomor pilihan (1-3): ");
        int crypto = input.nextInt();

        switch (crypto) {
            case 1:
                System.out.println("Bitcoin\nPrice: " + cryptoPrice[0]);
                break;
            case 2:
                System.out.println("Ethereum\nPrice: " + cryptoPrice[1]);
                break;
            case 3:
                System.out.println("XRP: Ripple\nPrice: " + cryptoPrice[2]);
                break;
            default:
                System.out.println("Invalid cryptocurrency");
        }

        input.close();
    }
}