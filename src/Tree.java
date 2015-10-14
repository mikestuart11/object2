import java.util.*;

/**
 * Created by Mike on 9/24/2015.
 */

public class Tree<String> {
    private Node<String> root;

    public Tree(String rootData) {
        root = new Node();
        root.data = rootData;
        root.children = new ArrayList();
    }

    public static class Node<String> {
        private String data;
        private Node<String> parent;
        private List<Node<String>> children;
    }
}

