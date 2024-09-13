import java.util.Scanner;

/**
 * transactionincafes
 */
public class transactionincafes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jumlahKopi;
        int jumlahTeh;
        int jumlahRoti;
        double hargaKopi = 12.000;
        double hargaTeh = 7.000;
        double hargaRoti = 20.000;
        double diskon = 0.10;
        double totalHarga;
        double nominalBayar;

        System.out.println("Enter membership: ");
        keanggotaan = input.nextBoolean();
        System.out.println("Enter number of coffe: ");
        jumlahKopi = input.nextInt();
        System.out.println("Enter amount of tea: ");
        jumlahTeh = input.nextInt();
        System.out.println("Enter amount of bread: ");
        jumlahRoti = input.nextInt();

        totalHarga = (jumlahKopi * hargaKopi) + (jumlahTeh * hargaTeh) + (jumlahRoti * hargaRoti);
        nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Nominal payment: " + nominalBayar);
    }
}