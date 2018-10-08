import java.util.Scanner;

//NAMA  :Aldi Lesmana 
//NIM   :10117108   
//KELAS :IF-3

/**
 *
 * @author Aldi Lesmana
 */
public class main {
    public static void main(String[] args) {
         Mahasiswa mah = new Mahasiswa();
         Scanner scn = new Scanner(System.in);

         int n;
         System.out.print("Masukkan Banyaknya Mahasiswa : ");
         n = scn.nextInt();

         mah.HitungTotal(mah.nilaiMhs, n);
         mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : "+mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs,n));
        System.out.println("Developed by : Rizki Adam Kurniawan");

    }
    
}