class SumOfArray{
   public static void main(String args[]){
      int arr[] = {11, 11, 11}; //elemnet array
      int jumlah = 0;
      for( int num : arr) { //num sebgai objek tunggal pemanggil element array (arr)
          jumlah = jumlah+num;
      }
      System.out.println("jumlah element array adalah:"+jumlah);
   }
}
// kode diats bertujuan untuk menjumlahkan element dari array