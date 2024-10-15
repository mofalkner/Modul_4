import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class JSONExporter implements Exporter
{
    @Override
    public void export(ArrayList<Artikel> artikelliste)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("[");
        for (int i = 0; i < artikelliste.size(); i++) {
            Artikel artikel = artikelliste.get(i);
            String Datum = sdf.format(artikel.getAblaufdatum().getTime());

            System.out.println("{");
            System.out.println("   \"Nummer\": " + artikel.getNummer() + ",");
            System.out.println("   \"Bezeichnung\": " + artikel.getBezeichnung() + ",");
            System.out.println("   \"Einkaufspreis\": " + artikel.getEinkaufspreis() + ",");
            System.out.println("   \"Ablaufdatum\": " + Datum + ",");
            System.out.println("   \"Kategorienummer\": " + artikel.getKategorienummer());

            if (i < artikelliste.size())
            {
                System.out.println("},");

            }
            else if (i == artikelliste.size())
            {
                System.out.println("}");
            }
        }
        System.out.println("]");
    }
}