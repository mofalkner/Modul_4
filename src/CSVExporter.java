import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class CSVExporter implements Exporter
{
    @Override
    public void export(ArrayList<Artikel> artikelliste)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Nummer;Bezeichnung;Einkaufspreis;Ablaufdatum;Kategorienummer");
        for (Artikel artikel : artikelliste)
        {
            String Datum = sdf.format(artikel.getAblaufdatum().getTime());
            System.out.println(artikel.getNummer() + ";" + artikel.getBezeichnung() + ";" + artikel.getEinkaufspreis() + ";" + Datum + ";" + artikel.getKategorienummer());
        }
    }
}