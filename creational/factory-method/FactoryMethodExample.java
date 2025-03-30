// Product Interface
public interface Document {
    void open();
}

// Concrete Products
public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a Word document...");
    }
}

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a PDF document...");
    }
}

// Creator (Factory)
public abstract class DocumentFactory {
    public abstract Document createDocument();

    public void openDocument() {
        Document doc = createDocument();
        doc.open();
    }
}

// Concrete Creators
public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

// Client Code
public class Main {
    public static void main(String[] args) {
        DocumentFactory factory;

        String fileType = "pdf"; // Imagine this comes from user input

        if ("word".equalsIgnoreCase(fileType)) {
            factory = new WordDocumentFactory();
        } else if ("pdf".equalsIgnoreCase(fileType)) {
            factory = new PdfDocumentFactory();
        } else {
            throw new IllegalArgumentException("Unsupported file type.");
        }

        factory.openDocument();
    }
}
