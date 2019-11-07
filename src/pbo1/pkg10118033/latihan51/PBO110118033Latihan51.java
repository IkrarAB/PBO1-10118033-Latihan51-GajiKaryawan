
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan Gaji
 *                     Karyawan.
 *  
 */

package pbo1.pkg10118033.latihan51;

import java.util.Scanner;

public class PBO110118033Latihan51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager1 = new Manager();
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK  : ");manager1.setNik(sc.next());
        sc.nextLine();
        System.out.print("Masukkan Nama : ");
        manager1.setNama(sc.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");manager1.setGolongan(sc.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");manager1.setJabatan(sc.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");manager1.setKehadiran(sc.nextInt());
        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("NIK  : "+manager1.getNik());
        System.out.println("NAMA : "+manager1.getNama());
        System.out.println("GOLONGAN : "+manager1.getGolongan());
        System.out.println("JABATAN  : "+manager1.getJabatan()+"\n");
        System.out.println("TUNJANGAN GOLONGAN  : "+manager1.tunjanganGolongan(manager1.getGolongan()));
        System.out.println("TUNJANGAN JABATAN   : "+manager1.tunjanganJabatan(manager1.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : "+manager1.tunjanganKehadiran(manager1.getKehadiran())+"\n");
        System.out.println("GAJI TOTAL : "+manager1.gajiTotal());
    }
}