public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        System.out.println("Creating Excel Document using ExcelDocumentFactory.");
        return new ExcelDocument();
    }
}
