
/**
 * Write a description of class BilanganBulat here.
 * 
 * @author fazil basri
 * @version 2021
 */
public class BilanganBulat implements Pembanding
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class BilanganBulat
     */
    public BilanganBulat(int bilangan)
    {
        // initialise instance variables
        x = y;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getNilai()
    {
        // put your code here
        return x;
    }
    
    public void setNilai(int y)
    {
        // put your code here
        x = y;
    }
    
 
    public boolean lebihKecil(Object a, Object b)
    {
        BilanganBulat a1 = (BilanganBulat) a;
        BilanganBulat b1 = (BilanganBulat) b;
        
        if(a1.getNilai() < b1.getNilai())        
            return true;
        else
            return false;
    }
    
    public boolean samaDengan(Object a, Object b)
    {
        BilanganBulat a1 = (BilanganBulat) a;
        BilanganBulat b1 = (BilanganBulat) b;
        
        if(a1.getNilai() == b1.getNilai())        
            return true;
        else
            return false;
    }
    
    public double bagi(int y)
    {
        double z = 0;
        try{
            z = x / y;
        }
        catch (Exception e){
            System.out.println("Masukkan nilai y yang bukan 0");
        }
        return z;
    }
}
