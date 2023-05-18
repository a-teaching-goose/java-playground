import java.util.List;
import java.util.Random;

public class RandomItemPicker<T> {
    private final Random random;

    public RandomItemPicker() {
        random = new Random();
    }

    public T pick(List<T> items) {
        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("The list of items cannot be null or empty.");
        }

        int randomIndex = random.nextInt(items.size());
        return items.get(randomIndex);
    }
}