import java.util.Scanner;

public class whileLoop{
    public static void main(String[] args) {
        System.out.println("Tebak Harga Saham BBCA!");
        int BBCA = 9900;
        int i = 0;
        int tebakan[] = new int[3];
        Scanner input = new Scanner(System.in);


        while(i<3){
            int saham = input.nextInt();

            if (saham == BBCA){
                System.out.println("Selamat! Kamu benar, harga saham BBCA adalah " + BBCA);
                break;
            } else if (saham < BBCA) {
                System.out.printf("Tebakan kamu terlalu rendah[%d]. Coba lagi!\n", saham);
            } else {
                System.out.printf("Tebakan kamu terlalu tinggi[%d]. Coba lagi!\n", saham);
            }
            tebakan[i] = saham;
            i++;
        }
        input.close();
        if (i == 3) {
            System.out.println("Maaf, kamu sudah mencoba 3 kali. Harga saham BBCA adalah " + BBCA);
            System.out.println("Tebakan kamu: ");
            for (int j = 0; j < 3; j++) {
                System.out.printf("Tebakan %d: %d\n", (j + 1), tebakan[j]);
            }
        } else {
            System.out.println("Kamu berhasil menebak harga saham BBCA dalam " + (i + 1) + " percobaan.");
        }
    }
}