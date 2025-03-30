import java.util.ArrayList;
import java.util.List;

// Visitor Interface
interface DocumentVisitor {
    void visit(PdfDocument pdf);
    void visit(WordDocument word);
    void visit(ExcelDocument excel);
}

// Concrete Visitor 1: Exporter
class Exporter implements DocumentVisitor {
    @Override
    public void visit(PdfDocument pdf) {
        System.out.println("Exporting PDF document: " + pdf.getContent());
    }

    @Override
    public void visit(WordDocument word) {
        System.out.println("Exporting Word document: " + word.getContent());
    }

    @Override
    public void visit(ExcelDocument excel) {
        System.out.println("Exporting Excel document: " + excel.getContent());
    }
}

// Concrete Visitor 2: Printer
class Printer implements DocumentVisitor {
    @Override
    public void visit(PdfDocument pdf) {
        System.out.println("Printing PDF document: " + pdf.getContent());
    }

    @Override
    public void visit(WordDocument word) {
        System.out.println("Printing Word document: " + word.getContent());
    }

    @Override
    public void visit(ExcelDocument excel) {
        System.out.println("Printing Excel document: " + excel.getContent());
    }
}

// Element Interface
interface Document {
    void accept(DocumentVisitor visitor);
    String getContent();
}

// Concrete Element: PDF Document
class PdfDocument implements Document {
    private final String content;

    public PdfDocument(String content) {
        this.content = content;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getContent() {
        return content;
    }
}

// Concrete Element: Word Document
class WordDocument implements Document {
    private final String content;

    public WordDocument(String content) {
        this.content = content;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getContent() {
        return content;
    }
}

// Concrete Element: Excel Document
class ExcelDocument implements Document {
    private final String content;

    public ExcelDocument(String content) {
        this.content = content;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getContent() {
        return content;
    }
}

// Client Code
public class Main {
    public static void main(String[] args) {
        List<Document> documents = new ArrayList<>();
        documents.add(new PdfDocument("PDF Content"));
        documents.add(new WordDocument("Word Content"));
        documents.add(new ExcelDocument("Excel Content"));

        DocumentVisitor exporter = new Exporter();
        DocumentVisitor printer = new Printer();

        System.out.println("Exporting Documents:");
        documents.forEach(doc -> doc.accept(exporter));

        System.out.println("\nPrinting Documents:");
        documents.forEach(doc -> doc.accept(printer));
    }
}
