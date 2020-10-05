public class CobaLoopingWhile
{
public static void main(String arg[])
{
int i=0;
while (i<10)
{
int j=0;
while (j<i+1)
{
System.out.print('*');
j++;
}
System.out.println();
i++;
}
}
} 
/*
kode ini bertujuan looping string * , jika for nya belum terpenuhi maka dia akan terus
print. dan semkin ke bawah semakin bertambah 1 bintang sampai dengan 10  
menggunakan while*/