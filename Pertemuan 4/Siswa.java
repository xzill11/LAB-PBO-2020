

public class Siswa
{
    
    private int nrp;
    private String nama;
    
    /**
     * Constructor for objects of class Siswa
     */
    public Siswa(int nrp)
    {
        // initialise instance variables
        this.nrp = 12345;
        this.nama = "nama default";
    }
    
    public Siswa(int nrp, String nama)
    {
        this.nrp = nrp;
        this.nama = nama;
    }

    public void setNrp(int nrp)
    {
        // put your code here
        this.nrp = nrp;
    }
    
    public int getNrp()
    {
        return this.nrp;
    }
    
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    public String getNama()
    {
        return this.nama;
    }
    
    public String toString()
    {
        return this.nrp + "  " + this.nama;
    }
}
