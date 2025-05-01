interface Storage {
    void read();

    void write();
}


class AzureBlob implements Storage {
    @Override
    public void read() {
        System.out.println("Reading from Azure Blob");
    }

    @Override
    public void write() {
        System.out.println("Writing to Azure Blob");
    }
}


class S3 implements Storage {
    @Override
    public void read() {
        System.out.println("Reading from S3");
    }

    @Override
    public void write() {
        System.out.println("Writing to S3");
    }
}


abstract class ThumbnailManager {
    protected Storage storage;

    protected ThumbnailManager(Storage storage) {
        this.storage = storage;
    }

    abstract public void update(String url);
}


class EncryptedThumbnailMgr extends ThumbnailManager {
    public EncryptedThumbnailMgr(Storage storage) {
        super(storage);
    }

    @Override
    public void update(String url) {
        System.out.println("updating thumbnail " + url);
        storage.write();
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        Storage s1 = new AzureBlob();
        Storage s2 = new S3();

        ThumbnailManager tm1 = new EncryptedThumbnailMgr(s1);
        ThumbnailManager tm2 = new EncryptedThumbnailMgr(s2);

        tm1.update("pskp");

        tm2.update("pskp_95");
    }
}
