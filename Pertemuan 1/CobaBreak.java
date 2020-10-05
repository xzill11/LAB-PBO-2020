public class CobaBreak
{
public static void main(String arg[])
{
for (int i=0; i<10; i++)
{
for (int j=0; j<i+1; j++)
{
if(j==5)
break;
System.out.print('*');
}
System.out.println();
}
}
} 
/*
paada sistem ini menggunakna break untuk memberhenti perulangan
for jika melebihi 5 bintang pada baris 5 sampai dengan 10
*/