
public class Kathedrale extends Kirche
{
    private int anzahlBesucher;

    public Kathedrale(double pHoehe, int pBesucher)
    {
        super(pHoehe, pBesucher);
        this.anzahlBesucher = pBesucher;
    }
    
    public int anzahlBesucher()
    {
        return anzahlBesucher;
    }
}
