
interface Target {
    void request();
}


// Adaptee - incompatible interface
class Adaptee {
    public void specificRequest() {
        System.out.println("Called specificRequest() in Adaptee");
    }
}


// Adapter makes Adaptee compatible with Target
class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        // Delegate the call to Adaptee
        adaptee.specificRequest();
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);
        adapter.request();
    }
}
