package org.example.lab8;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private final String name;
    private final List<Component> children = new ArrayList<>();
    public Composite(String name) {
        this.name = name;
    }
    public void add(Component component) {
        children.add(component);
    }
    public void remove(Component component) {
        children.remove(component);
    }
    @Override
    public void operation() {
        System.out.println("Composite: " + name);
        for (Component child : children) {
            child.operation();
        }
    }
}
