public abstract class DocumentFactory {

    public abstract Document createDocument();

    public void processDocument() {
        Document document = createDocument();
        document.open();
        document.save();
        document.close();
        System.out.println("Document processed successfully.\n");
    }
}