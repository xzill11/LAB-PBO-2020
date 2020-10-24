import java.util.Scanner;

public class Bank{
	public static void main(String[] args) {
		AkunBank akun = new AkunBank(50);
		Scanner in = new Scanner(System.in);



		while(true) {
			System.out.println("\n==================");
			System.out.println("===BANK PBO B===");
			System.out.println("==================");

			System.out.println("Pilhan :\n1. Setoran\n2. Penarikan\n3. Ubah Pin");

			System.out.print("Pilihan anda : ");
			int pilihan = in.nextInt();

					switch(pilihan) {
						case 1 :
							System.out.print("Jumlah Setoran :");
							int setoran = in.nextInt();
							akun.setor(setoran);
							System.out.println(akun);
						break;

						case 2 :
							System.out.print("Jumlah Penarikan :");
							int penarikan = in.nextInt();
							akun.tarik(penarikan);
							System.out.println(akun);
						break;

						case 3 :
							System.out.print("Ubah Pin:");
							int Pin = in.nextInt();
							akun.Pin(Pin);
							System.out.println(akun);
						break;
						
						default:
							System.out.println("Pilihan Tidak ada");
							System.exit(0);
						break;
					}
		}


	}
}