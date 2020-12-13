package CRUD;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bus{
    public static void deletePenumpang() throws  IOException{
        // kita ambil database original
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        // kita buat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);
        // tampilkan penumpang
        System.out.println("List Penumpang");
        tampilkanPenumpang();
        // kita ambil user input untuk mendelete penumpang
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukan nomor penumpang yang akan dihapus: ");
        int deleteNum = terminalInput.nextInt();
        // looping untuk membaca tiap penumpang baris dan skip penumpang yang akan didelete
        boolean isFound = false;
        int entryCounts = 0;

        String penumpang = bufferedInput.readLine();

        while (penumpang != null){
            entryCounts++;
            boolean isDelete = false;

            StringTokenizer st = new StringTokenizer(penumpang,",");

            // tampilkan penumpang yang ingin di hapus
            if (deleteNum == entryCounts){
                System.out.println("\nPenumpang yang ingin anda hapus adalah:");
                System.out.println("-----------------------------------");
                System.out.println("Kursi           : " + st.nextToken());
                System.out.println("umur         : " + st.nextToken());
                System.out.println("Nama         : " + st.nextToken());
          
                isDelete = Penumpang.getYesorNo("Apakah anda yakin akan menghapus?");
                isFound = true;
            }

            if(isDelete){
                //skip pindahkan penumpang dari original ke sementara
                System.out.println("Penumpang berhasil dihapus");
            } else {
                // kita pindahkan penumpang dari original ke sementara
                bufferedOutput.write(penumpang);
                bufferedOutput.newLine();
            }
            penumpang = bufferedInput.readLine();
        }

        if(!isFound){
            System.err.println("Penumpang tidak ditemukan");
        }

        // menulis penumpang ke file
        bufferedOutput.flush();
        // delete original file
        database.delete();
        // rename file sementara ke database
        tempDB.renameTo(database);

    }

    public static void tampilkanPenumpang() throws IOException{

        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("database.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e){
            System.err.println("Penumpang Tidak ditemukan");
            System.err.println("Silahkan tambah penumpang terlebih dahoeloe");
            tambahPenumpang();
            return;
        }


        System.out.println("\n| No |\tUmur |\tNama ");
        System.out.println("-----------------------");

        String penumpang = bufferInput.readLine();
        int nomorpenumpang = 0;
        while(penumpang != null) {
            nomorpenumpang++;

            StringTokenizer stringToken = new StringTokenizer(penumpang, ",");

            stringToken.nextToken();
            System.out.printf("| %2d ", nomorpenumpang);
            System.out.printf("|\t%4s  ", stringToken.nextToken());
            System.out.printf("|\t%-20s   ", stringToken.nextToken());
            System.out.print("\n");

            penumpang = bufferInput.readLine();
        }

        System.out.println("-------------------------------------");
    }

    public static void cariPenumpang() throws IOException{
        // membaca database ada atau tidak
        try {
            File file = new File("database.txt");
        } catch (Exception e){
            System.err.println("Penumpang Tidak ditemukan");
            System.err.println("Silahkan tambah penumpang terlebih dahoeloe");
            tambahPenumpang();
            return;
        }

        // kita ambil keyword dari user
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukan kata kunci untuk mencari penumpang: ");
        String cariString = terminalInput.nextLine();
        String[] keywords = cariString.split("\\s+");

        // kita cek keyword di database
        Penumpang.cekPenumpangDiPenumpangbase(keywords,true);

    }

     public static void tambahPenumpang() throws IOException{
        FileWriter fileOutput = new FileWriter("database.txt",true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);
        
        //cek kapasitas penumpang
        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput);

        String penumpang = bufferInput.readLine();
        boolean isExistt = false;
        int nomorPenumpang = 0;

        while(penumpang != null){
            penumpang+=1;
            if (penumpang) {
                
            }
        }

        // mengambil input dari user
        
        Scanner terminalInput = new Scanner(System.in);
        String nama,umur;
        System.out.print("masukan nama nama: ");
        nama = terminalInput.nextLine();
        System.out.print("masukan umur : ");
        umur = Penumpang.ambilUmur();

        // cek penumpang di database
        String[] keywords = {umur+","+nama};
        System.out.println(Arrays.toString(keywords));
        boolean isExist = Penumpang.cekPenumpangDiPenumpangbase(keywords,false);

        // menulis penumpang di databse
        if (!isExist){    
            String namaTanpaSpasi = nama.replaceAll("\\s+","");
            String Kursi = namaTanpaSpasi+"_"+umur+"_";
            System.out.println("\nPenumpang yang akan anda masukan adalah");
            System.out.println("----------------------------------------");
            System.out.println("Kursi  : " + Kursi);
            System.out.println("umur: " + umur);
            System.out.println("nama      : " + nama);
           
            boolean isTambah = Penumpang.getYesorNo("Apakah akan ingin menambah penumpang tersebut? ");
            if(isTambah){
                bufferOutput.write(Kursi + "," + umur + ","+ nama);
                bufferOutput.newLine();
                bufferOutput.flush();
            }
        } else {
            System.out.println("penumpang yang anda akan masukan sudah tersedia di database dengan penumpang berikut:");
            Penumpang.cekPenumpangDiPenumpangbase(keywords,true);
          }


    bufferOutput.close();
    }

}
