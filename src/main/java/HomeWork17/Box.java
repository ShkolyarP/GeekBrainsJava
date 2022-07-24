package HomeWork17;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    List<T> basket = new ArrayList<>();

    public void addToBox(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            basket.add(fruit);
        }
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T o : basket) {
            weight += o.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<T> box) {
        return box.getWeight() == this.getWeight();
    }

    public void emptyTo(Box<T> box) {
        box.basket.addAll(this.basket);
        basket.clear();
    }
}
