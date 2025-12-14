import java.util.ArrayList;
public class PrinterTest {
    public static void main(String[] args) {
        ArrayList<Printable> documentos = new ArrayList<>();

        documentos.add(new Book("Homem Aranha - Eternamente Jovem", "Stefan Petrucha", 317, 2021));
        documentos.add(new Image("spiderman", "120x120", ".jpg" ));
        documentos.add(new Report("Vendas 2024", "Financeiro", "31/12/2024"));

        for (Printable doc: documentos){
            System.out.println("Imprimindo " + doc.getDocumentType() + ":");
            doc.print();
            System.out.println();
        }

        for (Printable doc: documentos){
            System.out.println(doc.getContent());
        }
    }
}
