import java.util.ArrayList;
import java.util.List;

public class JSONExporter implements Exporter
{
    @Override
    public void export(ArrayList<Artikel> artikelliste)
    {
        System.out.println("[");
        for (int i = 0; i < artikelliste.size(); i++)
        {
            Artikel artikel = artikelliste.get(i);
            System.out.println(" {");
            System.out.println("   \"Nummer\": " + artikel.getNummer() + ",");
            System.out.println("   \"Bezeichnung\": \"" + artikel.getBezeichnung() + "\",");
            System.out.println("   \"Einkaufspreis\": " + artikel.getEinkaufspreis() + ",");
            System.out.println("   \"Ablaufdatum\": \"" + artikel.getAblaufdatum() + "\",");
            System.out.println("   \"Kategorienummer\": " + artikel.getKategorienummer());
            System.out.println(i < artikelliste.size() - 1 ? " }," : " }");
        }
        System.out.println("]");
    }
}