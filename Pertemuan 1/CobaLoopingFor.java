public class CobaLoopingFor
{
public static void main(String arg[])
{
for (int i=0; i<10; i++)
{
for (int j=0; j<i+1; j++)
System.out.print('*');
System.out.println();
}
}
} 
/*
kode ini bertujuan looping string * , jika for nya belum terpenuhi maka dia akan terus
print. dan semkin ke bawah semakin bertambah 1 bintang sampai dengan 10
*/
