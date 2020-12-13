

// import java library
import java.io.*;
import java.util.Scanner;

// import CRUD library
import CRUD.Bus;
import CRUD.Penumpang;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;

        while (isLanjutkan) {
            Penumpang.clearScreen();
            System.out.println("\nData Penumpang Bus Trans Koetaradja");
            System.out.println("1.\tLihat seluruh penumpang");
            System.out.println("2.\tCari data penumpang");
            System.out.println("3.\tTambah data penumpang");
            System.out.println("4.\tHapus data penumpang");

            System.out.print("\n\nPilihan anda: ");
            pilihanUser = terminalInput.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("\n=====================");
                    System.out.println("LIST SELURUH PENUMPANG");
                    System.out.println("======================");
                    Bus.tampilkanPenumpang();
                    break;
                case "2":
                    System.out.println("\n============");
                    System.out.println("CARI PENUMPANG");
                    System.out.println("==============");
                    Bus.cariPenumpang();
                    break;
                case "3":
                    System.out.println("\n===================");
                    System.out.println("TAMBAH DATA PENUMPANG");
                    System.out.println("=====================");
                    Bus.tambahPenumpang();
                    Bus.tampilkanPenumpang();
                    break;
                case "4":
                    System.out.println("\n==================");
                    System.out.println("HAPUS DATA PENUMPANG");
                    System.out.println("====================");
                    Bus.deletePenumpang();
                    break;
                default:
                    System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-4]");
            }
            isLanjutkan = CRUD.Penumpang.getYesorNo("Apakah Anda ingin melanjutkan");
        }
    }

}