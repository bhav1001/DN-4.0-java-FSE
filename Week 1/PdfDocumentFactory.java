public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        System.out.println("Creating PDF Document using PdfDocumentFactory.");
        return new PdfDocument();
    }
}