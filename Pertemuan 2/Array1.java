public class Array1 {
	public static void main(String args[]) {
		int nilai[]=new int[3];
		nilai[0]=70;
		nilai[1]=80;
		nilai[2]=65;
		double ratarata=0.0;

		for(int i=0; i<nilai.length; i++) //untuk mengambil nilai dari array
			ratarata+=nilai[i];

		ratarata/=nilai.length;
		System.out.println("Nilai rata-rata = " + ratarata);
	}
}
/*
kode diatas bertujuan untuk menghitung rerata element pada array
setelah dijumlahkan
*/