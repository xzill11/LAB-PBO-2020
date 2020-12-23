
public class Siswa
{
   
    private int nrp;
    private String nama;
    

    public Siswa(int nrpx, String namax)
    {
        // initialise instance variables
        nrp = nrpx;
        nama = namax;
        /* Method Siswa ini adalah method constructor yang digunakan
           untuk menciptakan objek */
    }

    public void setNrp(int nrpx)
    {
        nrp = nrpx;
        /* Ini merupakan method Mutator yang digunakan untuk mengubah
           suatu nilai dari keadaan suatu objek tetapi memiliki parameter*/
    }
    
    public int getNrp()
    {
        return nrp;
        /* method getNrp adalah method Accessor yang digunakan untuk mengembalikan
           atau mendapatkan nilai dari keadaan suatu objek, dengan menggunakan kata get*/
    }
    
    public void setNama(String namax)
    {
        nama = namax;
    }
    
    public String getNama()
    {
        return nama;
    }
}
