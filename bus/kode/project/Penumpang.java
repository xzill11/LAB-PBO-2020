package kode.project;

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

// class penumpang
public class Penumpang{
	private String nama;
    private int umur;
    private boolean hamil;
	private boolean prioritas;

    public Penumpang(String nama,int umur, boolean hamil){
        this.nama = nama;
        this.umur = umur;
		this.hamil = hamil;
		if (umur > 60 || umur < 10 || hamil) {
            prioritas = true;
        }else{
            prioritas = false;
        }
	}

	//method set
	public String getNama(){
		return nama;
	}
	public void setNama(){
		this.nama=nama;
	}
	public long getUmur(){
		return umur;
	}
	public void setUmur(){
		this.umur=umur;
	}
	public boolean getHamil(){
		return hamil;
	}
	public void setHamil(){
		this.hamil=hamil;
	}
	public boolean getPrioritas(){
		return this.prioritas;
	}
	public void setPrioritas(){
		this.prioritas=prioritas;
	}

	/*
	method ini digunakan untuk clear screen cmd
	*/
	public static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception ex){
            System.err.println("tidak bisa clear screen");
        }
	}
	
	/*
	metod pilihan ini akan digunakan untuk bolean 
	jika user memilih y/n
	*/
	public static boolean getYesorNo(String message){
        Scanner Input = new Scanner(System.in);
        System.out.print("\n"+message+" (y/n)? ");
        String pilihanUser = Input.next();

        while(!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println("Pilihan anda bukan y atau n");
            System.out.print("\n"+message+" (y/n)? ");
            pilihanUser = Input.next();
        }
        return pilihanUser.equalsIgnoreCase("y");
	}

	/*
	metod waktu ini digunakan untuk menampilkan tanggal,waktu
	serta output tergantung waktu pogram ini dijalankan
	*/
	public static void time(){
		GregorianCalendar time = new GregorianCalendar();
		int hour = time.get(Calendar.HOUR_OF_DAY);
		int min = time.get(Calendar.MINUTE);
		int day = time.get(Calendar.DAY_OF_MONTH);
		int month = time.get(Calendar.MONTH) + 1;
		int year = time.get(Calendar.YEAR);
		System.out.println(+ day + "/" + month + "/"+ year + "\n"+ hour + ":" + min);
		if (hour < 12)
			System.out.println("Selamat Pagi! Semangat Kerja!\n");
		else if (hour < 17 && !(hour == 12))
			System.out.println("Selamat Sore! Jalanan Padat!\n");
		else if (hour == 12)
			System.out.println("Selamat Siang! Tetap Semangat!\n");
		else
			System.out.println("Selamat Malam! Istirahat Dulu Yok!\n");
	}

	//menampilakn data agar tidak dalam bentuk kode
	public String toString(){
		return "\nNama : "+nama+"\nUmur : "+umur+"\nHamil : "+hamil;	
	}
}