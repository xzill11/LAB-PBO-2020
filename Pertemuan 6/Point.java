//fazilbasri

public class Point
{
    private int x;
    private int y;
     
    public Point() 
    { 
        x = 0;
        y = 0;
    }
     
    public Point(int x, int y)
    {
        this.x = x; 
        this.y = y;
    }
    
    public int getX() 
    {
        return this.x; 
    }
     
    public void setX(int x)
    {
        this.x = x;
    }
     
    public int getY()
    { 
        return this.y;
    }
    
    public void sety(int y)
    { 
        this.y = y;
    } 
    
    // print  koordinat x dan y
    public String toString()
    {
        return "Titik dengan x=" +x+ " y=" +y ;
    } 
}
 