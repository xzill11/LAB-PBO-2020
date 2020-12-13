/*
Fazil Basri
1908107010032
*/
package kode.main;
import java.util.Scanner;

// import package class
import kode.project.Penumpang;
import kode.project.Bus;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilihanUser,nama;
        char inputHamil;
        boolean isLanjutkan = true, hamil,berhasilNaik;
        int umur;
        Penumpang penumpang;

        Bus bus = new Bus();
        while (isLanjutkan) { //while ini bertujuan untuk menanyakan user untuk melanjutkan kemenu selanjutnya
            Penumpang.clearScreen();
            System.out.println("\n==================================");
            System.out.println("Data Penumpang Bus TransKoetaRadja");
            System.out.println("==================================");
            Penumpang.time();
            System.out.println("1. Lihat seluruh penumpang");
            System.out.println("2. Tambah data penumpang");
            System.out.println("3. Hapus data penumpang");

            System.out.print("\n\nPilihan anda: ");
            pilihanUser = input.next();
            int jmlh = bus.getJumlahPenumpangBiasa() + bus.getJumlahPenumpangPrioritas();

            switch (pilihanUser) {
                case "1":
                    if(jmlh == 0){
                        System.out.println("\nPenumpang Belum Ada Loh!");
                    }else{
                        System.out.println("\n======================");
                        System.out.println("LIST SELURUH PENUMPANG");
                        System.out.println("======================");
                        bus.display();
                    }
                    break;
                case "2":
                    if (jmlh < 6){
                        System.out.println("\n=====================");
                        System.out.println("TAMBAH DATA PENUMPANG");
                        System.out.println("=====================");
                        System.out.print("Nama : ");nama=input.next();
                        System.out.print("Umur : "); umur=input.nextInt();
                        System.out.print("Hamil (y/n) : "); inputHamil = input.next().charAt(0);
                        if (inputHamil == 'y') {
                        hamil = true;
                        }else {
                            hamil = false;
                        }
                        penumpang = new Penumpang(nama, umur, hamil);
                        berhasilNaik = bus.naik(penumpang);
                        bus.display();
                    }
                    else{
                        System.out.println("==Penumpang Penuh!==");
                        bus.display();
                    }
                    break;
                case "3":
                    if(jmlh == 0){
                        System.out.println("\nPenumpang Belum Ada Loh!");
                    }else{
                        System.out.println("\n==================");
                        System.out.println("HAPUS DATA PENUMPANG");
                        System.out.println("====================");
                        bus.display();
                        System.out.println("\ninput nama yang dihapus :");nama=input.next();
                        bus.turun(nama);
                        bus.display();
                    }
                    break;
                default:
                    System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-3]");    
            }
            isLanjutkan = kode.project.Penumpang.getYesorNo("Apakah ingin melanjutkan");
        }
    }      
}