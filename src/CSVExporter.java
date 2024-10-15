import java.util.ArrayList;
import java.util.List;

public class CSVExporter implements Exporter
{
    @Override
    public void export(ArrayList<Artikel> artikelliste)
    {
        System.out.println("Nummer;Bezeichnung;Einkaufspreis;Ablaufdatum;Kategorienummer");
        for (Artikel artikel : artikelliste)
        {
            System.out.println(artikel.getNummer() + ";" + artikel.getBezeichnung() + ";" + artikel.getEinkaufspreis() + ";" + artikel.getAblaufdatum() + ";" + artikel.getKategorienummer());
        }
    }
}