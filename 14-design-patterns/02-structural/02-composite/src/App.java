import java.util.ArrayList;
import java.util.List;

interface INode {
    void show(String indent);
}


class File implements INode {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void show(String indent) {
        System.out.println(indent + "- File: " + name);
    }
}


class Folder implements INode {
    private String name;
    private List<INode> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(INode node) {
        children.add(node);
    }

    @Override
    public void show(String indent) {
        System.out.println(indent + "+ Folder: " + name);
        for (INode node : children) {
            node.show(indent + " ");
        }
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        INode n1 = new File("file1.txt");
        INode n2 = new File("file2.txt");

        Folder f1 = new Folder("Documents");
        f1.add(n1);
        f1.add(n2);

        Folder root = new Folder("Root");
        root.add(f1);
        root.add(new File("README.md"));

        root.show("");
    }
}
