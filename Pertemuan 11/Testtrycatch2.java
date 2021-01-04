public class Testtrycatch2{  
 public static void main(String args[]){  
  try{  
        int data=10/0;  
     }catch(ArithmeticException e){System.out.println(e);}  
   
  System.out.println("rest of the code...");  
 }  
}  

/**
	Output :
	java.lang.ArithmeticException: / by zero
	rest of the code...

	eror pada kode program dihandle oleh exception handling
	saat di run seharusnya menghasilkan eror, karena sudah dihandle akan diprint pesan
	erornya namun program tetap berjalan.
*/
   