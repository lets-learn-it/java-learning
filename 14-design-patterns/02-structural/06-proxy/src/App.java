interface Image {
    void display();
}


class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        System.out.println("loading image from disk " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }
}


class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        System.out.println("diplaying proxyimage: " + filename);
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        Image img = new ProxyImage("someimage.jpg");

        img.display();
        System.out.println("Calling display again...");
        img.display();
    }
}
