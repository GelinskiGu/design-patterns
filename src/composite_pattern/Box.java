package composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component {
    private final List<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public double getPrice() {
        return components.stream()
                .mapToDouble(Component::getPrice)
                .sum();
    }
}
