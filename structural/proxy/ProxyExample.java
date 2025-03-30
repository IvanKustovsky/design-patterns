// Subject Interface
interface Image {
    void display();
}

// RealSubject (Heavy Object)
class HighResolutionImage implements Image {
    private final String fileName;

    public HighResolutionImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading high-resolution image from disk: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying high-resolution image: " + fileName);
    }
}

// Proxy (Virtual Proxy)
class ImageProxy implements Image {
    private final String fileName;
    private HighResolutionImage realImage;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new HighResolutionImage(fileName); // Lazy loading
        }
        realImage.display();
    }
}

// Client Code
public class Main {
    public static void main(String[] args) {
        Image image1 = new ImageProxy("nature_photo.jpg");
        Image image2 = new ImageProxy("cityscape.jpg");

        System.out.println("Images are created, but not loaded yet.\n");

        image1.display(); // Loading and displaying nature_photo.jpg
        System.out.println();
        image2.display(); // Loading and displaying cityscape.jpg
        System.out.println();
        image1.display(); // Only displaying nature_photo.jpg, as it's already loaded
    }
}
