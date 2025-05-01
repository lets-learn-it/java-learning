import java.util.ArrayList;
import java.util.List;

interface HotDrink {
    void consume();
}


class Tea implements HotDrink {
    @Override
    public void consume() {
        System.out.println("This tea is delicious");
    }
}


class Coffee implements HotDrink {
    @Override
    public void consume() {
        System.out.println("This coffee is delicious");
    }
}


interface HotDrinkFactory {
    HotDrink prepare(int amount);
}


class TeaFactory implements HotDrinkFactory {
    @Override
    public HotDrink prepare(int amount) {
        System.out.println("put in tea bag, boil water. pour " + amount + "ml, add lemon, enjoy");
        return new Tea();
    }
}


class CoffeeFactory implements HotDrinkFactory {
    @Override
    public HotDrink prepare(int amount) {
        System.out.println(
                "Grind some beans, boil water, pour " + amount + "ml, add cream-sugar, enjoy");
        return new Coffee();
    }
}


class HotDrinkMachine {
    private List<Pair<String, HotDrinkFactory>> namedFactories = new ArrayList<>();
}


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
