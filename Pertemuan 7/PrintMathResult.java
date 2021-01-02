//fazil basri

public class PrintMathResult {

	public static void main(String args[]) {
		
		Math.sqrt(121.0); //no output
		System.out.println("Square root: " + Math.sqrt(121.0));
		double result = Math.min(3, 7) + Math.abs(-50);
		System.out.println("Result is " + result);
	}
}

/* 
Penggunaan Math.sqrt atau untuk mencari akar, maka program akan menghasilkan
nilai dari akar 121 yaitu 11. Dan selanjutnya contoh dari Math.min dan Mat.abs,
karena nilai terkecilnya adalah 3, maka hasilnya adalah 53. Output nya seperti ini
Square root: 11.0
Result is 53.0
*/