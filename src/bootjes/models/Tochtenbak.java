package bootjes.models;

import java.util.*;
public class Tochtenbak
{
    private ArrayList tochten;
    public Tochtenbak()
    {
        tochten = new ArrayList();
    }
    public Tocht geefTocht(int nr)
    {
        Tocht eenTocht =(Tocht)tochten.get(nr-1);
        return eenTocht;
    }
    public int geefAantalBeeindigdeTochten()
    {
        int aantalTochten, aantalBTochten;
        aantalTochten = tochten.size();
        aantalBTochten = 0; // init aantalBeeindigdeTochten
        for (int i=1; i<=aantalTochten; i=i+1)
        {
            boolean antwoord;
            Tocht eenTocht;
            eenTocht = this.geefTocht(i);
            antwoord = eenTocht.isBeeindigd();
            if (antwoord)
            {
                aantalBTochten = aantalBTochten + 1;
            }
        }
        return aantalBTochten;
    }
    public CGTime geefGemiddeldeDuur()
    {
        int aantalTochten, aantalBTochten;
        CGTime totDuur;
        CGTime gemDuur;
        aantalTochten = tochten.size();
        aantalBTochten = 0;
        totDuur = CGTime.fromSeconds(0);
        for (int i=1; i<=aantalTochten; i=i+1)
        {
            boolean antwoord;
            CGTime eenDuur;
            Tocht eenTocht;
            eenTocht = this.geefTocht(i);
            antwoord = eenTocht.isBeeindigd();
            if (antwoord)
            {
                aantalBTochten = aantalBTochten + 1;
                eenDuur = eenTocht.geefDuur();
                totDuur = totDuur.addTime(eenDuur);
            }
        }
        if (aantalBTochten > 0)
        {
            long duurInSeconden;
            long gemDuurInSeconden;
            duurInSeconden = totDuur.asSeconds();
            gemDuurInSeconden = duurInSeconden / aantalBTochten;
            gemDuur = CGTime.fromSeconds((int)gemDuurInSeconden);
        }
        else
        {
            gemDuur = CGTime.fromSeconds(0);
        }
        return gemDuur;
    }
    public int voegToe(Tocht eenTocht)
    {
        int tochtNummer;
        tochten.add (eenTocht);
        tochtNummer = tochten.size();
        return tochtNummer;
    }
}