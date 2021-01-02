import java.util.Random;

public class RandomRange {

	public static void main(String[] args) {

		Random num = new Random();
		int randomnum = num.nextInt(10)+4;
		System.out.println("Random Number: " + randomnum);
	}
}

/*
contoh code diatas adalah penggunaan class random. Class Random ini
memiliki method untuk mengembalikan nilai acak yang b,
double, boolean, float dan long. perlu menambahkan import 
java.util.Random sehingga hasil dari kode diatas akan menghasilkan
nilai acak. Outputnya :
Random Number: 10

*/