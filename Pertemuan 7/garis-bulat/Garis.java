
/**
 * Write a description of class Garis here.
 * 
 * @author fazil basri
 * @version (a version number or a date)
 */
public class Garis implements Pembanding
{
    // instance variables - replace the example below with your own
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    /**
     * Constructor for objects of class Garis
     */
    public Garis(int koordinat_x1, int koordinat_y1, int koordinat_x2, int koordinat_y2)
    {
        // initialise instance variables
        x1 = koordinat_x1;
        y1 = koordinat_y1;
        x2 = koordinat_x2;
        y2 = koordinat_y2;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double panjangGaris()
    {
        double panjang = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        return panjang;
    }
    
    public boolean lebihBesar(Object a, Object b)
    {
        Garis ga = (Garis) a;
        Garis gb = (Garis) b;
        
        if(ga.panjangGaris() > gb.panjangGaris())
            return true;
        else
            return false;
    }
    
    public boolean lebihKecil(Object a, Object b)
    {
        Garis ga = (Garis) a;
        Garis gb = (Garis) b;
        
        if(ga.panjangGaris() < gb.panjangGaris())
            return true;
        else
            return false;
    }
    
    public boolean samaDengan(Object a, Object b)
    {
        Garis ga = (Garis) a;
        Garis gb = (Garis) b;
        
        if(ga.panjangGaris() == gb.panjangGaris())
            return true;
        else
            return false;
    }
}
