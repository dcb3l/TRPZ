package org.example.lab8;

public class CompositeDemo {
    public static void main(String[] args) {
        Component leaf1 = new Leaf("A");
        Component leaf2 = new Leaf("B");
        Composite composite = new Composite("Root");
        composite.add(leaf1);
        composite.add(leaf2);
        Composite subComposite = new Composite("Sub");
        subComposite.add(new Leaf("C"));
        composite.add(subComposite);
        composite.operation();
    }
}
