package pl.edu.pg.eti.ksg.po.lab1.transformacje;

public class Punkt
{
    private final double x,y;
    public Punkt(double x, double y)
    {
        this.x=x;
        this.y=y;
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public boolean equals(Object obj)
    {
        if(obj instanceof Punkt)
        {
            Punkt other = (Punkt) obj;
            return (x == other.x && y== other.y);
        }
        return false;
    }
    @Override
    public int hashCode()
    {
        return 59*Double.hashCode(x) + 59*Double.hashCode(y) + 14;
    }
    @Override
    public String toString()
    {
        return "Punkt o wspolrzednych (" + x + "," + y + ")";
    }

    public static final Punkt O = new Punkt(0, 0);
    public static final Punkt E_X = new Punkt(1, 0);
    public static final Punkt E_Y = new Punkt(0, 1);

}
