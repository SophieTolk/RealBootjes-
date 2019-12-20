package bootjes.models;

public class Verhuurder
{
    private Tochtenbak mijnBak;
    public Verhuurder()
    {
        mijnBak = new Tochtenbak();
    }
    public int startTocht()
    {
        Tocht eenTocht;
        int nr;
        eenTocht = new Tocht();
        nr = mijnBak.voegToe(eenTocht);
        return nr;
    }
    public CGTime beeindigTocht(int nr)
    {
        Tocht eenTocht;
        CGTime eenDuur;
        eenTocht = mijnBak.geefTocht(nr);
        eenTocht.beeindig();
        eenDuur = eenTocht.geefDuur();
        return eenDuur;
    }
    public int geefAantalBeeindigdeTochten()
    {
        int aantalBTochten;
        aantalBTochten = mijnBak.geefAantalBeeindigdeTochten();
        return aantalBTochten;
    }
    public CGTime geefGemiddeldeDuur()
    {
        CGTime eenGemDuur;
        eenGemDuur = mijnBak.geefGemiddeldeDuur();
        return eenGemDuur;
    }
}