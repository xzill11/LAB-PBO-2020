//fazil basri

class EnumExample1{
 public enum Season { WINTER, SPRING, SUMMER, FALL}
 public static void main(String[] args) {
    for (Season s : Season.values())
  System.out.println(s); 
   }
}  

/**
	Output :
	WINTER
	SPRING
	SUMMER
	FALL

	menggunakan method .values() dapat mencetak variable enum yang sudah di isi.
*/