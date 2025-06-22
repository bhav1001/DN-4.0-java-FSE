public class Main2 {
    public static void main(String[] args) {
        System.out.println("--- Demonstrating Factory Method Pattern ---");


        System.out.println("--- Processing Word Document ---");
        DocumentFactory wordFactory = new WordDocumentFactory();
        wordFactory.processDocument();

        System.out.println("--- Processing PDF Document ---");
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        pdfFactory.processDocument();

        System.out.println("--- Processing Excel Document ---");
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        excelFactory.processDocument();

        System.out.println("--- Direct Document Creation Example ---");
        Document newWordDoc = new WordDocumentFactory().createDocument();
        newWordDoc.open();
        newWordDoc.save();
        newWordDoc.close();
        System.out.println("Directly created Word Document operations complete.\n");

        System.out.println("--- Factory Method Pattern Demonstration Complete ---");
    }
}