public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        System.out.println("Creating Word Document using WordDocumentFactory.");
        return new WordDocument();
    }
}