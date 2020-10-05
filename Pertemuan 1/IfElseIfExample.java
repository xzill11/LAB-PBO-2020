public class IfElseIfExample {
public static void main(String[] args) {
int marks=65;

if(marks<50){
System.out.println("fail"); //jika nilai 50 maka gagal
}
else if(marks>=50 && marks<60){ // jika nilai >=50 && marks<60 maka grade D, dan begitu juga dengan kode dibawah ini
System.out.println("D grade");
}
else if(marks>=60 && marks<70){
System.out.println("C grade");
}
else if(marks>=70 && marks<80){
System.out.println("B grade");
}
else if(marks>=80 && marks<90){
System.out.println("A grade");
}else if(marks>=90 && marks<100){
System.out.println("A+ grade");
}else{
System.out.println("Invalid!");
  }
 }
}
/*
kode diats bertujuan untuk menentukan grade dari nilai 65
dengan cara seleksi if else. maka nilai 65 masuk ke grde C
*/