import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Dorf.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Dorf
{
    private Gebaeude[] dGebaeude = new Gebaeude[7];
    private int anzahlBesucher = 0;
    
    Random zahlenGen = new Random();
    
    
    public Dorf()
    {
        erstelleDorf();
    }
    
    
    public void erstelleDorf()
    {
         dGebaeude[0] = new Einfamilienhaus(2, 1, 5);
         dGebaeude[1] = new Einfamilienhaus(3, 1, 7);
         dGebaeude[2] = new Einfamilienhaus(1.2, 2, 3);
         dGebaeude[3] = new Einfamilienhaus(1.5, 2, 10);
         dGebaeude[4] = new Einfamilienhaus(2.1, 3, 11);
         dGebaeude[5] = new Einfamilienhaus(2.7, 1, 5);
         dGebaeude[6] = new Kathedrale(10, 100);
    }
    
    public int besucher()
    {
        for(int i = 0; i < dGebaeude.length; i++)
        {
            anzahlBesucher = anzahlBesucher + dGebaeude[i].anzahlBesucher();
        }
        return anzahlBesucher;
    }
    
    public void gebaeudeHinzufuegen(Gebaeude pGebaeude)
    {
        Gebaeude[] dGebaeudeNeu = new Gebaeude[dGebaeude.length+1];
        for(int i = 0; i < dGebaeude.length; i++)
        {
            dGebaeudeNeu[i] = dGebaeude[i];
        }
        dGebaeudeNeu[dGebaeudeNeu.length-1]=pGebaeude;
        dGebaeude = dGebaeudeNeu;
    }
    
    public void ersteVeraenderung()
    {
        gebaeudeHinzufuegen(new Hochhaus(3, 7, 123));
        gebaeudeHinzufuegen(new Dom(32, 80));
    }
    
    public void zweitwVeraenderung()
    {
        gebaeudeHinzufuegen(new Hochhaus(3, 12, 59));
        gebaeudeHinzufuegen(new Hochhaus(2.6, 8, 67));
        gebaeudeHinzufuegen(new Kathedrale(30, 90));
    }
}
